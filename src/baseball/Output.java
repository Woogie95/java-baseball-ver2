package baseball;

public class Output {

    public static void printBaseBallStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printStrikeCaseMessage(int strike) {
        System.out.println(strike + "스트라이크");
    }

    public static void printBallCaseMessage(int ball) {
        System.out.println(ball + "볼");
    }

    public static void printStrikeWithBallCaseMessage(int ball, int strike) {
        System.out.println(ball + "볼" + " " + strike + "스트라이크");
    }

    public static void printNothingMessage() {
        System.out.println("낫싱");
    }

    public static void printBaseBallEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}
