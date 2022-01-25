package com.bitkakao.web.bitkakao.bitkakaocirclearea;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoCircleArea2Demo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  반지름과 원주율을 받아 원넓이를 계산하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

import java.util.Scanner;

public class BitKakaoCircleAreaDemo2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        BitKakaoCircleAreaApp2 bitKakaoCircleAreaApp2=new BitKakaoCircleAreaApp2();
        System.out.println("반지름을 입력하세요.");
        System.out.println("원주율을 입력하세요.");
        int half= scanner.nextInt();
        double pi = scanner.nextFloat();
        String result = bitKakaoCircleAreaApp2.circleArea2(half,pi);
        System.out.println(result);

    }
}
