package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        String[][] shoes =  new String[10][2];
        int min_shoes= 250;

        for (int i = 0; i < shoes.length; i++) {
            shoes[i][0] = String.valueOf(min_shoes);
            min_shoes +=5;
        }

        for (int i = 0; i < shoes.length; i++) {
            System.out.println("사이즈"+ shoes[i][0]+"(재고있음)");
        }
    }
}
