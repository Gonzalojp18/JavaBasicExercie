package Central;

import java.util.Scanner;

public class CuentaBancaria {

    int numberAccount;
    long DNI;
    double CurrBalance = 0.0;

    public CuentaBancaria(int numberAccount, long DNI, double currBalance) {
        this.numberAccount = numberAccount;
        this.DNI = DNI;
        CurrBalance = currBalance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public long getDNI() {
        return DNI;
    }

    public double getCurrBalance() {
        return CurrBalance;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setCurrBalance(double currBalance) {
        CurrBalance = currBalance;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numberAccount=" + numberAccount +
                ", DNI=" + DNI +
                ", CurrBalance=" + CurrBalance +
                '}';
    }


    public double enterMoney(){
        Scanner cash = new Scanner(System.in);
        System.out.println("How much cas do you want to enter in yuor account");
        double enterCash = cash.nextDouble();

        double avaibleCash = enterCash + this.CurrBalance;

        return avaibleCash;
    }

    public double WdMoney(){
        Scanner cash = new Scanner(System.in);
        System.out.println("How much cas do you want to enter in yuor account");
        double gettingCash = cash.nextDouble();

        double avaibleCash = gettingCash - this.CurrBalance;

        return avaibleCash;
    }

    /*public void createAccount[] otherAccount(String args){


    }*/

    /*public double fasterMoney(){

    }*/


    public void checkBalance(){
        System.out.println("you account has " + this.CurrBalance);
    }

    public void showInformation(){
        System.out.println(" ");
    }

}
