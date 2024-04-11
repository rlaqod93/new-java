public class TwoDimArrayTest {
    public static void main(String[] args) {
        //2행 4열의 정수형 배열을 생성하세요.(2차원배열)
        int[][] a = new int[2][4];
        a[0][0] = 10;
        a[0][1] = 10;
        a[0][2] = 10;
        a[0][3] = 10;
        a[1][0] = 10;
        a[1][1] = 10;
        a[1][2] = 10;
        a[1][3] = 10;
        System.out.println(a.length);//2
        System.out.println(a[0].length);//4
        System.out.println(a[1].length);//4
        System.out.println("a[0] = " + a[0][0] + "\t" + a[0][1] + "\t" + a[0][2] + "\t" + a[0][3] + "\t" );
        //a[0] = 10	10	10	10
        System.out.println("a[0] = " + a[1][0] + "\t" + a[1][1] + "\t" + a[1][2] + "\t" + a[1][3] + "\t" );
        //a[0] = 10	10	10	10
        
    }
}
