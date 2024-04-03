public class CastingTest {
    public static void main(String[] args) {
        //자동형변환 (작은바이트에서 -> 큰바이트는 자동을변환이됨)
        int a = 5; //4bite
        double b = a; //8bite
        System.out.println("b = " + b); //5.0
        
        //강제현변환 (큰파이트에서 -> 작은바이트로 가면 강제형변환을 해줘야됨)
        //형변환을 할 dateType을 작성해준다 ex) (int)c;
        //강제 형변환을 할 경우 데이터 손실이 생긴다.
        double c = 14.6;
        int d = (int)c;
        System.out.println("d = " + d); //14 뒤에 소수점자리가 손일이 생김

        float f1 = .10f;
        System.out.println("f1 = " + f1); //0.1
        float f2 = 15f;
        System.out.println("f2 = " + f2); //15.0
        float f3 = 3.14f; //소수점 6개까지
        System.out.println("f3 = " + f3); //3.14
        int f4 = (int)f3;
        System.out.println("f4 = " + f4); //3
        
        //byte크기가 같아도 데이터타입이 달라서 강제케스팅을 해줘야됨
        float x = 15.6f;
        int y = (int)x;
        System.out.println("y = " + y); //15 강제현변환 소수점자리 손실

        char cc = 'A';
        int ccc = cc; //자동형변환
        System.out.println("ccc = " + ccc); //65

        int dd = 5;
        double ddd = dd; //자동형변환
        System.out.println("ddd = " + ddd); //5.0

        double dx = 14.67;
        int dy = (int)dx; //강제형변환
        System.out.println("dy = " + dy); //14 -> .67 소수점 손실이 일어남
        

    }
}
