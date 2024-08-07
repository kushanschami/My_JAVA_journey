import java.util.Scanner;
public class IT24100111Lab3Q1A{
	public static void main(String[] args){
		int kg;
		double amount,final_bill,unit_price;
		Scanner x=new Scanner(System.in);
		System.out.print("Enter the price of 1kg of rice: ");
		unit_price=x.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy: ");
		amount=x.nextInt();
		final_bill=unit_price*amount;
		System.out.println("");
		System.out.print("The total amount is: "+final_bill);
	}
}