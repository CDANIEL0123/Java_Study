package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffeess = {"아메리카노","카페모카","카푸치노","라떼"};

        for (int i = 0; i < coffeess.length; i++) { //숫자몰라도 배열의 길이로 순회
            System.out.println(coffeess[i]+" 하나 주세요");
        }


        //for-each 반복문
        for (String coffee : coffeess) { //coffeess 순서대로 순회하는데 그때그떄 coffee 변수에 넣어서 사용
            System.out.println(coffee+" 하나");
        }

    }
}
