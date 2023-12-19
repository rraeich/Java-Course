import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String userPassword,userName; // In system username and password: rraeich / 1803
        int action,deposit,withdraw,balance=1700; // Default balance: 1700 Euro

        System.out.print("Enter your username: ");
        userName = inp.nextLine();

        System.out.print("Enter your password: ");
        userPassword = inp.nextLine();

        if(!(userPassword.equals("1803") && userName.equals("rraeich"))) {
            for(int i=0; i < 3 ;i++) {
                System.out.println("Wrong username or password. Please try again.");
                System.out.println("Your remaining attempts: "+(3-i));
                System.out.print("Enter your username: ");
                userName = inp.nextLine();

                System.out.print("Enter your password: ");
                userPassword = inp.nextLine();

                if (userPassword.equals("1803") && userName.equals("rraeich")){
                    break;
                }

                else if (i==2){
                    System.out.print("Your bank account locked Please contact the bank.");
                    return;
                }
            }
        }
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Welcome to RR Bank "+userName+"!");
            System.out.println("\n1- To deposit Money\n" +
                    "2- Withdraw Money\n" +
                    "3- Ask for Account Balance\n" +
                    "4- Quit the Account");
            System.out.print("\nPlease select the action you want to take:");
            action = inp.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch (action){

                case 1:
                    System.out.print("Enter the amount of money you want to deposit: ");
                    deposit = inp.nextInt();
                    balance += deposit;
                    System.out.println("New Account balance: " + balance + "€");
                    break;

                case 2:
                    System.out.print("Enter the amount of money you want to withdraw: ");
                    withdraw = inp.nextInt();

                    if (balance < withdraw){
                        System.out.println("You dont have this much money. Please try again.");
                        break;
                    }

                    else {
                        balance = balance - withdraw;
                        System.out.println("New Account balance: " + balance + "€");
                        break;
                    }

                case 3:
                    System.out.println("Your account balance: "+ balance + "€");
                    break;

                case 4:
                    System.out.println("See you soon " +userName + "!");
                    return;

                default:
                    System.out.println("Your action choosing not right. Quitting Account..");
                    return;
            }
        } while (action != 4);
    }
}