package com.bitparctice.web.domain;

/**
 * packageName: com.bitparctice.web.circleareacalc
 * fileName        : CircleAreaCalcApp
 * author           : chohyungook
 * date               : 2022-01-30
 * desc            : 반지름과 원주율을 입력받아 원넓이를 계산해주는 프로그램
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-30         chohyungook        최초 생성
 */
public class CircleAreaCalcDTO {
    public static String MAIN_NAME="원넓이 계산기";
    private int half;
    private double pi;

    public int getHalf(){
        return half;
    }
    public void setHalf(int half){
        this.half=half;
    }
    public double getPi(){
        return pi;
    }
    public void setPi(double pi){
        this.pi=pi;
    }
}
