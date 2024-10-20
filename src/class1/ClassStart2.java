package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAge = {15, 16};
        int[] studentGrad = {90, 80};

        for(int i = 0; i <studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + "| 나이: " + studentAge[i] + "| 성적: " + studentGrad[i]);
        }

    }
}
// 배열을 통해 1번 문제를 발전시킨 모슴