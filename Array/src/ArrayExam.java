public class ArrayExam {
    public static void main(String[] args) {
        //정수 1개를 저장할 변수를 선언 하세요.
        int a;
        a = 10;

        //정수 3개를 저장할 변수를 선언하세요.
        int[] b = new int[3];
        b[0] = 10;
        b[1] = 20;
        b[2] = 30;
        System.out.print("b[0] = " + b[0] + "\t");
        System.out.print("b[1] = " + b[1] + "\t");
        System.out.println("b[2] = " + b[2]);
        //b[0] = 10	b[1] = 20	b[2] = 30


        int[] x = {1,2,3,4,5};//배열의 초기화
        for (int i = 0; i < x.length; i++) {
            System.out.print("x[i] = " + x[i]);
            //x[i] = 1x[i] = 2x[i] = 3x[i] = 4x[i] = 5
        }

    }
}
