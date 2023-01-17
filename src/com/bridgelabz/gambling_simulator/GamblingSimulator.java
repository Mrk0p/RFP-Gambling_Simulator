package com.bridgelabz.gambling_simulator;

import java.util.Random;

public class GamblingSimulator {

    public static final int initialStake = 100;
    public static final int stakeBet = 1;
    static Random random = new Random();

    public static void main(String[] args) {

        int totalStake = initialStake;

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

}
