

import java.util.Random;
public class Mono_Dice {
    public static void main(String args[]) {

        Random rr = new Random();
        int r1=0;
        int r2=1;
        int j=1;
        for (int i = 1; i <=j ; i++) {   //start of for-loop
            //This for loop runs only once if the (if and else) statement don't match the condition
            //runs twice if the if statement executes and runs three times if the ( else if) statement executes

            r1 = rr.nextInt(6) + 1;  //generates random number [1-6]
            r2 = rr.nextInt(6) + 1;  //generates random number [1-6]
            if ((r1 == r2) && (j<=2)) {
                System.out.println("user rolls "+r1 + " and " + r2);
                System.out.println("DOUBLES!");
                System.out.println("Move " + (r1 + r2) + " and roll again getting..");
                j++;

            }else if((r1==r2) && (j>=3)){
                System.out.println("user rolls "+r1 + " and " + r2);
                System.out.println("DOUBLES!");
                System.out.println("GOTO JAIL...");
                break;
            }

        else{
        System.out.print("user rolls "+r1 + " and " + r2);
        }
        }   //End of for-loop

    }}