package chap_06;
//메소드 오버로딩
//이름이 같은 메소드 여러개 만드는 것
//그냥 받는형식별로 만드는거임

public class _05_Overloading {
    public static int getPower(int number) { //
        int result = number * number;
        return result;
    }
    //Ctrl + alt + L => 자동정렬

    public static int getPower(String strNum){ //문자열 전달받아 정수로 반환
        int number = Integer.parseInt(strNum); //메소드 오버로딩 사용 / 메소드 이름은 위에랑 똑같은데 형식이 다름
        return number * number ;
    }

    public static int getPower(int num, int exp) { //위에랑 이름이 같아도 메소드 오버로딩가능 /인자개수가 다르기에
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3,4));

    }
}
