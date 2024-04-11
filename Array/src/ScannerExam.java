import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서정보 입력받기
        Scanner scan = new Scanner(System.in);
        System.out.println("책");

        System.out.print("제목 : ");
        String title = scan.nextLine();
        System.out.println("제목 = " + title);

        System.out.print("가격 : ");
        int price = scan.nextInt();
        System.out.println("가격 = " + price + "원");

        scan.nextLine();//버퍼 비우기

        System.out.print("출판사 : ");
        String company = scan.nextLine();
        System.out.println("출판사 = " + company);

        System.out.print("저자 : ");
        String author = scan.nextLine();
        System.out.println("저자 = " + author);

        System.out.print("페이주수 : ");
        int page = scan.nextInt();
        System.out.println(page + "페이지");

        scan.nextLine();//버퍼 비우기

        System.out.print("ISBN : ");
        String isbn = scan.nextLine();
        System.out.println("도서번호 = " + isbn);

        scan.close();

    }
}
