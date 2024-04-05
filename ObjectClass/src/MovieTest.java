public class MovieTest {
    public static void main(String[] args) {
        //시작객체 시작클래스 시작메서드
        //영화 한 편의 데이터를 저장하고 출력 하시요.
        //영화제목,개봉일,주인공,장르,상영시간,등급
        Movie mv = new Movie();
        mv.title = "아바타";
        mv.day = "2022.12.14";
        mv.hero = "제이크 실라";
        mv.genre = "액션";
        mv.showtime = 192;
        mv.rating = "12세";

        System.out.println(mv.title +"\t"+ mv.day +"\t"+ mv.hero +"\t"+
                mv.genre +"\t"+ mv.showtime+"분" +"\t"+ mv.rating);

    }
}
