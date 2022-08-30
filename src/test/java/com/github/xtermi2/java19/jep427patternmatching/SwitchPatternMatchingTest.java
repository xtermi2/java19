package com.github.xtermi2.java19.jep427patternmatching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchPatternMatchingTest {

    @Test
    void test_small_Triangle() {
        SwitchPatternMatching.Shape s = new SwitchPatternMatching.Triangle(99);

        final String res = SwitchPatternMatching.testTriangle(s);

        assertThat(res)
                .isEqualTo("Small triangle");
    }

    @Test
    void test_large_Triangle() {
        SwitchPatternMatching.Shape s = new SwitchPatternMatching.Triangle(200);

        final String res = SwitchPatternMatching.testTriangle(s);

        assertThat(res)
                .isEqualTo("Large triangle");
    }

    @Test
    void test_no_Triangle() {
        SwitchPatternMatching.Shape s = new SwitchPatternMatching.Rectangle();

        final String res = SwitchPatternMatching.testTriangle(s);

        assertThat(res)
                .isEqualTo("Non-triangle");
    }

    @Test
    void test_null_Triangle() {
        SwitchPatternMatching.Shape t = null;

        final String res = SwitchPatternMatching.testTriangle(t);

        assertThat(res)
                .isEqualTo("null");
    }
}