package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int ineur = 140;
        int expectedeur = 2;
        int outeur = Converter.rubleToDollar(ineur);
        boolean passedeur = expectedeur == outeur;
        System.out.println("140 rubles are 2. Test result : " + passedeur);
        int indol = 240;
        int expectdol = 4;
        int outdol = Converter.rubleToDollar(indol);
        boolean passeddol = expectdol == outdol;
        System.out.println("240 rubles are 4. Test result : " + passeddol);
    }
}
