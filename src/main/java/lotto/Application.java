package lotto;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        printLotteryCountAndNumbers(buyLotterys(5));
    }

    private static List<Lotto> buyLotterys(int quantity) {
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

    private static void printLotteryCountAndNumbers(List<Lotto> lottoSet) {
        System.out.printf("%d개를 구매했습니다.\n", lottoSet.size());
        for (Lotto lotto : lottoSet) {
            System.out.println(lotto);
        }
    }

    private void printLotteryWinningResult() {

    }

    private void printRateOfReturn() {

    }
}
