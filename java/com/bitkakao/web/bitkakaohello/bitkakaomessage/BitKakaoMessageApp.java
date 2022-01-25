package com.bitkakao.web.bitkakaohello.bitkakaomessage;


/**
 * packageName: com.bitkakao.web
 * fileName        : BitKakaoMessageApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            :  전화번호,메세지를 입력받아 출력하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */

public class BitKakaoMessageApp {
    String phonenum="";
    String message="";

    public String getMessage(String phonenum, String message){
        this.phonenum=phonenum;
        this.message=message;

        return String.format("%s 에 %s 를 보냈습니다!!",
                this.phonenum, this.message);
    }

}
