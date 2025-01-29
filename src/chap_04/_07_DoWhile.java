package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2; //사람 키 만큼은 뺴야하는 상황

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재이동거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다." + move + "반복문#1");

        //키가 엄청나게 큰사람인경우?
        height = 25;
        while (move + height < distance) { //처음부터 조건문이 거짓이기에 반복문 수행 X
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재이동거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다." + move + "반복문#2");

        //DO WHILE 반복문
        do { //조건상관없이 일단 문장수행후 반복할지 결정(while 조건으로)
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다."+move);
    }
}
