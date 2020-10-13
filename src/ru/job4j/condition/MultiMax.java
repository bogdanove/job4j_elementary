package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        int rsl = first > second ? first : second;
        return result = rsl > third ? rsl : third;
    }
}
