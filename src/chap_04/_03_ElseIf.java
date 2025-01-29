package chap_04;

import sun.font.TrueTypeFont;

public class _03_ElseIf {
    public static void main(String[] args) {
        //조건문 Else If
        boolean morningCoffee = true;
        boolean hallabong = true;
        boolean mango = true;
        int hour = 15;

        if (hallabong) { //할라봉에이드 있으면 주문
            System.out.println("한라봉에이드 +1");
        } else if (mango) { //망고주스 있으면 주문
            System.out.println("망고주스 +1");
        } else { //다없으면 아아
            System.out.println("아이스아메리카노 +1");
        }


        hallabong = false;
        mango = false; //할라봉 망고주스 다 나감
        boolean orange = true; //오렌지주스도 있으면 사줘

        if (hallabong) { //할라봉에이드 있으면 주문
            System.out.println("한라봉에이드 +1");
        } else if (mango) { //망고주스 있으면 주문
            System.out.println("망고주스 +1");
        } else if (orange) {
            System.out.println("오렌지주스 +1");
        } else { //다없으면 아아
            System.out.println("아이스아메리카노 +1");
        }
    }
}
