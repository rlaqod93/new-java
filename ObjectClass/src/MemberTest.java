public class MemberTest {
    public static void main(String[] args) {
        // 한 명의 헬스클럽 회원 데이터를 저장하고 출력하시요.
        //헬스클럽회원 이름,나이,번호,이메일,거주지,몸무게
        Member m = new Member();
        m.name = "김병완";
        m.age = 30;
        m.tel = "010-1234-5678";
        m.email = "zxcqwe@naver.com";
        m.addr = "서울";
        m.weight = 78.5F;

        System.out.println(m.name + "\t" + m.age + "\t" + m.tel + "\t" + m.email + "\t" +
         m.addr + "\t" + m.weight);

    }
}
