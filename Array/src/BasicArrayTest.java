public class BasicArrayTest {
    public static void main(String[] args) {
        //실수 3개를 저장할 배열을 생상하고 값을 저장하고 출력(기본배열)
        float[] f = {24.5f,45.6f,77.65f};
        for (int i = 0; i < f.length; i++){
            System.out.print("f[i] = " + f[i] + "\t");
            //f[i] = 24.5	f[i] = 45.6	f[i] = 77.65
        }

        System.out.println();

        //책 3권을 저장 할 배열을 생성하고 책3권의 데이터를 저장하고 출력
        //책1권
        Book[] book = new Book[3];//객체배열(Object배열)
        book[0] = new Book();
        book[0].title = "자바";
        book[0].price = 30000;
        book[0].company = "금강";
        book[0].author = "김메일";
        book[0].page = 500;
        book[0].isbn = "1189456123";
//        System.out.println("book[0] = " + book[0].title + "\t" + book[0].price + "\t" +
//                book[0].company + "\t" + book[0].author + "\t" + book[0].page + "\t" +
//                book[0].isbn);
        //book[0] = 자바	30000	금강	김메일	500	1189456123
        
        //책2권
        book[1] = new Book();
        book[1].title = "자바스크립트";
        book[1].price = 40000;
        book[1].company = "금강리";
        book[1].author = "김메일2";
        book[1].page = 510;
        book[1].isbn = "2189456123";
//        System.out.println("book[1] = " + book[1].title + "\t" + book[1].price + "\t" +
//                book[1].company + "\t" + book[1].author + "\t" + book[1].page + "\t" +
//                book[1].isbn);
        //book[1] = 자바스크립트	40000	금강리	김메일2	510	2189456123

        //책3권
        book[2] = new Book();
        book[2].title = "오라클";
        book[2].price = 30000;
        book[2].company = "금강리더";
        book[2].author = "김메일3";
        book[2].page = 520;
        book[2].isbn = "3189456123";
//        System.out.println("book[2] = " + book[2].title + "\t" + book[2].price + "\t" +
//                book[2].company + "\t" + book[2].author + "\t" + book[2].page + "\t" +
//                book[2].isbn);
        //book[2] = 오라클	30000	금강리더	김메일3	520	3189456123
        
        //반복문으로 책 3권을 출력
        for (int i = 0; i < book.length; i++) {
            System.out.println("book[i] = " + book[i].title + "\t" + book[i].price + "\t" +
                    book[i].company + "\t" + book[i].author + "\t" + book[i].page + "\t" +
                    book[i].isbn);

        //book[i] = 자바	30000	금강	김메일	500	1189456123
        //book[i] = 자바스크립트	40000	금강리	김메일2	510	2189456123
        //book[i] = 오라클	30000	금강리더	김메일3	520	3189456123
        }
    }
}
