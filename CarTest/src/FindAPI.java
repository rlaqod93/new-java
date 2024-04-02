public class FindAPI {
    public static void main(String[] args) {
        //main이라는 메서드가 있어야 시작을 할수있음
        int a;//변수를 선언(변수 앞에는 자료 형이 와야됨 크게 두가지가 있다 1->기본자료형 2->사용자자료형)
              /*컴파일러가 int라는 자료형이 어디있는지 알아서 에러가안남 만약 AAA라는 자료형을 쓰면 컴파일러
                어디에 있는지 찾지못해 에러가 난다 */
        a = 10;
        System.out.println("a = " + a);
        // "APPLE" 문자열 저장하고 출력
        String s;
        s = "APPLE";
        System.out.println("s = " + s);
        System.out.println(s.length());//s 안에 있는 문자열 길이를 알려줌

    }
}
