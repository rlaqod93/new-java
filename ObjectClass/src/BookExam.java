public class BookExam {
    public static void main(String[] args) {
        //정수 1개를 저장할 변수를 선언하시요.
        //1:변수 2:자료형 3:선언해서데이터를 집어넣는 할당 -> 프로그래밍의 3대요소
        int a;
        a = 10;

        //책 1권을 저장할 변수를 선언 하시요.
        Book book;
        //book = 자바,30000,금강,홍길도,70,java-123...이렇게 한번에 넣을수가 없음
        book = new Book();//객체를 생성한다.

        // 한 권의 책 데이터를 저장하기 위해서 객체를 생성하시요.(인스턴스를 만드시요)
        Book b = new Book();//객체를 생성하는 new Book(); 이부분이 중요함
        //b.title -> .은 참조연산자 b는 인스턴스변수 title을 인스턴스
        //객체들을 핸들링하는걸 객체지향프로그래밍이라고한다.
        b.title = "자바";
        b.price = 30000;
        b.company = "패스트컴퍼스";
        b.author = "홍길동";
        b.page = 70;
        b.isbn = "JAVA-1234";
        //Book안에 데이터를 다 넣음

        System.out.println(b.title + "\t" + b.price + "\t" + b.company + "\t" + b.author
        + "\t" + b.page + "\t" + b.isbn);
        //자바	30000	패스트컴퍼스	홍길동	70	JAVA-1234

    }
}
