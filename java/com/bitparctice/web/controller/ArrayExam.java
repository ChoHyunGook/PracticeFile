package com.bitparctice.web.controller;

import java.util.Scanner;

/**
 * packageName: com.bitparctice.web.controller
 * fileName        : ArrayExam
 * author           : chohyungook
 * date               : 2022-02-06
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-06         chohyungook        최초 생성
 */
public class ArrayExam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String[] arr = {"권혜민", "조현국", "김진영", "김한슬", "서성민",
                "정렬", "해시", "힙", "완전탐색", "DP",
                "스택", "깊이우선탐색 ", "그래프", "탐욕법", "이중탐색",
                "큐", "너비우선탐색"};
        String s = "";

        System.out.println("Q1. 팀별 과제를 출력하세요 ");
        for (int i =5;i<arr.length;i++){
            s+=arr[i] + ",";
        }System.out.println(s);
        s="";

        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요. 예) 김진영, 힙, 그래프 ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("김진영")) {
                for (int j = 0; j < 3; j++) {
                    s += arr[i + j * 5] + ",";
                }
                if (i == 17) {
                    break;
                }
            }
        }
        System.out.println(s);
        s="";

        System.out.println("Q3. 큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람: 권혜민 ");
        for (int i =0;i<arr.length;i++){
            String l="";
            System.out.println("담당한 과목을 적으세요");
            l=scanner.next();
            for(i=5;i<10;i++){
            if(arr[i].equals(l)){
                s+=arr[i]+"를 담당한사람: "+arr[i-5];
                }
            }for(i=10;i<15;i++){
                if (arr[i].equals(l)){
                    s+=arr[i]+"를 담당한사람: "+arr[i-10];
                }
            }for(i=15;i<17;i++){
                if(arr[i].equals(l)){
                    s+=arr[i]+"를 담당한사람: "+arr[i-15];
                }
            }
        }
        System.out.println(s);
        }
    }
