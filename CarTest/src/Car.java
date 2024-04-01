public class Car {
    public static void main(String[] args) {
        //자동차의 정보를 저장 하려고 한다. 변수를 만들어 보세요
        String model = "BMW528i";
        System.out.println("model = " + model);
        long distance = 10000000000L;//long 은 8바이트 L 이없으면 4바이트인 int 로 된다
        System.out.println("distance = " + distance + "km");
        int price = 900000000;
        System.out.println("price +  = " + price + "원");
        String company = "BMW";
        System.out.println("company = " + company);
        char type = 'A';
        System.out.println("type = " + type);
        boolean auto = true;
        System.out.println("auto = " + auto);
        int year = 2017;
        System.out.println("year = " + year);
        float diese = 11.5F;//boolean(8바이트) float(4바이트) 실수데이터는 기본이 boolean 이다
                            // 소수점이 많으면 boolean 을 쓰면된다.
        System.out.println("diese = " + diese + "L");

        int a , b , c , d;
        a = 10;
        b = a;
        c = b*10;
        System.out.println(c);

        //int sum; -> 초기화를 하지않은 상태에서 밑에 연산식을 하면 오류가 남
        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;
        System.out.println(sum);
    }
}
