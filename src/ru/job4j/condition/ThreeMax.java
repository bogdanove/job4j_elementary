package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > first && third < second) {
            result = second;
        }
        if (third > result) {
            result = third;
        }
        return result;
    }
}