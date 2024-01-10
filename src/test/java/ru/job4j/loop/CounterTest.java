package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void when0to10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when3to8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1to1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1to1Then5050() {
        int start = 1;
        int finish = 100;
        int expected = 5050;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when7to5Then0() {
        int start = 7;
        int finish = 5;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromZeroToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTenToTwoThenMinusTwentyEight() {
        int start = -10;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = -28;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToEightThenZero() {
        int start = 10;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTwoToOneHundredThenTwoThousandFiveHundredFifty() {
        int start = 2;
        int finish = 100;
        int result = Counter.sumByEven(start, finish);
        int expected = 2550;
        assertThat(result).isEqualTo(expected);
    }
}