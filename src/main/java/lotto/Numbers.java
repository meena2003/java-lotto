package lotto;

import java.util.Collections;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange;

public class Numbers {
    private final int STARTING_NUMBER = 1;
    private final int END_NUMBER = 45;
    private final int COUNT = 6;

    public List<Integer> createRandomNumbers() {
        return sortNumbers(pickUniqueNumbersInRange(STARTING_NUMBER, END_NUMBER, COUNT));
    }

    public List<Integer> sortNumbers(List<Integer> randomNumbers) {
        Collections.sort(randomNumbers);
        return randomNumbers;
    }

    public void validate() {

    }
}
