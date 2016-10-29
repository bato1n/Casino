/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author M
 */
public class Cash {

    Cash() {
    }

    public static Cash getInstance() {
        return CashHolder.INSTANCE;
    }

    private static class CashHolder {

        private static final Cash INSTANCE = new Cash();
    }

    private static int hajshajshajs = 0;//cash the user bets with

    public static int getHajshajshajs() {
        return hajshajshajs;
    }

    public static void setHajshajshajs(int hajshajshajs) {
        Cash.hajshajshajs = hajshajshajs;
    }

    public static void plusHajshajshajs(int plus) {
        hajshajshajs += plus;
    }

    public static void minusHajshajshajs(int minus) {
        hajshajshajs -= minus;
    }
}
