package com.bitkakao.web.bitkakao.bitkakaocirclearea;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoCircleAreaDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  반지름을 받아 원넓이를 계산하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

import java.util.Scanner;

public class BitKakaoCircleAreaDemo {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        BitKakaoCircleAreaApp bitKakaoCircleAreaApp =new BitKakaoCircleAreaApp();
        System.out.println("반지름을 입력하세요");
        int half = scanner.nextInt();
        String result = bitKakaoCircleAreaApp.circleArea(half);
        System.out.println(result);


    }
}
