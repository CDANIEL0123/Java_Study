package chap_06;
//        System.out.println(s.substring(7)); //인덱스 기준 7번쨰 위치부터 시작 / 즉  7번째부터 잘라줌
//        System.out.println(s.substring(s.indexOf("Java"))); //위라인이랑 같은 뜻
//        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작위치부터해서 .위치 직전까지 잘라줌

import java.io.PrintStream;

public class _09_Quiz {

    public static String privacy(String Name,int num){
        String priv_Name = Name.substring(0,num);

        for (int i = num; i < Name.length(); i++) {
            priv_Name += "*";
        }
        return priv_Name;

    }


    public static void main(String[] args) {
        String name = "나코딩";
        String id = "950123-1111111";
        String phone = "010-1234-1234";

        System.out.println("이름 : " + privacy(name,1));
        System.out.println("주민등록번호 : " + privacy(id,8));
        System.out.println("전화번호 : "+ privacy(phone,9));
    }
}
