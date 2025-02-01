package chap_06;

public class _07_VariableScope {
    public static void main(String[] args) {

        {
            int j = 0; //지역변수
        }
        //System.out.println(j); //j는 지역변수로 선언되었기에 여기서 호출안됨
    }
}
