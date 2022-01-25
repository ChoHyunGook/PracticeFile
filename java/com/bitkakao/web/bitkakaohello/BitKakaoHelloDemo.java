package com.bitkakao.web.bitkakaohello;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoHelloDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  네임명 고정출력 및 계산기 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

import java.util.Scanner;

public class BitKakaoHelloDemo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        BitKakaoHelloApp bitKakaoHelloApp= new BitKakaoHelloApp();
        System.out.println(bitKakaoHelloApp.hello);
        System.out.println("첫번째숫자");
        System.out.println("두번째숫자");
        System.out.println("부호");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        String op = scanner.next();
        String result = bitKakaoHelloApp.helloworld(num1,num2,op);
        System.out.println(result);

    }
}
