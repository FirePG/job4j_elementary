package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 6, 4, 5, 3};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 1;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 6, 3, 4, 5, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2to3() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 2;
        int destination = input.length - 3;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 4, 3, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to4() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 3;
        int destination = input.length - 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 5, 4, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap4to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 4;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 4, 6, 5};
        assertThat(result).containsExactly(expected);
    }
}
