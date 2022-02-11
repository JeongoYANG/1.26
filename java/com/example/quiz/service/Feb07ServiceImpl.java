package com.example.quiz.service;
import java.util.Scanner;
import java.util.Random;
/**
 * packageName: com.example.service
 * fileName   : Feb07Service
 * author     : yangjeongo
 * date       : 2022-02-07
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07         yangjeongo        최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {
    Random random = new Random();
    @Override
    public void dice(Scanner scanner) {
        int answer = (int) (Math.random () * 6);
        int input = 0;
        while (true) {
            System.out.println ("1과 6사이 값을 입력하세요");
            input = scanner.nextInt ();
            if (input < answer) {
                System.out.println ("주사위 : "+answer);
                System.out.println ("오답입니다.");
            } else if (input > answer) {
                System.out.println ("주사위 : "+answer);
                System.out.println ("오답입니다.");
            }
            else if(input==answer){
                System.out.println ("주사위 : "+answer);
                System.out.println ("정답입니다.");
                break;
            }
        }
    }
    @Override
    public void rps(Scanner scanner) {
        int user = 0;
        int com = (int)(Math.random()*3);
        System.out.println("가위바위보 게임");
        System.out.println("0.가위 1.바위 2.보 선택");
        user = scanner.nextInt();
        String[] str ={"가위","바위","보"};
        System.out.println("컴퓨터 : "+str[com]+", 사용자 : "+str[user]);
        switch (com-user){
            case 1: case -2:
                System.out.println("컴퓨터 승");break;
            case 2: case -1:
                System.out.println("사용자 승");break;
            default:
                System.out.println("비김");break;
        }
    }
    @Override
    public void getPrime(Scanner scanner) {

        System.out.println("소수 구하기 게임");
    }
    @Override
    public void leapYear(Scanner scanner) {

        System.out.println("년도를 입력해주세요");
        int s = scanner.nextInt();
        if(s % 4 == 0 && s % 100 != 0 || s % 400 == 0){
            System.out.println(s + "년은 윤년이다.");}
        else {
            System.out.println(s + "년은 평년이다.");
        }
    }
    @Override
    public void numberGolf(Scanner scanner) {
        System.out.println("숫자 맞추기 게임");
        int num = random.nextInt(100) + 1;
        while (true) {
            int value = scanner.nextInt();
            if (num == value) {
                System.out.println("정답 입니다.");
                break;
            } else if (num < value) {
                System.out.println("정답이 아닙니다. 난수가 더 작습니다.");
            } else {
                System.out.println("정답이 아닙니다. 난수가 더 큽니다");
            }
        }
    }
}