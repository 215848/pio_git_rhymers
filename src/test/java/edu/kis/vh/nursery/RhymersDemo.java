package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static final int rangeStart1 = 1;
    public static final int rangeEnd1 = 15;
    public static final int rangeStart2 = 0;
    public static final int rangeEnd2 = 3;
    public static final int randomRange = 20;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = rangeStart1; i < rangeEnd1; i++) {
            for (int j = rangeStart2; j < rangeEnd2; j++) {
                rhymers[j].countIn(i);
            }
        }

        java.util.Random rn = new java.util.Random();
        for (int i = rangeStart1; i < rangeEnd1; i++) {
            rhymers[rangeEnd2].countIn(rn.nextInt(randomRange));
        }

        for (int i = rangeStart2; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck()) {
                System.out.print(rhymers[i].countOut() + "  ");
            }
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[rangeEnd2]).reportRejected());

    }

}