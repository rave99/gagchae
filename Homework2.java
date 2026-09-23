import java.util.Scanner;

class Student {
    private long studentId;
    private String name;
    private String major;
    private long phoneNumber;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            // 힌트를 반영하여 문자열로 입력받은 뒤 숫자로 변환
            students[i].setStudentId(Long.parseLong(scanner.next()));
            students[i].setName(scanner.next());
            students[i].setMajor(scanner.next());
            students[i].setPhoneNumber(Long.parseLong(scanner.next()));
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            // 힌트를 반영하여 숫자를 문자열로 변환한 뒤 앞자리 0 추가 및 하이픈 삽입
            String phoneStr = "0" + Long.toString(students[i].getPhoneNumber());
            String formattedPhone = phoneStr.substring(0, 3) + "-" + phoneStr.substring(3, 7) + "-" + phoneStr.substring(7);

            System.out.printf("%d번째 학생: %d %s %s %s\n",
                    (i + 1),
                    students[i].getStudentId(),
                    students[i].getName(),
                    students[i].getMajor(),
                    formattedPhone);
        }

        scanner.close();
    }
}