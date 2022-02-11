package com.example.quiz.service;

import java.util.Scanner;
import java.util.Random;

/**
* packageName: com.example.quiz.service
* fileName   : Feb08ServiceImpl
* author     : yangjeongo
* date       : 2022-02-08
* desc       :
* 클래스변수 :
* 파라미터,인스턴스변수 :
* 로컬변수 :
* ================================
*  DATE              AUTHOR        NOTE
* ================================
*  2022-02-08         yangjeongo        최초 생성
*/public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {
        int com[] = new int[3]; // 컴퓨터 숫자
        int user[] = new int[3]; // 사용자 숫자
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0; // 게임 횟수
        // 랜덤 숫자 생성
        while(com[0]==0) {
            com[0] = r.nextInt(10);
        }
        while(com[0]==com[1] || com[1]==0) {
            com[1] = r.nextInt(10);
        }
        while(com[1]==com[2] || com[2]==0) {
            com[2] = r.nextInt(10);
        }

        while(true) {

            int strike = 0;
            int ball = 0;
            for(int i=0; i<user.length; i++) {
                System.out.print((i+1)+"번째 수: ");
                user[i] = sc.nextInt();
                if(user[i] > 9 || user[i] <= 0) {
                    System.out.println("숫자 범위는 1~9 입니다.");
                }
            }
            for(int i=0; i<com.length; i++) {
                for(int j=0; j<user.length; j++) {
                    if(com[i] == user[j] && i==j) { // 숫자와 위치가 일치
                        strike++;
                    } else if(com[i] ==user[j] && i!=j) { // 위치는 다르나 숫자는 일치
                        ball++;
                    }
                }
            }
            System.out.println(strike+" 스트라이크 "+ball+" 볼 ");
            count++;
            if(strike == 3) {
                System.out.println("게임 끝\n" + count + "번째 시도 성공");
                break;
            }
        }
    }
    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
