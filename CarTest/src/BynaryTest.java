public class BynaryTest {
    public static void main(String[] args) {
        int a = 10;
        float f = 35.6F;//실수형은 double로 인식(8bit) float는(4bit) 8bit는 4bit로 들어갈수없어 뒤에
                        //F로 붙여서 4bit로 인식을 시켜주는것
        boolean b = false;
        char c = 'A';
        String s = "APPLE";

        //69를 10진수 2진수 8진수 16진수로 출력하시요.
        int decimal = 69;//10진수
        System.out.println("decimal = " + decimal);
        int binart = 0b01000101;//2진수 0b로 시작
        System.out.println("binart = " + binart);
        int octal = 0105;//8진수 0으로시작
        System.out.println("octal = " + octal);
        int hexa = 0x45;//16진수 0x로시작
        System.out.println("hexa = " + hexa);

        //123을 10진수 2진수 8진수 16진수로 출력하시요
        int dec = 123;
        System.out.println("dec = " + dec);
        int bin = 0b01111011;
        System.out.println("bin = " + bin);
        int oct = 0173;
        System.out.println("oct = " + oct);
        int hex = 0x7b;
        System.out.println("hex = " + hex);

    }
}
