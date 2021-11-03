package com.ss.cj_day_two_asgmt_one;
/**
 * @author Richard Croft
 *Totals of command line args 
 */
public class Cli_arg_totals {

	public static void main(String[] args) {
		int intArgTot = 0;
        float flArgTot = 0.0f;
        StringBuilder strArgCat = new StringBuilder();

        for(String cliArg : args) {
            try {
                intArgTot += Integer.parseInt(cliArg);
            } catch (Exception e){
                try {
                    flArgTot += Float.parseFloat(cliArg);
                } catch (Exception e2) {
                    strArgCat.append(cliArg + " ");
                }
            }
        }
        System.out.println("Total of integers entered:\t" + intArgTot);
        System.out.println("Total of floats entered:\t" + flArgTot);
        System.out.println("Total of integers entered:\t" + strArgCat);
	}

}
