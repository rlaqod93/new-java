public class ArithmeticOperTest {
    public static void main(String[] args) {
        //나누기(/)와 나머지(%) 연산자의 활용(정수의 자릿수 구하기)
        int digit = 3625;
        System.out.println("일의 자릿수 = " + digit%10); //5
        System.out.println("십의 자릿수 = " + digit/10%10); //2
        System.out.println("백의 자릿수 = " + digit/100%10); //6
        System.out.println("천의 자릿수 = " + digit/1000%10); //3

        System.out.println();

        int num = 2579; // 2+5+7+9=?
        System.out.println("일의 자릿수 = " + num%10); //9
        System.out.println("십의 자릿수 = " + num/10%10); //7
        System.out.println("백의 자릿수 = " + num/100%10); //5
        System.out.println("천의 자릿수 = " + num/1000%10); //2
        System.out.println(num%10 + num/10%10 + num/100%10 + num/1000%10); //23

        //짝수(0) , 홀수(1) / 배수
        int su = 5;
        if(su % 2 == 0){
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }
        //홀수입니다.
    }
}
