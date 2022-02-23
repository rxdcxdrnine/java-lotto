package application.view;

import java.util.Scanner;

public class InputView {

    private static InputView inputView;

    private final Scanner scanner;

    private InputView() {
        scanner = new Scanner(System.in);
    }

    public static InputView getInstance() {
        if (inputView == null) {
            inputView = new InputView();
        }
        return inputView;
    }

    public int getMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(scanner.nextLine());
    }

    public String getWinningNumbers() {
        System.out.println("\n당첨 번호를 입력해 주세요.");
        return scanner.nextLine();
    }

    public int getBonusNumber() {
        System.out.println("보너스 볼을 입력해 주세요.");
        return Integer.parseInt(scanner.nextLine());
    }
}
