package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange;

public class Numbers {
    private final int STARTING_NUMBER = 1;
    private final int END_NUMBER = 45;
    private final int COUNT = 6;

    public List<Integer> createRandomNumbers() {
        return pickUniqueNumbersInRange(STARTING_NUMBER, END_NUMBER, COUNT);
    }

    public List<Integer> sortNumbers() {

        return null;
    }

    public void validate() {

    }
}
