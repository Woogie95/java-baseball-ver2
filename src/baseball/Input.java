package baseball;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        return SCANNER.nextLine();
    }

    public static String inputRestartNumber() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return SCANNER.nextLine();
    }

}
