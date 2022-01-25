package com.bitkakao.web.bitkakao.bitkakaocirclearea;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoCircleAreaApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  반지름을 받아 원넓이를 계산하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */



public class BitKakaoCircleAreaApp { int half = 0;
    float pi = 3.14f;

    public String circleArea(int half) {
        this.half = half;

        double result = half * half * pi;

        return String.format("반지름 %d의 원넓이는 %d 입니다",this.half,result);

    }
}
