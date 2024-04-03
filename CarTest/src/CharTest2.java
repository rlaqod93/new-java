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
        /*int q = '1' - '0';
        int w = '2' - 48;
        int e = '3';
        int z = '4';
        int t = '5';
        int sun = q + w + (e-'0') + (z-'0') + (t-'0'); */

        //위 아래 둘다 결과 값은 같다
        
        // '1'+'2'+'3'+'4'+'5' = 15 가 나오도록 프로그래밍 하시요.
        int sun = 0;
        sun = sun + ('1' - '0');
        sun = sun + ('2' - '0');
        sun = sun + ('3' - '0');
        sun = sun + ('4' - '0');
        sun = sun + ('5' - '0');
        System.out.println("sun = " + sun);

    }
}
