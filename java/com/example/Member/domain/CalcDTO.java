package com.example.Member.domain;
/**
 * packageName: com.example.calc
 * fileName   : CalcApp.java
 * author     : yangjeongo
 * date       : 2022-01-24
 * desc       : 숫자2개와 연산자를 받아 계산하는 앱
 *  * 클래스변수 :
 *  * 파라미터,인스턴스변수 :
 *  * 로컬변수 :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-24         yangjeongo        최초 생성
 */
public class CalcDTO {
    public static String CALC = "계산기";

    private final static CalcDTO calcDTO = new CalcDTO();

    private CalcDTO(){}

    public static CalcDTO getInstance(){
        return calcDTO;
    }

    private int num1;
    private int num2;
    private String opcode;



    public int getNum1(){return num1;}
    public void setNum1(int num1){this.num1 = num1;}
    public String getOpcode(){return opcode;}
    public void setOpcode(String opcode){this.opcode = opcode;}
    public int getNum2(){return num2;}
    public void setNum2(int num2){this.num2 = num2;}


        /*
        if(opcode.equals("+")){res = this.num1 + this.num2;
        }else
        if(opcode.equals("-")){res = this.num1 - this.num2;
        }else
        if(opcode.equals("*")){res = this.num1 * this.num2;
        }else
        if(opcode.equals("/")){res = this.num1 / this.num2;
        }else{
            res = 0;
        }*/
}
