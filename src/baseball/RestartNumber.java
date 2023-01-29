package baseball;

public class RestartNumber {

    private static final int RESTART_NUMBER = 1;
    private static final int RESTART_NUMBER_MAX_LENGTH = 1;
    private static final String BASEBALL_EXIT_NUMBER = "2";
    private static final String BASEBALL_RESTART_NUMBER = "1";

    private final int restartNumber;

    public RestartNumber(String restartNumber) {
        this.restartNumber = validate(restartNumber);
    }

    public boolean isReStartGame() {
        return this.restartNumber == RESTART_NUMBER;
    }

    private int validate(String restartNumber) {
        validateRestartNumberLength(restartNumber);
        validateRestartNumberRange(restartNumber);
        return validateRestartNumberType(restartNumber);
    }

    private void validateRestartNumberLength(String restartNumber) {
        if (restartNumber.length() != RESTART_NUMBER_MAX_LENGTH) {
            throw new IllegalArgumentException("입력한 숫자가 한 자리가 아닙니다.");
        }
    }

    private void validateRestartNumberRange(String restartNumber) {
        if (!restartNumber.equals(BASEBALL_RESTART_NUMBER) && !restartNumber.equals(BASEBALL_EXIT_NUMBER)) {
            throw new NumberFormatException("입력한 값이 1 or 2 가 아닙니다.");
        }
    }

    private int validateRestartNumberType(String restartNumber) {
        int retryNumber;
        try {
            retryNumber = Integer.parseInt(restartNumber);
        } catch (NumberFormatException msg) {
            throw new NumberFormatException("입력한 값이 숫자가 아닙니다.");
        }
        return retryNumber;
    }

}
