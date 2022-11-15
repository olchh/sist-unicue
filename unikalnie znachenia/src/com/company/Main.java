package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("wuw");
        list.add("wuw");
        list.add("fuf");
        list.add("pup");
        list.add("quq");

        System.out.println("\nИзначальный список: " + list);

        Set<String> set = new LinkedHashSet<>(list);
        System.out.println("\nУникальный список: " + set);
    }
}
