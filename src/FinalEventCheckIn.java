import java.nio.charset.StandardCharsets;
import java.util.Scanner;

class StudentEntry {
    String studentId;
    String name;
}

public class FinalEventCheckIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentEntry[] entries = new StudentEntry[5];

        while (true) {
            System.out.println("\n[취업 특강 접수]");
            System.out.println("1 신청  2 명단  3 취소  4 현황  0 종료");
            System.out.print("선택: ");
            String menu = scanner.nextLine().trim();

            if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case "1":
                    System.out.print("학번: ");
                    String studentId = scanner.nextLine().trim();
                    System.out.print("이름: ");
                    String name = scanner.nextLine().trim();

                    // TODO 1. 빈 학번이나 빈 이름은 거절하세요.
                    if (studentId.isEmpty() || name.isEmpty()) {
                        System.out.println("학번과 이름을 다시 입력해주세요");
                        break;
                    }
                    if (!studentId.matches("\\d+")) {  //학번에 문자가 들어가는게 이상해서 따로 추가 했습니다.
                        System.out.println("학번은 숫자만 입력하세요"); // \\d 부분만 AI 사용했습니다.
                        break;
                    }
                    // TODO 2. 같은 학번이 이미 있는지 배열 전체를 확인하세요.
                    boolean duplicate = false;
                    for (StudentEntry entry : entries) {
                        if (entry != null && entry.studentId.equals(studentId)) {
                            duplicate = true;
                            break;
                        }
                    }
                    if (duplicate) {
                        System.out.println("이미 신청한 학생");
                        break;
                    }
                    // TODO 3. null인 첫 칸을 찾고 StudentEntry 객체를 저장하세요.
                    int emptyIndex = -1;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] == null) {
                            emptyIndex = i;
                            break;
                        }
                    }
                    // TODO 4. 다섯 칸이 모두 찼다면 정원 마감을 출력하세요.
                    if (emptyIndex == -1) {
                        System.out.println("정원 마감");
                        break;
                    }
                    StudentEntry newEntry = new StudentEntry();
                    newEntry.studentId = studentId;
                    newEntry.name = name;
                    entries[emptyIndex] = newEntry;
                    System.out.println(name + "학생 신청 완료");
                    break;

                case "2": // 명단
                    // TODO 5. null을 건너뛰며 위치, 학번, 이름을 출력하세요.
                    // 아무도 없으면 "등록된 신청자가 없습니다."를 출력하세요.
                    int displayed = 0;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null) {
                            System.out.println((i + 1) + "번 " + entries[i].studentId + " " + entries[i].name);
                            displayed++;
                        }
                    }
                    if (displayed == 0) {
                        System.out.println("등록된 신청자가 없습니다.");
                    }
                    break;

                case "3":
                    System.out.print("취소할 학번: ");
                    String cancelId = scanner.nextLine().trim();
                    // TODO 6. 학번을 찾아 해당 칸에 null을 넣으세요.
                    // 없는 학번이라면 그 사실을 알려 주세요.
                    int canceledIndex = -1;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null && entries[i].studentId.equals(cancelId)) {
                            canceledIndex = i;
                            break;
                        }
                    }
                    if (canceledIndex == -1) {
                        System.out.println("없는 학번입니다.");
                    } else {
                        String canceledName = entries[canceledIndex].name;
                        entries[canceledIndex] = null;
                        System.out.println(canceledName + "학생 취소 완료");
                    }
                    break;

                case "4": //현황
                    // TODO 7. null이 아닌 칸을 세어 현재 인원과 남은 자리를 출력하세요.
                    int count = 0;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null) {
                            count++;
                        }
                    }
                    System.out.println("현재 신청: " + count + "명");
                    System.out.println("남은자리: "+ (entries.length - count) + "명");
                    break;

                default:
                    System.out.println("0부터 4까지 선택하세요.");
            }
        }
    }
}
