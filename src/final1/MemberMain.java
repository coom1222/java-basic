package final1;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "Kim");
        member.print();
        member.changeData("seo");
        member.print();
    }
}
