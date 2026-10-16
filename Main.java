package com.codegym;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  KIỂM THỦ THƯ VIỆN MATH-LIB TRÊN VS CODE  ");
        System.out.println("==========================================");

        int num1 = 20;
        int num2 = 4;

        System.out.println("Phép cộng (" + num1 + " + " + num2 + ")  = " + Calculator.sum(num1, num2));
        System.out.println("Phép trừ  (" + num1 + " - " + num2 + ")  = " + Calculator.sub(num1, num2));
        System.out.println("Phép nhân (" + num1 + " * " + num2 + ")  = " + Calculator.mul(num1, num2));

        try {
            System.out.println("Phép chia (" + num1 + " / " + num2 + ")  = " + Calculator.divide(num1, num2));
            
            // Thử nghiệm phép chia cho 0 để kiểm tra bắt Exception
            System.out.println("\nThử nghiệm phép chia cho 0:");
            Calculator.divide(num1, 0);

        } catch (NoSuchAlgorithmException e) {
            System.err.println("-> Bắt được ngoại lệ thành công: " + e.getMessage());
        }
    }
}