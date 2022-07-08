package com.tak.absolute;

import java.util.Scanner;

public class Absolute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값을 입력하세요 : ");
        int n = sc.nextInt();

        if(n >= 0) {
            System.out.println("절댓값은 " + n + "입니다!");
        } else {
            System.out.println("절댓값은 " + -n + "입니다~");
        }

    }


}
