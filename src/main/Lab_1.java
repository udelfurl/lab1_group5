package main;
import java.util.Scanner;
public class Lab_1 {
	public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	double pv, pv_rate, pmt_rate, years_towork, monthly_ssi, required_income,  pmt, years_retired;
		
	//asks the user for the inputs of each variable and assigns them names
	System.out.print("Enter required income: $");
	required_income= input.nextDouble();
	System.out.print("Enter the pv rate: %");
	pv_rate = input.nextDouble();
	System.out.print("Enter monthly_ssi: $");
	monthly_ssi = input.nextDouble();
	System.out.print("Years to work; ");
	years_towork = input.nextInt();
	System.out.print("Years retired; ");
	years_retired = input.nextDouble();
	System.out.println("Enter the pmt rate");
	pmt_rate = input.nextDouble();
	
	pv = (((Math.pow((1+pv_rate),(years_retired*12))+(required_income-monthly_ssi)*(1+pv_rate)*(Math.pow((1+pv_rate),(years_towork*12))-1)/(pv_rate/12))));
	
	pmt = (pv/((Math.pow((1+pmt_rate),(years_towork))-1))*(-pmt_rate/12));
	
	System.out.println("you needtp save:"+pv);
	
	System.out.println("you need to save:"+pmt);
	
	}
	
}
	
	
	
	