package Singleton;

import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class SlotMachine {

    private boolean almostWin = false;
    private int reel1 = 0, reel2 = 0, reel3 = 0, reelCount = 10;
//    private int cash = 100;
    private String game;
    private boolean end = false;

    // starting values of the reels.
    public SlotMachine(int reel1, int reel2,
            int reel3) {
//        this.cash = cash;
        this.reel1 = reel1;
        this.reel2 = reel2;
        this.reel3 = reel3;
        createBox();
    }

    public SlotMachine() {
        createBox();
    }

    private void gameOver() {
        System.out.println("Game Over");

    }

    private void play() {

        if (Cash.getHajshajshajs() <= 0) {
            gameOver();

        } else {
            Cash.minusHajshajshajs(1); // Dra av en kredit.
            spinReels();
        }
    }

    public void createBox() {

        do {
            System.out.println("Press enter or write n to end this shit");
            Scanner scan = new Scanner(System.in);
            this.game = scan.nextLine();
            if (game.equals("n")) {
                break;
            }
            play();

            System.out.println("Welcome in Casino" + "\n cash: "
                    + Cash.getHajshajshajs() + "\n-------------------- " + "\n  |  " + reel1
                    + "  |  " + reel2 + "  |  " + reel3 + "  |  "
                    + "\n-------------------- ");

        Cash.plusHajshajshajs(vinst(reel1, reel2, reel3));
        } while (true);

    }

    public void spinReels() {
        if (almostWin == true) { // If the Always win cheat mode is enabled.
            // TODO
        } else {
            Random rand = new Random();
            reel1 = rand.nextInt(reelCount);


            reel2 = rand.nextInt(reelCount);


            reel3 = rand.nextInt(reelCount);


        }
    }

    // Vinst tabell metod
    public int vinst(int a, int b, int c) {
        int vinst = 0;

        if ((a == b) & (b == c)) {
            switch (a) {
                case 1:
                    vinst = 25;
                    break;
                case 2:
                    vinst = 25;
                    break;
                case 3:
                    vinst = 25;
                    break;
                case 4:
                    vinst = 25;
                    break;
                case 5:
                    vinst = 25;
                    break;
                case 6:
                    vinst = 60;
                    break;
                case 7:
                    vinst = 140;
                    break;
                case 8:
                    vinst = 160;
                    break;
                case 9:
                    vinst = 180;
                    break;
                default:
                    vinst = 0;
                    ;
                    break;

            }
        } else if ((a == b) || (b == c) || (c == a)) {
            if (a == b) {
            }
        }
        return vinst;
    }

    // Vinsten rÃ¤knar upp krediten med ca 50 ms mellan varje kredit.
//    public void moneyCounter(int sum) {
//        while (sum > 0) {
//            Cash.plusHajshajshajs(sum);
//            sum--;
//            // TODO
//            try {
//                Thread.currentThread();
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//            }
//        }
// 
//    }
}
