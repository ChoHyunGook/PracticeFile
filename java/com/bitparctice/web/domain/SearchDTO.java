package com.bitparctice.web.domain;

/**
 * packageName: com.bitparctice.web.mainsite
 * fileName        : MainsiteApp
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 구글 메인창에 검색창에 검색하는 앱
 * 클래스 변수 : MAIN_NAME
 * 인스턴스 변수 : search
 * 로컬 변수 : res
 * 파라미터 : search
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class SearchDTO {
    public static String MAIN_NAME = "GOOGLE";
    private String search = "";

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

}





