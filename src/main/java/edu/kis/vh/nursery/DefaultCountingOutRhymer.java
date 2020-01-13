package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int totalNumber = -1;
    private static final int numbersSize = 12;


    public int getTotal() {
        return total;
    }


    private final int[] numbers = new int[numbersSize];

    private int total = totalNumber;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    boolean callCheck() {
        return total == totalNumber;
    }

    boolean isFull() {
        return total == numbersSize - 1;

    }

    int peekaboo() {
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
