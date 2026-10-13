package com.codegym;

import java.security.NoSuchAlgorithmException;

public class Calculator {

    public static int sum(int a, int b) { 
        return a + b; 
    }

    public static int sub(int a, int b) { 
        return a - b; 
    }

    public static int mul(int a, int b) { 
        return a * b; 
    }

    public static int divide(int a, int b) throws NoSuchAlgorithmException {
        if (b == 0) {
            throw new NoSuchAlgorithmException("Lỗi toán học: Phép chia cho 0 không hợp lệ!");
        }
        return a / b;
    }
}