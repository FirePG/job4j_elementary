package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortEven() {
        int[] data = new int[] {2, 4, 10, 8, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 6, 8, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortMultiplesOf3() {
        int[] data = new int[] {9, 6, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 6, 9};
        assertThat(result).containsExactly(expected);
    }
}