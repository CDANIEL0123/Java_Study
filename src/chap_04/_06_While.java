package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 while
        //해당거리까지 몇번 발차기할줄 모를경우 사용
        int distance = 25; //목표 이동거리
        int move = 0 ; //현재 이동거리
        
        while (move < distance) { //현재 이동거리가 목표거리보다 작다는 조건이 참이면 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move +=3;
        }
        System.out.println("도착하였습니다."+move);
    }
}
