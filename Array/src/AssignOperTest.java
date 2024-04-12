public class AssignOperTest {
    public static void main(String[] args) {
/*      int a , b;
        a = 10;
        b = 4;
        System.out.println(a+=b); //14
        System.out.println(a-=b); //6
        System.out.println(a*=b); //40
        System.out.println(a/=b); //2
        System.out.println(a%=b); //2*/

        //아래를 수행 후 결과 값은 얼마인가
        //1식 증가하는 수식을 써보세요
        int a = 1;
        a++;
        ++a;
        a = a + 1;
        a += 1;
        System.out.println("a = " + a); //5

        int b = 7;
        b--;
        --b;
        b = b - 1;
        b -= 1;
        System.out.println("b = " + b); //3
    }
}
