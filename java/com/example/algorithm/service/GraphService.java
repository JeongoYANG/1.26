package com.example.algorithm.service;

/**
 * packageName: com.example.algorithm.service
 * fileName   : GraphService
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
public interface GraphService {
    int node(int n, int[][] edge);
    int ranking(int n, int[][] results);
    int rooms(int[] arrows);
}
