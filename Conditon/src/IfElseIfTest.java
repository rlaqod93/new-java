import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        //if elseif 조건문
        //80점 이상의 학생 중에서 90점 이상은 A반 , 85점 이상은 B반,
        //그렇지 않으면 C반으로 편성하고 점수가 80미만이면 불합격 처리하는 프로그램을 작성하세요.
        //단 점수는 0 ~ 100점 사이 값으로 입력받는다.
        Scanner scan = new Scanner(System.in);
        //int score = 84;
        System.out.print("점수를 입력하세요 : ");
        int score = scan.nextInt();
        if (score >= 0 && score <= 100) {
            if (score >= 80) {
                if (score >= 90) {
                    System.out.println("A반입니다.");
                } else if (score >= 85) {
                    System.out.println("B반입니다.");
                } else {
                    System.out.println("C반입니다.");
                }
            }else{
                System.out.println("불합격입니다.");
            }
        }else{
            System.out.println("유효한 점수가 아닙니다.");
        }

        scan.close();
    }
}
