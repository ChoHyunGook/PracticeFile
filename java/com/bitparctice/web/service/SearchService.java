package com.bitparctice.web.service;

import com.bitparctice.web.domain.SearchDTO;

/**
 * packageName: com.bitparctice.web.mainsite
 * fileName        : MainsiteDemo
 * author           : chohyungook
 * date               : 2022-01-25
 * desc            : 구글 메인창에 검색창에 검색하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         chohyungook        최초 생성
 */
public class SearchService {
    public String getSearch(SearchDTO search){
        String res = String.format("%s을(를) 검색합니다.",search.getSearch());
        return res;
    }
}
