package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot6ThenMinus1() {
        int[] data = new int[]{5, 10, 3};
        int element = 6;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot3ThenMinus1() {
        int[] data = new int[]{4, 8, 10, 5, 12};
        int element = 3;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas8Then0() {
        int[] data = new int[]{4, 8, 10, 5, 12};
        int element = 12;
        int result = FindLoop.indexOf(data, element);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}