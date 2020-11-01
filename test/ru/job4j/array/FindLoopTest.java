package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[] {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then5() {
        int[] input = new int[] {1, 2, 3, 4, 7, 6, 8};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas5ThenNotFind() {
        int[] input = new int[] {1, 2, 3};
        int value = 4;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}