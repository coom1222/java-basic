package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); // 객체를 생성해. 동시에 생성자를 불러.
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
        // 생성자의 장점이 여기서 나온다. 메서드는 하나쯤 초기화 안해도 돌아는 간다. 즉, 오류를 발생할 가능성이 생긴다.
        // 그러나 생성자는 생성과 동시에 무조건 초기화를 해야한다. 그러지 않으면 컴파일 오류가 발생함.

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름: " + member.name + " 나이: " + member.age + " 성적: " + member.age);
        }



    }
}
