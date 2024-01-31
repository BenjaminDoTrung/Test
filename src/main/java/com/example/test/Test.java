package com.example.test;

import javax.swing.text.Document;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length: ");
        int length = scanner.nextInt();
        System.out.println("Input target: ");
        int target = 0;
        int target1 = scanner.nextInt();
        if (target1 >= (-109) && target1 <= 109) {
            target = target1;
        }
        System.out.println("Input element of the array");
        TreeSet<Integer> nums = new TreeSet<Integer>();
        for (int i = 0; i < length; i++) {
            System.out.println("Element " + (i + 1) + ":");
            int value = scanner.nextInt();
            if (value >= (-109) && value <= 109) {
                nums.add(value);

            } else {
                System.out.println("phần tử không được để trống và phải nằm trong khoảng [-109; 109] mời nhập lại: ");
                int value1 = scanner.nextInt();
                if (value1 >= (-109) && value <= 109) {
                    nums.add(value1);
                } else {
                    System.out.println("Nhập lại");
                    i--;
                }
            }
        }
        List<Integer> arrayNums = new ArrayList<>();
        for (Integer s : nums) {
            arrayNums.add(s);
        }
        System.out.println("Input: nums" + nums.toString() + ", target = " + target);
        for (int i = 0; i < arrayNums.size() - 1; i++) {
            for (int j = i + 1; j < arrayNums.size(); j++) {
                if (arrayNums.get(i) + arrayNums.get(j) == target) {
                    System.out.println("Output: [" + i + "," + j + "]");
                }
            }
        }
    }
}
