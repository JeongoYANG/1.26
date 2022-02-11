package com.example.algorithm.controller;

import java.util.Scanner;

/**
 * packageName: com.example.algorithm.controller
 * fileName   : AlgorithmController
 * author     : yangjeongo
 * date       : 2022-02-08
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08         yangjeongo        최초 생성
 */
public class AlgorithmController {
    public void execote(Scanner scanner){
        while (true){
            System.out.println("[담당], 1.홍정명, 2.노홍주, 3.양정오, 4.전종형, 5.정경준");
            switch (scanner.next()){
                case "0":
                    System.out.println("종료");return;
                case "1":
                    System.out.println("[홍정명] 0.종료, 1.Stack, 2.Queue, 3.Dfs, 4.Bfs");break;
            }
        }
    }
}
