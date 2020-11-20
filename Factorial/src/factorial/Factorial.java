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
        Methods method = new Methods();
        System.out.println("Factorial of : ");
        int fact = reader.nextInt();
        System.out.println((int)method.Factorial(fact));
    }
}
