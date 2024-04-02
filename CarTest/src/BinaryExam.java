public class BinaryExam {
    public static void main(String[] args) {
        int date = 123; //10진 정수
        System.out.println("date = " + date);
        //Integer class에 있는 toBinaryString()메서드로 진수들로 변경
        String binary = Integer.toBinaryString(date); //2진수로 변경 0b1111011
        System.out.println("binary = " + binary);
        String octal = Integer.toOctalString(date); //8진수로 변경 0173
        System.out.println("octal = " + octal);
        String hexa = Integer.toHexString(date);
        System.out.println("hexa = " + hexa); //16진수 변경 0x7B

        int x = 123;//10진수
        System.out.println("x = " + x);
        int y = 0b1111011;//2진수
        System.out.println("y = " + y);
        int z = 0173;//8진수
        System.out.println("z = " + z);
        int u = 0x7B;//16진수
        System.out.println("u = " + u);
    }
}
