package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        // 메모리에 학생이라는 데이터를 만듬. 이를 통해 student1이라는 변수에 정보를 담을 수 있고, 사용할 수 있음
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 80;

        //Student[] students = {student1, student2};
        Student[] students = new Student[2];
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다.
        students[0] = student1; // 오른쪽 student1에는 참조값이 들어있다. 이 값이 그대로 복사되어 왼쪽에 있는 배열에 전달된다.
        students[1] = student2; // 따라서 기존 student1, student2에 들어있던 참조값은 그대로 유지된다.

        System.out.println("이름 " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
        System.out.println("이름 " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);

    }
}
