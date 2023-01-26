package baseball;

import java.util.Scanner;

public class Input {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        return SCANNER.nextLine();
    }

    public static String inputRestartNumber() {
        return SCANNER.nextLine();
    }

}
