package exception;

public final class InputException extends IllegalArgumentException {
    public void notNumberException(String money) {
        try {
            int intMoney = Integer.parseInt(money);
        } catch (Exception e) {
            throw new IllegalArgumentException("[ERROR] 구매 금액은 숫자만 입력해야 합니다.");
        }
    }

    public void notDivideZeroException(String money) {
        int intMoney = Integer.parseInt(money);
        if (intMoney % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 구매 금액을 1,000원 단위로 입력해야 합니다.");
        }
    }


}
