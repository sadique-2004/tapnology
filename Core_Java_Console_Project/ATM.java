package Project;

import java.util.*;
import java.util.Random;

class Customer {
    int PIN;
    int num;
    float widamount, balance = 1000, depoamount;
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int sno = random.nextInt(80);
    Calendar calendar = Calendar.getInstance();

    void Menu() {
        System.out.println("---------------------------------------------------------------");
        System.out.println(" 1 Check Balance ");
        System.out.println(" 2 Witdraw Money ");
        System.out.println(" 3 Deposite Money ");
        System.out.println(" 4 Change PIN ");
        System.out.println(" 5 Exit ");
        System.out.println(" ");
    }

    void checkBalance() {
        System.out.println("---------------------------------------------------------------");
        System.out.println(" Available Balance fetched Successfully : " + balance + " Rs.");
        System.out.println("---------------------------------------------------------------");
    }

    void WitdrawMoney() {

        System.out.print(" Enter the amount :- ");
        widamount = sc.nextFloat();

        if (widamount > 0) {
            if (widamount <= balance) {
                System.out.println("---------------------------------------------------------------");
                System.out.println(" Amount" + widamount + " Witdraw Succesfulley");
                balance = balance - widamount;

                System.out.println(" Available Balance is : " + balance + " Rs.");
                System.out.println("---------------------------------------------------------------");
            } else {
                System.out.println("---------------------------------------------------------------");
                System.out.println(" The money in your account is not enough for the withdraw");
                System.out.println(" Check account balance and try again");
                System.out.println("---------------------------------------------------------------");
            }
        } else {
            System.out.println(" please enter the amount more than RS : 0 ,");
        }
        recipt();
    }

    void recipt() {
        System.out.println(" Do you want to Receipt : Y/N");
        System.out.println(" ");
        char P = sc.next().charAt(0);
        if (P == 'y') {
            System.out.println("---------------------------------------------------------------");
            // System.out.println(" भारतीय स्टेट बैंक ");
            System.out.println("                        STATE BANK OF INDIA                    ");
            System.out.println("---------------------------------------------------------------");
            System.out.println("");
            System.out.println("S.NO    :  " + sno);
            System.out.println("ATM ID  :  S5NA010725621 ");
            System.out.print("DATE    :  ");
            System.out.println(calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-"
                    + calendar.get(Calendar.YEAR));
            System.out.print("TIME    :  ");
            System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
                    + calendar.get(Calendar.SECOND));
            System.out.println("CARD NO :  55960XXXXXX7966  ");
            System.out.println("");
            if (widamount <= balance) {
                System.out.println("WITDRAW AMOUNT    : " + widamount);
            } else {
                System.out.println("WITDRAW AMOUNT    : 0.0");
            }
            System.out.println("AVAILABLE BALANCE : " + balance);
            System.out.println(" ");
            System.out.println("PLEASE CONTACT BRANCH MANAGER FOR CLARIFICATION");
            System.out.println("---------------------------------------------------------------");
            System.out.println("THANK YOU FOR BANKING WITH SBI");
            System.out.println("");
            System.out.println("                                 Visit us at www.sbi.co.in     ");
            System.out.println("---------------------------------------------------------------");
        } else if (P == 'n') {
            return;
        } else {
            System.out.println(" SORRY You Are Pressing  Wrong Button || So I can,t provide your Receipt ");
        }

    }

    void DepositeMoney() {

        System.out.print(" Enter your amount to depostive in your account :- ");
        depoamount = sc.nextFloat();

        if (depoamount > 0) {

            balance = depoamount + balance;
            System.out.println("---------------------------------------------------------------");
            System.out.println(" Your amount is successfulley Deposited in your acount. ");
            System.out.println(" Your current balance is : " + balance + " Rs.");
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println(" please enter the amount more than RS : 0 ,");
        }
        recipt1();

    }

    void recipt1() {
        System.out.println(" Do you want to Receipt  : Y/N");
        System.out.println(" ");
        char R = sc.next().charAt(0);
        if (R == 'y') {
            System.out.println("---------------------------------------------------------------");
            // System.out.println(" भारतीय स्टेट बैंक ");
            System.out.println("                        STATE BANK OF INDIA                    ");
            System.out.println("---------------------------------------------------------------");
            System.out.println("");
            System.out.println("S.NO    :  " + sno);
            System.out.println("ATM ID  :  S5NA010725621 ");
            System.out.print("DATE    :  ");
            System.out.println(calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-"
                    + calendar.get(Calendar.YEAR));
            System.out.print("TIME    :  ");
            System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
                    + calendar.get(Calendar.SECOND));
            System.out.println(" ");
            System.out.println("CARD NO :  55960XXXXXX7966  ");
            System.out.println("");
            System.out.println("WITDRAW AMOUNT    : " + widamount);
            System.out.println("AVAILABLE BALANCE : " + balance);
            System.out.println(" ");
            System.out.println("PLEASE CONTACT BRANCH MANAGER FOR CLARIFICATION");
            System.out.println("---------------------------------------------------------------");
            System.out.println("THANK YOU FOR BANKING WITH SBI");
            System.out.println("");
            System.out.println("                                 Visit us at www.sbi.co.in");
            System.out.println("---------------------------------------------------------------");
        } else if (R == 'n') {
            return;
        } else {
            System.out.println(" SORRY You Are Pressing  Wrong Button || So i can,t provide your Receipt ");
        }

    }

    void ChangePIN() {
        System.out.print(" Please enter new PIN  :  ");
        int newpin = sc.nextInt();

        if (newpin == PIN) {
            System.out.println("Please change your PIN . you are enter your old PIN");
        } else {
            PIN = newpin;
            System.out.println(" Your New PIN is    : " + PIN);
        }
    }

    void ATMmachine() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("***************************************************************");
        System.out.println("                Welcome to the SBI ATM                         ");
        System.out.println("***************************************************************");
        System.out.println(" ");
        System.out.print(" DATE    :  ");
        System.out.println(calendar.get(Calendar.DATE) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-"
                + calendar.get(Calendar.YEAR));
        System.out.print(" TIME    :  ");
        System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND));

        try {
            System.out.print(" Please enter your 4-digit PIN   :  ");

            PIN = sc.nextInt();
            Customer c = new Customer();

            int num;
            int i = 0;

            if (PIN == 7760 || PIN == 8756 || PIN == 4581) {
                do {
                    System.out.println(" ");
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("====================== SELECT THE MENU ========================");
                    c.Menu();

                    System.out.print(" Press Any Button :  ");
                    num = sc.nextInt();

                    switch (num) {
                        case 1:
                            System.out.println(" 1 Check Balance ");
                            c.checkBalance();
                            break;
                        case 2:
                            System.out.println(" 2 Witdraw Money ");
                            c.WitdrawMoney();
                            break;
                        case 3:
                            System.out.println(" 3 Deposite Money ");
                            c.DepositeMoney();
                            break;
                        case 4:
                            System.out.println(" 4 Change PIN ");
                            c.ChangePIN();
                            break;
                    }
                    if (num == 5) {

                        System.out.println(" ");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("                      Thanks for use SBI ATM                   ");
                        System.out.println("                     -------Visit Again-------                 ");
                        // Sleep(3000);
                        return;
                    } else if (num >= 5) {
                        System.out.println("---------------------------------------------------------------");
                        System.out.println("-       Sorry you can not chose the correct option.           -");
                        System.out.println("-              Please select these option.                    -");
                        System.out.println("---------------------------------------------------------------");
                    }
                } while (i >= 0);

            }

            else {
                System.out.println("---------------------------------------------------------------");
                System.out.println("-                  You are entering a wrong pin               -");
                System.out.println("-                 || -- Jaldi waha se hato -- ||              -");
                System.out.println("---------------------------------------------------------------");
            }
        } catch (InputMismatchException e) {
            System.out.println(" Exception");
            System.out.println(" PIN is always int type not a string or char  " + e);
        }

    }

}

public class ATM {
    public static void main(String[] args) {
        // Calendar calendar=Calendar.getInstance();

        Customer c = new Customer();
        c.ATMmachine();

    }
}
