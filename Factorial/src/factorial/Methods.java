/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author 222257
 */
public class Methods {
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
