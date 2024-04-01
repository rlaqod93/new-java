public class VDATest {
    public static void main(String[] args) {
        //q. [정수 : int] 한 개를 저장하기위해서 [변수를 선언] 하시오.
        int v;//변수선언 -> 기억공간이 만들어짐 int(크기와 타입)
        v = 10;//a 안에 10을 할당함
        System.out.println("v = " + v);

        //q. 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을
        //   곱하여 변수 c에 저장하시요.
        int a = 10; //변수 초기화
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);
        //q. sum이라는 변수에 1부터 5까지의 수를 누적해서 출력 하시요
        int sum = 0;
        sum = sum + 1; // 0 + 1
        sum = sum + 2; // 0 + 2
        sum = sum + 3; // 0 + 3
        sum = sum + 4; // 0 + 4
        sum = sum + 5; // 0 + 5
        System.out.println("sum = " + sum); // 15

    }
}
