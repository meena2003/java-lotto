package lotto;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Application application = new Application();
        application.buyLotterys(3);
    }

    private List<Lotto> buyLotterys(int quantity) {
        List<Lotto> lottoSet = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            lottoSet.add(new Lotto(Numbers.createRandomNumbers()));
        }
        return lottoSet;
    }

    private Integer compareNumbers(int n) {

        return null;
    }

    private float calculateRateOfReturn() {

        return 0f;
    }

    private Integer askHowMuchToBuy() {

        return 0;
    }

    private List<Integer> askWinningNumber() {

        return null;
    }

    private Integer askBonusNumber() {

        return null;
    }

    private void printLotteryCountAndNumbers(int[] lottoSet) {

    }

    private void printLotteryWinningResult() {

    }

    private void printRateOfReturn() {

    }
}
