package com.bitkakao.web.bitkakaohello;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoHelloApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  네임명 고정출력 및 계산기 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

public class BitKakaoHelloApp {
    String hello="HELLO CALC WORLD~!";
    int num1=0;
    int num2=0;
    String op="";

    public String helloworld(int num1,int num2,String op){
        this.num1=num1;
        this.num2=num2;
        this.op=op;

        int result = num1 + num2;

        return String.format("%d %s %d 은(는) %s 입니다.",
                this.num1,this.op,this.num2,result);
    }
}
