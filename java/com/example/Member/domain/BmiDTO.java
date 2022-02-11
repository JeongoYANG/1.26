package com.example.Member.domain;


/**
 * packageName: com.example.bmi
 * fileName   : BmiApp
 * author     : yangjeongo
 * date       : 2022-01-25
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25         yangjeongo        최초 생성
 */
public class BmiDTO {
    public static String Bmi = "Bmi구하기";
    private final static BmiDTO bmiDTO = new BmiDTO();
    public BmiDTO(){}
    public static BmiDTO getInstance(){
        return bmiDTO;
    }
    private String name;
    private double tall;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}