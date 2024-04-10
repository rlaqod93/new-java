public class ArrayTest {
    public static void main(String[] args) {
        //실수 5개를 저장 할 배열을 생성하고 모든 원소에 10을 저장하고 출력
        float[] f = new float[5];
        f[0] = 10.5f;
        f[1] = 15.5f;
        f[2] = 50.5f;
        f[3] = 70.5f;
        f[4] = 88.5f;
        for (int i = 0; i < f.length; i++) {
            System.out.print("f[i] = " + f[i] + "\t");
            //f[i] = 10.5 f[i] = 15.5 f[i] = 50.5 f[i] = 70.5 f[i] = 88.5
            
        }

        System.out.println();

        //정수 5개를 저장 할 배열을 생성하고 모든 원소에 10을 저장하고 출력
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++){
            a[i] = 10;
            System.out.print("a[i] = " + a[i] + "\t");
            //a[i] = 10	a[i] = 10	a[i] = 10	a[i] = 10	a[i] = 10
        }

        System.out.println();

        //정수 5개를 아래 처럼 배열에 초기화하고,index0번째와 index3번째 값을 더하여 출력
        int[] a1 = {10,20,30,40,50};
        for (int i = 0; i < a1.length; i++) {
            System.out.print("a1[i] = " + a1[i] + "\t");
            //a1[i] = 10	a1[i] = 20	a1[i] = 30	a1[i] = 40	a1[i] = 50
        }

        System.out.println();
        //index0번째와 index3번째 값을 더하여 출력
        int sum = a1[0] + a1[3];
        System.out.println("sum = " + sum);//sum = 50

        //배열의 길이를 구하여 출력
        System.out.println("a1.length = " + a1.length);//a1.length = 5

        int[] b = new int[3];
        System.out.print("b[0] = " + b[0] + "\t");
        System.out.print("b[1] = " + b[1] + "\t");
        System.out.println("b[2] = " + b[2]);
        //b[0] = 0	b[1] = 0	b[2] = 0
        
        float[] f1 = new float[3];
        System.out.print("f1[0] = " + f1[0] + "\t");
        System.out.print("f1[1] = " + f1[1] + "\t");
        System.out.println("f1[2] = " + f1[2]);
        //f1[0] = 0.0	f1[1] = 0.0	f1[2] = 0.0

        //char[]배열에 APPLE이라는 문자가 저장되어 있다. 대문자로 된 APPLE을 소문자 apple로 출력
        char[] c = {'A','P','P','L','E'};
        System.out.print((char)(c[0] + 32));
        System.out.print((char)(c[1] + 32));
        System.out.print((char)(c[2] + 32));
        System.out.print((char)(c[3] + 32));
        System.out.println((char)(c[4] + 32));//apple

        for (int i = 0; i < c.length; i++) {
            //전체적으로 (char)로 형변환을 해줌
            System.out.print((char)(c[i] + 32));//apple
            //형변환을 안해주고 +32을 하면 int로 전환되 숫자로 나옴
            //System.out.print(c[i] + 32);//97112112108101

        }

    }
}
