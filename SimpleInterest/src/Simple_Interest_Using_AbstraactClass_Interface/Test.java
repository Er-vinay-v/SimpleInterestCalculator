package Simple_Interest_Using_AbstraactClass_Interface;
import java.util.Scanner;
public class Test {
    static double Si(long p,float r,int t){

        double ans=(p*t*r)/(12*100);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank b=new SBI();
        Bank c=new HDFC();
        Bank d=new PNB();

        System.out.println("\nThis Application calculate only this bank interest like\n- SBI HDFC PNB\n");


        System.out.println("Enter Bank : press  1 -> SBI, press 2-> HDFC, press 3-> PNB");
        int n=sc.nextInt();

        if(n>0 && n<=3) {
            System.out.println("Enter your principle amount");
            long principleAmount = sc.nextLong();

            System.out.println("Enter time in monthly");
            int time = sc.nextInt();

            //SBI bank interest calculation
            if (n == 1) {
                float f = b.rateOfInterest();
                double totalInterest = Si(principleAmount, f, time);
                System.out.println("Your total interest in " + time + " month: " + totalInterest);

                double total = principleAmount + totalInterest;
                System.out.println("your total Amount with interest: " + total);
                System.out.println("your bank interest rate is: " + b.rateOfInterest());

            }
            //HDFC Bank
            else if (n == 2) {
                float f = c.rateOfInterest();
                double totalInterest = Si(principleAmount, f, time);
                System.out.println("Your total interest in " + time + " month: " + totalInterest);
                System.out.println("your total Amount with interest: " + (principleAmount + totalInterest));
                System.out.println("your bank interest rate is: " + c.rateOfInterest());
            }
            //PNB Bank
            else {
                float f = d.rateOfInterest();
                double totalInterest = Si(principleAmount, f, time);
                System.out.println("Your total interest in " + time + " month: " + totalInterest);
                System.out.println("your total Amount with interest: " + (principleAmount + totalInterest));
                System.out.println("your bank interest rate is: " + d.rateOfInterest());
            }
        }
        else {
            System.out.println("Please enter a valid number");
        }
    }
}
