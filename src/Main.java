import javax.swing.*;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.print("점수: ");
        int score = scanner.nextInt();

        if (score >= 60) {
            System.out.println("합격");
        }
        else {
            System.out.println("불학격");
        }
        System.out.println("확인 완료");

        scanner.close(); */
        //-----------------------------------------------------------------
        // 11p
        /*int amount = 60_000;
        boolean member = true;

        int rate;
        if (member == true && amount >= 60_000) {
            rate = 10;
        } else if (member == true && amount >= 20_000) {
            rate = 5;
        } else {
            rate = 0;
        }
        System.out.println(rate); */
        //-----------------------------------------------------------------
        // 13p
        /*int score = 95;
        String grade;

        if (score >= 90) {
            grade = "A";
        }
        else if (score >=80) {
            grade = "B";
        }
        else if (score >= 70) {
            grade = "C";
        }
        else {
            grade = "D";
        }
        System.out.println(grade); */
        //-----------------------------------------------------------------
        // 20p
        /*int number
                = (int) (Math.random() * 6) + 1;
        System.out.println(number"번");
        if (number == 1) {
            System.out.println("1번");
        }
        else if (number == 2) {
            System.out.println("2번");
        }
        else if (number == 3) {
            System.out.println("3번");
        }
        else if (number == 4) {
            System.out.println("4번");
        }
        else if (number == 5) {
            System.out.println("5번");
        }
        else {
            System.out.println("6번");
        } */
        //-----------------------------------------------------------------
        // 23p
        /*int menu = 2;

        switch (menu) {
            case 1:
                System.out.println("결제 문의");
                break;
            case 2:
                System.out.println("배송 문의");
                break;
            default:
                System.out.println("기타 문의");
        } */
        //-----------------------------------------------------------------
        // 24p
        /*int time = 9;
        switch (time) {
            case 8:
                System.out.println("출근");
            case 9:
                System.out.println("회의");
            case 10:
                System.out.println("업무");
            default:
                System.out.println("외근");
        } */
        //-----------------------------------------------------------------
        // 25p
        /*char grade = 'b';
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원");
                break;
            default:
                System.out.println("손님");
        }*/
        //-----------------------------------------------------------------
        // 31p
        /*String status = "PREPARING";
        String message = switch (status) {
            case "PAYMENT" -> "결제 확인 중";
            case "PREPARING" -> "상품 포장 중";
            case "SHIPPING" -> "배송 중";
            case "COMPLETED" -> "배송 완료";
            default -> "알 수 없는 상태";
        };
        System.out.println(message); */
        //-----------------------------------------------------------------
        // 36p ~ 37p
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        } */
        //----
        /*int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        // 5050  */
        //-----------------------------------------------------------------
        // 42p
        /*for (int row = 1; row <= 3; row++) {
            for (int column = 1; column <= 5; column++) {
                int seat = (row - 1) * 5 + column;
                System.out.print(seat + " ");
            }
            System.out.println();
        } */
        //-----------------------------------------------------------------
        // 47p
        /*Scanner scanner = new Scanner(System.in);

        int total = 0;
        int value = scanner.nextInt();
        while (value != -1) {
            total += value;
            value = scanner.nextInt();
        }
        System.out.println(total); */
        //-----------------------------------------------------------------
        // 57p
        /*Scanner scanner = new Scanner(System.in);
        String savedPin = "2580";
        String inputPin;
        int attempt = 0;

        do {
            inputPin = scanner.nextLine();
        } while (!inputPin.equals(savedPin) && attempt < 3);
        if (inputPin.equals(savedPin)) {
            System.out.println("로그인 성공");
        } */
        //-----------------------------------------------------------------
        // 65p
        /*Scanner scanner = new Scanner(System.in);
        int completedCount = 0;
        int cancelledCount = 0;
        int salesTotal = 0;

        for (int order = 1; order <= 5; order++) {
            System.out.print(order + "번 주문 금액을 입력하세요. 취소 주문은 -1: ");
            int amount = scanner.nextInt();
            if (amount == -1) {
                cancelledCount++;
                System.out.println("취소 주문은 매출 계산에서 제외합니다.");
                continue;
            }
            if (amount < 0) {
                System.out.println("잘못된 금액은 처리하지 않습니다.");
                continue;
            }
            completedCount++;
            salesTotal += amount;
        }

        System.out.println("완료 주문: " + completedCount + "건");
        System.out.println("취소 주문: " + cancelledCount + "건");
        System.out.println("매출 합계: " + salesTotal + "원");
        scanner.close();
        */
    }
}