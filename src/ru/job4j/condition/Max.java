package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left;
        boolean compare = left > right;
        result = compare ? left : right;
        return result;
    }
}
