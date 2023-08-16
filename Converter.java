import java.util.Scanner;

public class Converter {

	private static Scanner sc;

	static Converter cc;
	
	
	

	public static void main(String[] args) {

		MainMenu();
		MenuOptionsProcessor();
		MenuConverter();
	}

	public static void MenuConverter() {

				while (true) {

					Converter.MainMenu();
					Converter.MenuOptionsProcessor();
					
				}
					
				}

	private static void MainMenu() {

		System.out.println("***********************************");
		System.out.println("**** WELCOME TO OUR CONVERTER *****");
		System.out.println("***********************************");

		System.out.println();

		System.out.println("SELECT FROM MENU BELOW ");

		System.out.println("(1)MASS CONVERSION ");
		System.out.println("(2)CURRENCY CONVERSION ");

	}

               private static void MenuOptionsProcessor() {
		
		sc = new Scanner(System.in);

		int option = sc.nextInt();

	
		//double amount;

		switch (option) {

		case 1:
			System.out.println("YOU CHOOSE OPTION MASS CONVERSION");
			ConvertMass.MenuBuilder();
			ConvertMass.MenuOptionsProcessor();
			
			break;
		case 2:
			System.out.println("YOU CHOOSE OPTION CURRENCY CONVERSION");
			ConvertCurrency.MenuBuilder();
			ConvertCurrency.MenuOptionsProcessor();

			break;
		default:
			System.out.println("WRONG CHOICE");
			System.out.println();

			break;

		
	
	
	
	}
}

}
