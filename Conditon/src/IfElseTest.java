import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        //if else 조건문
        int x = 10;
        if (x >= 0){
            System.out.println("0 or 양수");
        }else {
            System.out.println("음수");
        }

        //정수 1개를 입력 받아 짝수인지 홀수 인지를 판단하는 프로그램을 만드세요.
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int su = scan.nextInt();
        if (su % 2 == 0) {
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }

        //입력 받은 수가 12의 배수인지를 출력하는 코드를 작성하세요.
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        if (num % 12 == 0){
            System.out.println("12의 배수입니다.");
        }else {
            System.out.println("12의 배수가 아닙니다.");
        }

        //년도를 입력 받아서 해당 년도가 윤년인지 아닌지 판단하여 출력하세요.
        //윤년 구하는방법 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년 또는 400으로 떨어지면 윤년
        System.out.print("년도를 입력하세요 : ");
        int day = scan.nextInt();
        if ((day % 4 == 0 && day % 100 != 0) || (day % 400 == 0)) {
            System.out.println(day + "년은 윤년입니다.");
        }else {
            System.out.println(day + "년은 평년입니다.");
        }
        System.out.println("종료");

        scan.close();
    }
}
