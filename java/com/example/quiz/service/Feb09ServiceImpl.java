package com.example.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.quiz.service
 * fileName   : Feb09ServiceImpl
 * author     : yangjeongo
 * date       : 2022-02-10
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-10         yangjeongo        최초 생성
 */
public class Feb09ServiceImpl implements Feb09Service{
    @Override
    public void bobbleSort() {

    }

    @Override
    public void insertionSort() {

    }

    @Override
    public void selectionSort() {

    }

    @Override
    public void quickSort() {

    }

    @Override
    public void mergeSort() {

    }

    @Override
    public void magicSquare() {

    }

    @Override
    public void zigzag() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =0,ct=0;
        int [][]ar = new int[n][n]; //제가 이해한것은 매트릭스가 이중배열이고 5 * 5 라고 생각했을때 총 25개의 공간이 생기는것이라고 이해하고 있습니다
                                    //근데 개념만 들었을때는 어떤 상황에 어떻게 응용하는것인지를 알기가 힘들어서 좀더 자세히 알고싶습니다

        while(ct<(n*2)-1){
            for(int a=0; a<n; a++){
                for(int b=0; b<n; b++){
                    if(a+b==ct){
                        if(ct%2==0){
                            ar[a][b] = ++num;
                        }else{
                            ar[b][a] = ++num;
                        }
                    }
                }
            }
            ct++;
        }
        for(int a=0; a<n; a++){
            for(int b=0; b<n; b++){
                System.out.printf("%2d ",ar[a][b]);
            } System.out.println("");
        }
    }

    @Override
    public void rectangleStarPrint() {

    }

    @Override
    public void triangleStarPrint() {

    }
}
