package com.bitkakao.web.bitkakao.bitkakaocalc;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoCalcApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  덧셈 계산기 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

public class BitKakaoCalcApp{
    int num1= 0;
    int num2= 0;
    String op= "";

    public String kakaocalc(int num1,int num2,String op){
        this.num1=num1;
        this.num2=num2;
        this.op=op;
        int result = num1 + num2;

        return String.format("%d,%s,%d 의 값은 %d 입니다.",
                this.num1,this.op,this.num2,result);
    }
}
