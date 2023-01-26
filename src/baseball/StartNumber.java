package baseball;

public class StartNumber {

    private final int restartNumber;

    public StartNumber(String restartNumber) {
        this.restartNumber = validate(restartNumber);
    }

    public int validate(String restartNumber) {
        int startNumber;
        try {
            startNumber = Integer.parseInt(restartNumber);
        } catch (IllegalArgumentException msg) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
        return startNumber;
    }

    public boolean isReStartGame() {
        return this.restartNumber == 1;
    }


    public int getRestartNumber() {
        return restartNumber;
    }

}
