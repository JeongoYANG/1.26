package com.example.phone.domain;


/**
 * packageName: com.example.phone.domain
 * fileName   : Phonee
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
public class Phonee {
    protected String kind;
    protected String company;
    protected String call;
    public Phonee(String kind,String company){
        this.kind = kind;
        this.company = company;
    }

    public String getKind() {
        return kind;
    }


    public String getCompany() {
        return company;
    }


    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    @Override
    public String toString() {
        return "Phonee{" +
                "kind='" + kind + '\'' +
                ", company='" + company + '\'' +
                ", call='" + call + '\'' +
                '}';
    }
}
