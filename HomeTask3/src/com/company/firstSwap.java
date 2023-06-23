package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class firstSwap {

    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (!map.containsKey(key)) {
                map.put(key, i);
            } else {
                int j = map.get(key);
                if (j != -1) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                    map.put(key, -1);
                }
            }
        }
        return strings;
    }

    public static Map<String, String>  firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String s : strings) {
            String firstChar = s.substring(0, 1);
            if (!map.containsKey(firstChar)) {
                map.put(firstChar, s);
            } else {
                String value = map.get(firstChar) + s;
                map.put(firstChar, value);
            }
        }
        return map;
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String s : strings) {
            map.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return map;
    }




    public static void main(String[] args) {
        String[] strings1 = {"ab", "ac"};
        System.out.println("Original array: " + Arrays.toString(strings1));
        String[] result1 = firstSwap(strings1);
        System.out.println("Modified array: " + Arrays.toString(result1));

        String[] strings2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println("Original array: " + Arrays.toString(strings2));
        String[] result2 = firstSwap(strings2);
        System.out.println("Modified array: " + Arrays.toString(result2));



        String[] list1 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        System.out.println("Original array: " + Arrays.toString(list1));
        Map<String, String> outcome1 = firstChar(list1);
        System.out.println("Modified array: " + Arrays.toString(new Map[]{outcome1}));

        String[] list2 = {"salt", "tea", "soda", "toast"};
        System.out.println("Original array: " + Arrays.toString(list2));
        Map<String, String> outcome2 = firstChar(list2);
        System.out.println("Modified array: " + Arrays.toString(new Map[]{outcome2}));



        String[] group1 = {"code", "bug"};
        System.out.println("Original array: " + Arrays.toString(group1));
        Map<String, String> final1 = pairs(group1);
        System.out.println("Modified array: " + Arrays.toString(new Map[]{final1}));

        String[] group2 = {"man", "moon", "main"};
        System.out.println("Original array: " + Arrays.toString(group2));
        Map<String, String> final2 = pairs(group2);
        System.out.println("Modified array: " + Arrays.toString(new Map[]{final2}));

        String[] group3 = {"man", "moon", "good", "night"};
        System.out.println("Original array: " + Arrays.toString(group3));
        Map<String, String> final3 = pairs(group3);
        System.out.println("Modified array: " + Arrays.toString(new Map[]{final3}));








    }





    }

