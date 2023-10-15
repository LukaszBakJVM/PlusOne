package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        StringBuilder str = new StringBuilder();


        for (Integer i : digits) {
            str.append(i);
        }
        Integer integer = Integer.valueOf(str.toString());
        integer++;
        String s1 = String.valueOf(integer);
        int[] tab = new int[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            tab[i] = Integer.parseInt(String.valueOf(s1.charAt(i)));

        }


        return tab;
    }
}