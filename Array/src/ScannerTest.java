import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//키보드 장치에서 읽을수 있음
        System.out.print("정수를 입력하세요 : ");
        int num = scan.nextInt();//블럭상태
        System.out.println("num = " + num);

        System.out.print("실수를 입력하세요 : ");
        float f = scan.nextFloat();//블럭상태
        System.out.println("f = " + f);

        System.out.print("문자를 입력하세요 : ");//"A" , "ABC"
        String str = scan.next();
        System.out.println("str = " + str);//공백을 치면 공백전만 읽어드림

        scan.nextLine();//버퍼 비우기(스트림 비우기)

        System.out.print("문자를 입력하세요 : ");//"A" , "ABC"
        String str1 = scan.nextLine();
        System.out.println("str = " + str1);//라인까지 쓰면 엔터전까지 다 나옴

    }
}
