package com.github.xtermi2.java19.jep427patternmatching;

public class SwitchPatternMatching {

    static class Shape {
    }

    static class Rectangle extends Shape {
    }

    static class Triangle extends Shape {

        private final int area;

        Triangle(int area) {
            this.area = area;
        }

        int getArea() {
            return area;
        }
    }

    static String testTriangle(Shape s) {
        return switch (s) {
            case null -> "null";
            case Triangle t
                    when t.getArea() > 100 -> "Large triangle";
            case Triangle t -> "Small triangle";
            default -> "Non-triangle";
        };
    }
}
