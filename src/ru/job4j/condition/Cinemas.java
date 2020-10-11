package ru.job4j.condition;

public class Cinemas {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
        }

        public static void main(String[] args) {
            Cinemas.permission(true, true);
            Cinemas.permission(true, false);
            Cinemas.permission(false, true);
            Cinemas.permission(false, false);
        }
    }

