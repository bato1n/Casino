package Singleton;

import java.util.*;

public class Casino {

    public static boolean isblackjackorjackpot(String answer) {
        return answer.equals("blackjack") || answer.equals("jackpot");
    }
    String games;

    public static void setMoney() {
        boolean seted = true;
        while(Cash.getHajshajshajs()<1){
        System.out.println("How much cash do you want to start with?");
        Scanner money = new Scanner(System.in);
        Cash.setHajshajshajs(money.nextInt());

        }
    }

    public static void main(String[] args) {

        System.out.println("Hi! What is your name?");
        Scanner scan = new Scanner(System.in);
        Blackjack.name = scan.nextLine();
        System.out.println("Hello, " + Blackjack.name + ", lets play some games!");
        
        String game = "";
        System.out.println("Which game would you play? Blackjack or Jackpot?");
        while (!game.equalsIgnoreCase("exit")) {
            Scanner games = new Scanner(System.in);
            game = games.nextLine().toLowerCase();

             if (game.equals("blackjack")) {
                setMoney();
                Blackjack.blackjack();
            } else if (game.equals("jackpot")) {
                setMoney();
//                java.awt.EventQueue.invokeLater(SlotMachine::new);
                SlotMachine sm = new SlotMachine();
//                sm.createBox();
            } else {
            System.out.println("Please enter blackjack or jackpot or exit.");
            }
        }
    }
}