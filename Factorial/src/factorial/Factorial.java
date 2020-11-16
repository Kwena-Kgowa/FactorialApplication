/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author 222257
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Factorial of : ");
        int fact = reader.nextInt();
        System.out.println((int)Factorial(fact));
    }
    
    public static double Factorial(int fact)
    {
        if(fact == 0)
            return 0;
        else if(fact == 1)
            return 1;
        else
            return fact * Factorial(fact-1);
    }//end of Factorial()
}
