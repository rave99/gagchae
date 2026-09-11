import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자로부터 키보드 입력을 받습니다.
        Scanner sc = new Scanner(System.in);

        int sum = 0; // 정수의 합을 누적할 변수 초기화

        // 반복문을 사용하여 5번의 입력을 처리합니다.
        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            int num = sc.nextInt(); // 정수 입력 받기
            sum += num; // 입력받은 정수를 총합에 누적 (복합 대입 연산자 활용)

            System.out.println("현재까지 입력된 정수의 합은 " + sum + "입니다.");
        }

        sc.close();
    }
}