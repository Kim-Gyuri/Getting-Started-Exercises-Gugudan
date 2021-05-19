package exercises;

import java.util.Scanner;

public class Gugudan_v1 {
    public void gugu(int n) {
        for(int i=1; i<10; i++){
            System.out.println(n+"x" +i +"= " +(n*i));
        }
    }
}
class GugudanTest {
    public static void main(String[] args) {
        String PROMPT ="원하는 구구단>";
        Scanner sc = new Scanner(System.in);

        while(true) {

            Gugudan_v1 gugudan = new Gugudan_v1();
            System.out.println(PROMPT);
            int input = sc.nextInt();
            gugudan.gugu(input);


        }


    }
}
