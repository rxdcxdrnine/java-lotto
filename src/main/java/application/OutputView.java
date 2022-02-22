package application;

import java.util.List;
import java.util.Map;

public class OutputView {
    private static OutputView outputView;

    private OutputView() {}

    public static OutputView getInstance() {
        if (outputView == null) {
            outputView = new OutputView();
        }
        return outputView;
    }

    public void printCount(int count) {
        System.out.printf("%d개를 구매했습니다.%n", count);
    }

    public void printLotteries(List<Lottery> lotteries) {
        for (Lottery lottery : lotteries) {
            System.out.println(lottery.getNumbers());
        }
    }

    public void printEarningsRate(double earningsRate) {
        System.out.printf("총 수익률은 %.2f%% 입니다.%n", earningsRate * 100);
    }

    public void printStatistics(Statistics statistics) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator())
            .append("당첨 통계").append(System.lineSeparator())
            .append("---------").append(System.lineSeparator());

        Map<Prize, Integer> counts = statistics.getCounts();

        counts.keySet().forEach(key ->
            sb.append(key.matchCount).append("개 일치(")
                .append(key.reward).append("원) - ")
                .append(counts.get(key)).append("개")
                .append(System.lineSeparator()));

        System.out.println(sb);
    }
}
