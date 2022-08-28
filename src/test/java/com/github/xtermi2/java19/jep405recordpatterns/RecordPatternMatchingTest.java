package com.github.xtermi2.java19.jep405recordpatterns;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RecordPatternMatchingTest {

    @Test
    void printSum_should_return_sum_when_point_is_given() {
        Object o = new RecordPatternMatching.Point(2, 5);

        final int sum = RecordPatternMatching.printSum(o);

        assertThat(sum)
                .isEqualTo(7);
    }

    @Test
    void printSum_should_return_default_on_unknown_type() {
        Object o = "foo";

        final int sum = RecordPatternMatching.printSum(o);

        assertThat(sum)
                .isEqualTo(-1);
    }
}