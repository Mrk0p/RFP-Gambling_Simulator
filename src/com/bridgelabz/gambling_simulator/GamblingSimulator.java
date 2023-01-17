package com.bridgelabz.gambling_simulator;

import java.util.Random;

public class GamblingSimulator {

    public static final int initialStake = 100;
    public static final int stakeBet = 1;
    public static final float percentage = (initialStake / 100) * 50;
    public static final float highestStake = percentage + initialStake;
    public static final float lowestStake = percentage - initialStake;

    public static void main(String[] args) {

        Random random = new Random();
        int totalStake = initialStake;

        while (totalStake < highestStake && totalStake > lowestStake) {
            int play = random.nextInt(2);

            switch (play) {

                case 0:
                    totalStake = totalStake - stakeBet;
                    System.out.println("Stake after loosing: " + totalStake);
                    break;

                case 1:
                    totalStake = totalStake + stakeBet;
                    System.out.println("Stake after winning: " + totalStake);
                    break;
            }

        }
        if (totalStake == highestStake)
            System.out.println("Gambler won by: " + totalStake);
        else
            System.out.println("Gambler lost by: " + totalStake);
    }
}
