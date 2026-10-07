import java.util.Scanner;

public class Homework4 {

    // 1. 재귀 호출을 이용한 최대공약수 함수
    static int gcd(int m, int n) {
        // n이 0이라면 m을 반환하고 함수 실행 종료
        if (n == 0) {
            return m;
        }

        // m과 n 중 큰 수와 작은 수 판별
        int max = Math.max(m, n);
        int min = Math.min(m, n);

        // 첫번째 인자로 작은 수를, 두번째 인자로 큰 수를 작은 수로 나눈 나머지를 넣고 호출
        return gcd(min, max % min);
    }

    // 2. 반복문을 이용한 최대공약수 함수 (과제 요구사항에 따른 추가 구현)
    static int gcdLoop(int m, int n) {
        while (n != 0) {
            int max = Math.max(m, n);
            int min = Math.min(m, n);

            m = min;
            n = max % min;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 콘솔에서 두 수를 입력받음
        System.out.print("두 수를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 재귀 함수를 호출하여 결과 계산 (반복문을 테스트하려면 gcdLoop(num1, num2)로 변경)
        int result = gcd(num1, num2);

        // 결과 출력
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        scanner.close();
    }
}