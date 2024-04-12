import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        //if 조건문 사용방법
        int x = 10;
        if (x > 0) {
            System.out.println("양수입니다.");
            //조건이 맞으면 양수입니다.
        }
        System.out.println("종료");
        //위에 조건이 틀리면 그냥 종료입니다만 나옴.

        //정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력하세요.
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();
        if (num % 7 == 0){
            System.out.println("num = " + num + "은 7의 배수입니다.");
        }
        System.out.println("종료");

        //나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하세요.
        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();
        if (age >= 19) {
            System.out.println(age + "성인입니다.");
        }
        System.out.println("종료");

        scan.close();

    }
}
