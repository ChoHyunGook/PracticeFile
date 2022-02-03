package com.bitparctice.web.domain;

/**
 * packageName: com.bitparctice.web.domain
 * fileName        : ChangeDTO
 * author           : chohyungook
 * date               : 2022-01-31
 * desc            : 300원 커피 자판기 거스름돈
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-31         chohyungook        최초 생성
 */
public class ChangeDTO {
    public static String MAIN_NAME="300원 커피 자판기 거스름돈";
    public static int coffee =300;
    int input=0;

    public static int getCoffee(){
        return coffee;
    }
    public void setCoffee(int coffee){
        this.coffee=coffee;
    }
    public int getInput(){
        return input;
    }
    public void setInput(int input){
        this.input=input;
    }


}
