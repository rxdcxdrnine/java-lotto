package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 45;
    public static final int COUNT = 6;

    private static final List<Integer> candidates;
    private final List<Integer> numbers;
    private int matchCount;

    static {
        candidates = new ArrayList<>();

        for (int num = MIN_NUM; num <= MAX_NUM; num++) {
            candidates.add(num);
        }
    }

    public Lottery() {
        numbers = new ArrayList<>();
        Collections.shuffle(candidates);

        for (int idx = 0; idx < COUNT; idx++) {
            numbers.add(candidates.get(idx));
        }
    }

    public Lottery(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Lottery generate() {
        return new Lottery();
    }

    public void addMatchCount() {
        matchCount += 1;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int getMatchCount() {
        return matchCount;
    }

}
