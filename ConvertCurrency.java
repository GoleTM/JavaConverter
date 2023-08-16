import java.util.Scanner;

public class ConvertCurrency {

	public static Scanner sc;

	public static double UsdToBwp = 13.57;

	public static double CONVERT_USD_TO_PULA(double amount) {

		double convertedAmount = UsdToBwp * amount;

		return convertedAmount;
	}

	public static double CONVERT_PULA_TO_USD(double amount) {

		double convertedAmount =  amount / UsdToBwp ;

		return convertedAmount;
	}
	
	
	
 /*public static void MenuCurrencyConverter() {

	while (true) {

		cc.MenuBuilder();
		cc.MenuOptionsProcessor();
	}*/
		


	

	public static void MenuBuilder() {

		System.out.println("***********************************");
		System.out.println("*** BWP-USD Currency Conveter *****");
		System.out.println("***********************************");

		System.out.println();

		System.out.println("SELECT FROM MENU BELOW ");

		System.out.println("(1)USD TO BWP ");
		System.out.println("(2)BWP TO USD ");

	}

	public static void MenuOptionsProcessor() {

		sc = new Scanner(System.in);

		int option = sc.nextInt();

		double amount;

		switch (option) {

		case 1:
			System.out.println("ENTER AMOUNT(USD) YOU WANT TO CONVERT TO BWP ");
			amount = sc.nextDouble();
			System.out.println();

			System.out
					.println("$" + amount + " TO PULA IS : " + "P" +  Math.round(ConvertCurrency.CONVERT_USD_TO_PULA(amount)* 100.0) / 100.0 );
			System.out.println();
			break;
		case 2:
			System.out.println("ENTER AMOUNT(BWP) YOU WANT TO CONVERT TO USD");
			System.out.println();

			amount = sc.nextDouble();
			System.out
					.println("P" + amount + " TO DOLLARS IS : " + "$"+ Math.round(ConvertCurrency.CONVERT_PULA_TO_USD(amount)* 100.0) / 100.0 );
			System.out.println();

			break;
		default:
			System.out.println("Wrong input");
			System.out.println();

			break;

		}
	}

}
