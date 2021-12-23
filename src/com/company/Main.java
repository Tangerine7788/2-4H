package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя!");

        ArrayList<String>A = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String names = sc.next();
            A.add(names);


        }

        System.out.println("Список А-"+A);
        ArrayList<String>B = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String names = sc.next();
            B.add(names);

        }
        System.out.println("Список Б-"+B);
        ArrayList<String>C=new ArrayList<>();
        C.add(A.get(0));
        C.add(B.get(4));
        C.add(A.get(1));
        C.add(B.get(3));
        C.add(A.get(2));
        C.add(B.get(2));
        C.add(A.get(3));
        C.add(B.get(1));
        C.add(A.get(4));
        C.add(B.get(0));
        System.out.println("Список С-"+ C);
        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()- o2.length();
            }
        });
        System.out.println("Список С-"+C);

    }
}


