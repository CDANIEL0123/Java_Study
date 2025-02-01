package chap_06;

public class _03_Return {
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-1234";
        return phoneNumber;
    }//기존 void는 반환값임 여기서는 string이 반환값

    public static String getAdderss(){
        return "광교동";
    }
    
    
    public static void main(String[] args) {
        //반환값
        String num = getPhoneNumber();
        System.out.println("호텔번호: " + num);

        String add = getAdderss();
        System.out.println("호텔주소: " + add);

        System.out.println(getAdderss());
    }
}
