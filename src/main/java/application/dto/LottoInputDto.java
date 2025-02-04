package application.dto;

import java.util.List;

public class LottoInputDto {

    private final int inputMoney;
    private final List<List<Integer>> manualNumbers;

    public LottoInputDto(int inputMoney, List<List<Integer>> manualNumbers) {
        this.inputMoney = inputMoney;
        this.manualNumbers = manualNumbers;
    }

    public int getInputMoney() {
        return inputMoney;
    }

    public List<List<Integer>> getManualNumbers() {
        return manualNumbers;
    }
}
