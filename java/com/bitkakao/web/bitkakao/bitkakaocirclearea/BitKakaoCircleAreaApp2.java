package com.bitkakao.web.bitkakao.bitkakaocirclearea;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoCircleArea2App
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  반지름과 원주율을 받아 원넓이를 계산하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

public class BitKakaoCircleAreaApp2 {
    int half;
    double pi;

    public String circleArea2(int half,double pi){
        this.half=half;
        this.pi=pi;

        double result= half*half*pi;

        return String.format("반지름 %d와 원주율 %3f의 원넓이는 %3f 입니다.",
                this.half,this.pi,result);
    }

}
