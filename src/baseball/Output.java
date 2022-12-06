package baseball;

public class Output {

    public static void printBaseBallStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printStrikeCaseMessage(Judge judge) {
        System.out.println(judge.getStrike() + "스트라이크");
    }

    public static void printBallCaseMessage(Judge judge) {
        System.out.println(judge.getBall() + "볼");
    }

    public static void printStrikeWithBallCaseMessage(Judge judge) {
        System.out.println(judge.getBall() + "볼" + " " + judge.getStrike() + "스트라이크");
    }

    public static void printNothingMessage() {
        System.out.println("낫싱");
    }

    public static void printBaseBallEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}