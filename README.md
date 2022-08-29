![Java CI](https://github.com/xtermi2/java19/workflows/Java%20CI/badge.svg)


# Schedule

- 2022/08/25 Final Release Candidate
- 2022/09/20 General Availability

# Java 19 Features

- [JEP 405: Record Patterns (Preview)](https://openjdk.org/jeps/405)
    - Enhance the Java programming language with record patterns to deconstruct record values.
    - see example `RecordPatternMatching.java`
- [JEP 422: Linux/RISC-V Port](https://openjdk.org/jeps/422)
    - Port of the JDK to Linux/RISC-V Architecture.
- [JEP 424:	Foreign Function & Memory API (Preview)](https://openjdk.java.net/jeps/424)
    - Introduce an API by which Java programs can interoperate with code and data outside of the Java runtime. Combination of 2 APIs introduced in previous JDKs:
    - Foreign-Memory Access API (incubator in 14, 15 and 16)
    - Foreign Linker API (incubator in 16)
    - see example `ForeignFunctionAndMemoryAPI.java`
- [JEP 425:	Virtual Threads (Preview)](https://openjdk.java.net/jeps/425)
    - Virtual threads are lightweight threads that dramatically reduce the effort of writing, maintaining, and observing high-throughput concurrent applications.
    - see example ``
- [JEP 426:	Vector API (Fourth Incubator)](https://openjdk.java.net/jeps/426)
    - see example `Scalar.java`
    - update to third incubator:
      - Enhance the API to load and store vectors to and from MemorySegments as defined by JEP 424: Foreign Function & Memory (FFM) API (Preview).
      - Add two new cross-lane vector operations, compress and its inverse expand, together with a complementary vector mask compress operation.
      - Expand the supported set of bitwise integral lanewise operations.
- [JEP 427:	Pattern Matching for switch (Third Preview)](https://openjdk.java.net/jeps/427)
    - see example `SwitchPatternMatching.java`
    - The enhancements since the second preview are:
      - TODO
- [JEP 428:	Structured Concurrency (Incubator)](https://openjdk.java.net/jeps/428)
    - TODO

##### Other References

- https://openjdk.org/projects/jdk/19/
