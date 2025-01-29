package chap_04;

public class _05_For {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            System.out.println("어서오세요. 나코입니다." + i);
        }

        //짝수만 출력
        for (int i = 0; i <10 ; i+=2) {
            System.out.println(i);
        }

        //1부터 10까지 합
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum+=i;
            System.out.println("현재까지 합은 "+sum);
        }

    }
}
