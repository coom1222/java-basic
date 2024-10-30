package ref;

public class Method1 {

    public static void main(String[] args) {

        Student student1 = new Student();   // x001
        initStudent(student1, "학생1", 15,90);

        Student student2 = new Student();   //x002
        initStudent(student2, "학생2", 16,80);
        /*
        생성하고 초기화하고, 생성하고 초기화하고 뭔가 중복되는 느낌이다.
        이를 Method2에서 바꿔서 생성할 때 초기화 해보자.
         */

        printStudent(student1);
        printStudent(student2);
    }

    static void printStudent(Student student) {
        // printStudent 메서드의 매개변수인 student를 사용해야 한다.
        System.out.println("이름 " + student.name + "나이: " + student.age + "성적: " + student.grade);
    }

                               // student = x001
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
