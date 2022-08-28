package com.github.xtermi2.java19.jep424foreignfunctionsmemory;


import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.SegmentAllocator.implicitAllocator;


public class ForeignFunctionAndMemoryAPI {

    public static final ValueLayout.OfDouble C_DOUBLE = ValueLayout.JAVA_DOUBLE.withBitAlignment(64);
    public static final ValueLayout.OfInt C_INT = ValueLayout.JAVA_INT.withBitAlignment(32);


    public MemorySegment allocateArrayOffHeap() {
        System.out.println("An array of data");
        MemorySegment cDoubleArray = implicitAllocator().allocateArray(C_DOUBLE, new double[]{
                1.0, 2.0, 3.0, 4.0,
                1.0, 1.0, 1.0, 1.0,
                3.0, 4.0, 5.0, 6.0,
                5.0, 6.0, 7.0, 8.0
        });

        for (long i = 0; i < (4 * 4); i++) {
            if (i > 0 && i % 4 == 0) {
                System.out.println();
            }
            final double v = cDoubleArray.get(C_DOUBLE, i * 8);
            System.out.printf(" %f ", v);
        }
        return cDoubleArray;
    }

    public int getPid() throws Throwable {
        var linker = Linker.nativeLinker();
        SymbolLookup stdlib = linker.defaultLookup();
        // Using a MethodHandle
        MethodHandle getpidMH = linker.downcallHandle(stdlib.lookup("getpid").get(), FunctionDescriptor.of(C_INT));
        int pid = (int) getpidMH.invokeExact();
        System.out.printf("MethodHandle calling getpid() (%d)\n", pid);
        return pid;
    }
}
