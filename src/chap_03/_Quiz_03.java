package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        //주민등록번호 뒷자리의 첫자리까지만 출력하는 코드 만들기
        //System.out.println(s.substring(s.indexOf("Java"))); //참고
        //System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작위치부터해서 .위치 직전까지 잘라줌
        
        String jumin = "950123-1234567";

        //System.out.println(jumin.substring(jumin.indexOf(0), jumin.indexOf(8)));
        System.out.println(jumin.substring(0,8));

        jumin = "123456-4564564";
        System.out.println(jumin.substring(0,jumin.indexOf("-")+2)); //-직전까지 끊으니 2칸 더해줘야함
        
        
        
    }
}
