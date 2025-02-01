package chap_06;

public class _02_Parameter {
    public static void power(int number){
        int result = number * number;
        System.out.println(number+"의 제곱은"+result);
    }

    public static void powerByEXP(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println(num+"의" + exp+ "승은" +result);
    }

    public static void main(String[] args) {
        //전달값, 파라미터
        power(5);
        //argument(인수) : 5
        //parameter(매개변수) : power 함수에서의 number
        powerByEXP(3,5);
    }
}
