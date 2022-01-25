package com.bitkakao.web.bitkakaohello.bitkakaomessage;


/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaomessageDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  전화번호,메세지를 입력받아 출력하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

import java.util.Scanner;

public class BitKakaomessageDemo {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        BitKakaoMessageApp bitKakaoMessageApp = new BitKakaoMessageApp();
        System.out.println("전화번호를 입력하세요!");
        System.out.println("보내실 메세지를 입력하세요!");
        String phonenum = scanner.next();
        String message =scanner.next();
        String result = bitKakaoMessageApp.getMessage(phonenum,message);
        System.out.println(result);




    }
}
