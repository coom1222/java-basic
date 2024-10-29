package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        // String inception 처럼 MovieReview inception 또한 타입-변수명 일 뿐이다.
        MovieReview inception = new MovieReview();  // 인셉션 리뷰객체 생성
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();  // 인셉션 리뷰객체 생성
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", " + "리뷰: " + review.review);
        }

    }
}


/*
기존 문제에 배열을 도입하고, 영화 리뷰를 배열에 관리하자.
리뷰를 출력할 때 배열과 `for` 문을 사용해서 `System.out.println` 을 한번만 사용하자.
 */