package lotto.domain;

import lotto.validator.MoneyValidator;

import java.util.List;

public class User {

    private final int inputMoney;
    private List<Lotto> lottos;

    public User(int inputMoney, List<Lotto> lottos) {
        validateMoney(inputMoney);
        this.inputMoney = inputMoney;
        this.lottos = lottos;
    }

    public int getInputMoney() {
        return inputMoney;
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public void validateMoney(int inputMoney){
        MoneyValidator.check(inputMoney);
    }
}
