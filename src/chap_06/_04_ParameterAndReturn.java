package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }
    //Ctrl + alt + L => 자동정렬

    public static int powerByEXP(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        int retval = getPower(3);
        System.out.println(retval);

        retval = powerByEXP(3,4);
        System.out.println(retval);
    }
}
