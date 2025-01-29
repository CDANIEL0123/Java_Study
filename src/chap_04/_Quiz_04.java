package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour_price = 4000;
        int hour = 5;
        int max_price = 30000;
        boolean jang = true;
        boolean kyung = true;
        int sum_price = 0;

        for (int i = 0; i < hour; i++) {
            if(sum_price>=max_price){
                sum_price = 30000;
                break;
            }
            sum_price += hour_price;
        }
        if (jang || kyung) {
            sum_price /= 2;
        }
        System.out.println("최종 주차요금은"+sum_price+"입니다.");

    }
}
