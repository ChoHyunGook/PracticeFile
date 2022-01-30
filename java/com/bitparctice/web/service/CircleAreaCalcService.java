package com.bitparctice.web.service;

import com.bitparctice.web.domain.CircleAreaCalcDTO;

/**
 * packageName: com.bitparctice.web.circleareacalc
 * fileName        : CircleAreaCalcService
 * author           : chohyungook
 * date               : 2022-01-30
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-30         chohyungook        최초 생성
 */
public class CircleAreaCalcService {
    public String getCircleAreaCalc(CircleAreaCalcDTO circleArea){
        double result = circleArea.getHalf()*circleArea.getHalf()
                *circleArea.getPi();
        return String.format("반지름 %d와 원주율 %3f의 원넓이는 %3f입니다."
                ,circleArea.getHalf(),circleArea.getPi(),result);
    }

}
