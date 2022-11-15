package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Input {
    public int askHowMuchToBuy() {
        int money = Integer.parseInt(Console.readLine());
        return money;
    }

    public List<Integer> askWinningNumber() {

        return null;
    }

    public int askBonusNumber() {
        int purchaseAmount = 0;
        try {
            purchaseAmount= Integer.parseInt(Console.readLine());
        } catch (IllegalArgumentException e) {
            System.out.println();
        }

        return purchaseAmount;
    }

}
