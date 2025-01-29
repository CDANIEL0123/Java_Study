package chap_02;

//키가 120 이상이면 탑승 가능
//키가 120 미만이면 탑승 불가능


public class _Quiz_02 {
    public static void main(String[] args) {
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int child_height = 125;

        String s = (child_height >= 120) ? "가능" : "불가능" ;

        System.out.println("키가 "+child_height+"이므로 탑승 " + s + "합니다");

    }
}
