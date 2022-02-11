package com.example.quiz.controller;

import com.example.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.democontroller
 * fileName   : TempController
 * author     : yangjeongo
 * date       : 2022-02-03
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03         yangjeongo        최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner) {
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();


        while (true) {
            System.out.println("0.Exit, 1).2월6일, 2).2월7일, 3).2월8일, 4).2월10일");
            switch (scanner.next()) {
                case "0":
                    System.out.println("0Exit.");
                    return;
                case "1":
                    System.out.println("1).2월6일");
                    System.out.println("[소메뉴]\n 0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n 4.팀원별 과제 수");
                    String[] arr = {"홍정명", "노홍주", "양정오", "전종현", "정경준",
                            "깊이", "정렬", "그래프", "해시", "완전탐색"
                            , "스택", "힙", "이분탐색", "탐욕법", "DP"};
                    System.out.println("[MENU] 0.EXIT\n " +
                            "1. 팀별 과제 출력 \n" +
                            "2. 팀장이 맡은 과제만 출력 \n" +
                            "3. 큐를 담당한 사람을 출력 \n" +
                            "4. 팀원별 과제 수를 출력\n");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            feb06Service.quiz1(arr);
                            break;
                        case "2":
                            feb06Service.quiz2(arr);
                            break;
                        case "3":
                            feb06Service.quiz3(arr);
                            break;
                        case "4":
                            feb06Service.quiz4(arr);
                            break;
                    }
                    break;


                case "2":
                    System.out.println("2).2월7일");
                    while (true) {
                        System.out.println("(MENU) 0.Exit, 1.Dice, 2.Rps 3.GetPrime, 4.LeapYear, 5.NumberGolf");
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("Exit,");
                                return;
                            case "1":
                                System.out.println("Dice");
                                feb07Service.dice(scanner);
                                break;
                            case "2":
                                System.out.println("Rps");
                                feb07Service.rps(scanner);
                                break;
                            case "3":
                                System.out.println("GetPrime");
                                feb07Service.getPrime(scanner);
                                break;
                            case "4":
                                System.out.println("LeapYear");
                                feb07Service.leapYear(scanner);
                                break;
                            case "5":
                                System.out.println("NumberGolf");
                                feb07Service.numberGolf(scanner);
                                break;
                            default:
                                System.out.println("잘못 입력하셨습니다.");
                        }
                    }

                case "3":
                    System.out.println("3).2월8일");
                    while (true) {
                        System.out.println("(메뉴), 0.종료, 1.lotto, 2.baseball, 3.booking, 4.bank, 5.gugudan");
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("0.종료");
                                return;
                            case "1":
                                System.out.println("1.lotto");
                                feb08Service.lotto(scanner);
                                break;
                            case "2":
                                System.out.println("2.baseball");
                                feb08Service.baseball(scanner);
                                break;
                            case "3":
                                System.out.println("3.booking");
                                feb08Service.booking(scanner);
                                break;
                            case "4":
                                System.out.println("4.bank");
                                feb08Service.bank(scanner);
                                break;
                            case "5":
                                System.out.println("5.gugudan");
                                feb08Service.gugudan(scanner);
                                break;
                            default:
                                System.out.println("잘못 입력하셨습니다.");
                        }
                    }
                case "4":
                    System.out.println("4).2월10일");
                    while (true){
                        System.out.println("(메뉴) 0.종료, 1.bobbleSort,insertionSort,selectionSort" +
                                "2.quickSort,mergeSort, 3.magicSquare, 4.zigzag, 5.rectangleStarPrint.triangleStarPrint");
                        switch (scanner.next()){
                            case "0":
                                System.out.println("종료");
                                return;
                            case "1":
                                System.out.println("1.bobbleSort,insertionSort,selectionSort");

                        }
                    }
            }
        }
    }
}














