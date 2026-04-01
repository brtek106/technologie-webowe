package pl.bartek.dzielnikiliczby;

import java.util.ArrayList;

class Calculator {
    public static ArrayList<Integer> divider(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.abs(number); i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = divider(30);
        System.out.println(list);
    }
}

