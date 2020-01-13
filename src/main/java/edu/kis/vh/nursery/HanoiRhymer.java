package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {


    public static final int totalRejectedNumber = 0;
    private int totalRejected = totalRejectedNumber;


    int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
    //  alt + ← , alt + →  zmieniaja edytowany plik
}
