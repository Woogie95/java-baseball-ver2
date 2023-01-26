package baseball;

import java.util.ArrayList;
import java.util.List;

public class UserNumberFactory {

    public static List<String> createUserNumbers(String userNumber) {
        List<String> userNumbers = new ArrayList<>();
        for (int i = 0; i < userNumber.length(); i++) {
            userNumbers.add(String.valueOf(userNumber.charAt(i)));
        }
        return userNumbers;
    }

}
