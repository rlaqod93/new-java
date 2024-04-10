public class ArrayMake {
    public static void main(String[] args) {
        //정수 5개를 저장 할 배열을 생성하시요.
        //배열(object)
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        a[4] = 10;
        System.out.println("a.length = " + a.length);//배열의 길이 a.length = 10
        System.out.println("a[0] = " + a[0]);//a[0] = 10
        System.out.println("a[1] = " + a[1]);//a[1] = 10
        System.out.println("a[2] = " + a[2]);//a[2] = 10
        System.out.println("a[3] = " + a[3]);//a[3] = 10
        System.out.println("a[4] = " + a[4]);//a[4] = 10

        for(int i = 0; i < a.length; i++){
            a[i] = 10;
            System.out.print("i = " + i + "\t");
            System.out.print("a[i] = " + a[i] + "\t");
            //i = 0	a[i] = 10	i = 1	a[i] = 10	i = 2	a[i] = 10
            //i = 3	a[i] = 10	i = 4	a[i] = 10

        }


        float[] f = new float[5];//길이가 고정

        //Book b1,b2,b3;
        //Book[] b = new Book[3];//책 3권을 저장할 배열을 생성


    }
}
