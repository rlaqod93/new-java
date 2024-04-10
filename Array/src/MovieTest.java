public class MovieTest {
    public static void main(String[] args) {
        ////영화 3편을 저장 할 배열을 생성하고 영화3편의 데이터를 저장하고 출력
        Movie[] m = new Movie[3];

        //영화 1편
        m[0] = new Movie();
        m[0].title = "아바타";
        m[0].day = "4월10일";
        m[0].hero = "외계인";
        m[0].genre = "우주";
        m[0].showtime = 180;
        m[0].rating = "15세";

        //영화 2편
        m[1] = new Movie();
        m[1].title = "웡카";
        m[1].day = "4월11일";
        m[1].hero = "윌리";
        m[1].genre = "초콜릿";
        m[1].showtime = 190;
        m[1].rating = "12세";

        //영화3편
        m[2] = new Movie();
        m[2].title = "범죄도시";
        m[2].day = "4월12일";
        m[2].hero = "마동석";
        m[2].genre = "액션";
        m[2].showtime = 2000;
        m[2].rating = "18세";

        for(int i = 0; i < m.length; i++){
            System.out.println("영화종류 = " + m[i].title + "\t" + m[i].day + "\t" +
                    m[i].hero + "\t" + m[i].genre + "\t" + m[i].showtime + "\t" + m[i].rating);
            //영화종류 = 아바타	4월10일	외계인	우주	180	15세
            //영화종류 = 웡카	4월11일	윌리	초콜릿	190	12세
            //영화종류 = 범죄도시	4월12일	마동석	액션	2000	18세
        }
    }
}
