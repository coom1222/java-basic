package construct.ex;

public class Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    // 생성자를 이미 생성했기 때문에 자바가 기본 생성자를 생성하지 않으므로 필요한 기본 생성자.
    Book() {
        this(null,null,0);
    }

    // 모든 필드를 받는 생성자
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    // 타이틀과 저자만을 받는 생성자
    Book(String title, String author) {
        this(title, author, 0);
    }

    void displayInfo(){
        System.out.println("Title: " + title + " Author: " + author + " Page: " + page);
    }


}