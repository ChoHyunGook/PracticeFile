package com.bitkakao.web.bitkakao.bitkakaologin;

/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoLoginDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  아이디,패스워드,이름,생일을 입력받아 출력하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

import java.util.Scanner;

public class BitKakaoLoginDemo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BitKakaoLoginApp bitKakaoLoginApp = new BitKakaoLoginApp();
        System.out.println(" ID : ");
        System.out.println(" PASSWORD : ");
        System.out.println(" NAME : ");
        System.out.println(" BIRTHDAY : ");
        String id = scan.next();
        String pw = scan.next();
        String name = scan.next();
        int bir= scan.nextInt();

        String result = bitKakaoLoginApp.login(id,pw,name,bir);

        System.out.println(result);
    }
}
