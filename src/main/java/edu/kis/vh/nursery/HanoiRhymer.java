package edu.kis.vh.nursery;

/**
 * class for HanoiRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {


    /**
     * constant number of total rejected
     */
    private static final int totalRejectedNumber = 0;
    /**
     * number of total rejected
     */
    private int totalRejected = totalRejectedNumber;

    /**
     * getter for totalRejected
     * @return number of total rejected
     */
    int reportRejected() {
        return totalRejected;
    }

    /**
     * @param in
     */
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
