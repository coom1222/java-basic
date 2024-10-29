package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student0 = new Student();   // 학생을 담아둘 수 있는 변수 선언

        student0.name = "학생1";
        student0.age = 18;
        student0.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 80;

        System.out.println("이름" + student0.name + "나이: " + student0.age + "성적: " + student0.grade);
        System.out.println("이름" + student2.name + "나이: " + student2.age + "성적: " + student2.grade);
        System.out.println(student0);
        System.out.println(student2);
    }
}
