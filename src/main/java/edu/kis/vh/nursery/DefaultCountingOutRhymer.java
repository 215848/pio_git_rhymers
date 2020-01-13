package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int totalNumber = -1;
    public static final int numbersSize = 12;

    private final int[] numbers = new int[numbersSize];

    public int total = totalNumber;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == totalNumber;
    }

    public boolean isFull() {
        return total == numbersSize - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return totalNumber;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return totalNumber;
        return numbers[total--];
    }

}
