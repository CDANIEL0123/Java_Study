package chap_02;

public class _03_Operator04 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true이면 true (괜찮은 식당)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두 있어야(true) true

        System.out.println((5>3) && (3>1));
        System.out.println((5>3) && (3<1));

        System.out.println((5>3) || (3<1));
        System.out.println((5<3) || (3<1));

        //논리 부정 연산자
        System.out.println(!true); //반대값 출력

    }
}
