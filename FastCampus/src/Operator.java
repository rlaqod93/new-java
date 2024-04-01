public class Operator {
    public static void main(String[] args) {
        //두과목의 점수를 이용하여 총점과 평균을 출력하자
        //두과목의 점수는 국어 77점 , 영어 87점이다
        //변수는 kor,eng를 만들어 사용 할 것
        int kor, eng, total ;//변수선언 -> 기억공간이 만들어진다.
        kor = 77;
        eng = 87;
        total = kor + eng;
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (total / 2));
    }
}
