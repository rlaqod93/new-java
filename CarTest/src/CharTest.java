public class CharTest {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("ch = " + ch); //A

        int a = 'A';
        System.out.println("a = " + a); //65
        //A라는 char의 아스키코드값으로 변환되서 나온다.
        int b = 'B' + 1;
        System.out.println("b = " + b); //67 -> B
        int c = 'B';
        System.out.println("b = " + (char)b); // C
        //System.out.println("b = " + (char) + b); -> 형변환

        //'가' 라는 한글 한 문자를 변수에 저장하고 출력하시요.
        char han = '가';
        System.out.println("han = " + han); //가
        int hanD = '가';
        System.out.println("hanD = " + hanD); //44032
        int hanU = '\uAC00';
        System.out.println("hanU = " + hanU); //44032
        int hanU1 = '\uAC00';
        System.out.println("(char)hanU1 = " + (char)hanU1); //가

        //대문자 'A'를 문자 'a'로 변환하여 출력하시요
        char upper = 'A';
        char lower = (char)(upper + 32);
        System.out.println("lower = " + lower); //a

        char lower1 = 'u'; //117
        int upper1 = (char)(lower1 - 32); //117 - 35 = 85(u)
        System.out.println("upper1 = " + (char)upper1); //U

        //'1' + '2' = 3 이 나오도록 프로그래밍 하시요.
        int date = '1' + '2';
        System.out.println("date = " + date); //99
        // 0 = 아스키코드는 48
        char i = '1'; // 49 - 48 = 1
        char j = '2'; // 50 - 48 = 2
        //int sum = (i -48) + (j-48);
        int sum = (i-'0') + (j-'0');
        System.out.println("sum = " + sum); //3



    }
}
