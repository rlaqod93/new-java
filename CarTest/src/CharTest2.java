public class CharTest2 {
    public static void main(String[] args) {
        //'가'라는 한글 한 문자를 변수에 저장하고 출력하시요.
        char r = '가';
        System.out.println("r = " + r);

        //대문자 'A'를 문자 'a'로 변환하여 출력하시요.
        //char a = 'A' + 32;
        //System.out.println("a = " + a);
        int a = 65 + 32;
        System.out.println("a = " + (char)a);

        //'1'+'2' = 3이 나오도록 프로그래밍 하시요.
        int i = '1';
        int j = '2';
        int sum = (i -'0') + (j - '0');
        System.out.println("sum = " + sum);

        //'1'+'2'+'3'+'4'+'5' = 15 가 나오도록 프로그래밍 하시요.
        int q = '1' - '0';
        int w = '2';
        int e = '3';
        int z = '4';
        int t = '5';
        int sun = q + (w-'0') + (e-'0') + (z-'0') + (t-'0');
        System.out.println("sun = " + sun);

    }
}
