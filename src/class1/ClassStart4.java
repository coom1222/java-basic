package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1 = new Student();   // 학생을 담아둘 수 있는 변수 선언

        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 80;

        System.out.println("이름" + student1.name + "나이: " + student1.age + "성적: " + student1.grade);
        System.out.println("이름" + student2.name + "나이: " + student2.age + "성적: " + student2.grade);
        System.out.println(student1);
        System.out.println(student2);
    }
}