package baseball;

import static baseball.UserNumber.DEFAULT_VALUE;

public class MatchCount {

    public static void count(int ball, int strike) {
        countStrike(ball, strike);
        countBall(ball, strike);
        countStrikeBall(ball, strike);
        countNothing(ball, strike);
    }

    private static void countStrike(int ball, int strike) {
        if (ball == DEFAULT_VALUE && strike > DEFAULT_VALUE) {
            Output.printStrikeCaseMessage(strike);
        }
    }

    private static void countBall(int ball, int strike) {
        if (ball > DEFAULT_VALUE && strike == DEFAULT_VALUE) {
            Output.printBallCaseMessage(ball);
        }
    }

    private static void countStrikeBall(int ball, int strike) {
        if (ball > DEFAULT_VALUE && strike > DEFAULT_VALUE) {
            Output.printStrikeWithBallCaseMessage(ball, strike);
        }
    }

    private static void countNothing(int ball, int strike) {
        if (ball == DEFAULT_VALUE && strike == DEFAULT_VALUE) {
            Output.printNothingMessage();
        }
    }

}
