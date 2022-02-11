package com.example.phone.domain;

import java.util.SplittableRandom;

/**
 * packageName: com.example.phone.domain
 * fileName   : CelPhone
 * author     : yangjeongo
 * date       : 2022-02-09
 * desc       :
 * 클래스변수 :
 * 파라미터,인스턴스변수 :
 * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-09         yangjeongo        최초 생성
 */
public class CelPhone extends Phonee{

    private boolean portable;
    private String move;
    public CelPhone (String kind, String company, String move  ){
        super(kind,company);
        this.move = move;



    }

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return String.format("%s 인 %s 제품을 사용해서 %s 라고 %s 동화한다."
        ,super.getKind(), super.getCompany(), super.getCall(), move);
    }
}
