import javax.swing.*;
import java.util.Arrays; // Arrays 사용하기 위한 부품
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("이름을 입력하세요.");
            return;
        }
        for (String name : args) {
            System.out.println(name);
        }
    }
}