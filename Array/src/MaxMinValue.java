public class MaxMinValue {
    public static void main(String[] args) {
        //삼 항 연산자를 이용하여 정수 2개 중 MaxValue와 MinValue와 출력하세요.
        int a = 20;
        int b = 10;

        //MinValue와
        int min = (a < b) ? a : b;
        System.out.println("min = " + min); //10

        //MaxValue와
        int max = (a > b) ? a : b;
        System.out.println("max = " + max); //20

    }
}
