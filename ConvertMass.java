import java.util.Scanner;

public class ConvertMass {

	static Scanner sc;
	//static ConvertMass cm;

	private static double gTokg = 0.001;

	public static double CONVERT_GRAMS_TO_KILOGRAMS(double weight) {

		double convertedWeight = gTokg * weight;

		return convertedWeight;
	}

	public static double CONVERT_KILOGRAMS_TO_GRAMS(double weight) {

		double convertedWeight =  weight / gTokg ;

		return convertedWeight;
	}
	
	/*public static void MenuMassConverter() {
		
		while (true) {

			cm.MenuBuilder();
			cm.MenuOptionsProcessor();
		}
	}*/

	

	public static void MenuBuilder() {

		System.out.println("***************************************");
		System.out.println("*** GRAMS-KILOGRAMS Mass Conveter *****");
		System.out.println("***************************************");

		System.out.println();

		System.out.println("SELECT FROM MENU BELOW ");

		System.out.println("(1)GRAMS TO KILOGRAMS ");
		System.out.println("(2)KILOGRAMS TO GRAMS ");

	}

	public static void MenuOptionsProcessor() {

		sc = new Scanner(System.in);

		int option = sc.nextInt();

		double weight;

		switch (option) {

		case 1:
			System.out.println("ENTER WEIGHT(GRAMS) YOU WANT TO CONVERT TO KILOGRAMS ");
			weight = sc.nextDouble();
			System.out.println();

			System.out.println(
					weight + "g" + " TO KILOGRAMS IS : " + Math.round(ConvertMass.CONVERT_GRAMS_TO_KILOGRAMS(weight) * 100.0) / 100.0 + "kg");
			System.out.println();
			break;
		case 2:
			System.out.println("ENTER WEIGHT(KILOGRAMS) YOU WANT TO CONVERT TO GRAMS");
			System.out.println();

			weight = sc.nextDouble();
			System.out.println(
					weight + "kg" + " TO GRAMS IS : " + (ConvertMass.CONVERT_KILOGRAMS_TO_GRAMS(weight)) + "g");
			System.out.println();

			break;
		default:
			System.out.println("Wrong input");
			System.out.println();

			break;

		}

	}
}
