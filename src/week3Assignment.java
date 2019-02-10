


public class week3Assignment {

	public static void main(String[] args) {
		
		int ages[] = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 152; //new age
		
		for (int i = 0; i < ages.length; i++){
			if (i == ages.length-1) {
				System.out.println("The last age, minus the first, is " + (ages[ages.length - 1] - ages[0]));
			}
		}int summ = 0;
		for (int age : ages) {
			summ += age;
		} System.out.println(summ / ages.length + " is the average age.");
		
		
			
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		double sum = 0;
		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();	
		}System.out.println("The average number of letters in the names array is " + sum / names.length + " and the names are:");
		
		for (String name : names) {
			System.out.print(name + " ");	
		}System.out.println(" "); // makes the sum not print on same line as names
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(sum + " letters total in the names array."); // sum of names arrays letters
		
		System.out.println(multiplyString("cat", 5));
		
		String firstName = "Jimminy";
		String lastName = "Cricket";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		
		int numbers[] = new int[9];
		numbers[0] = 3;
		numbers[1] = 9;
		numbers[2] = 23;
		numbers[3] = 64;
		numbers[4] = 2;
		numbers[5] = 8;
		numbers[6] = 28;
		numbers[7] = 93;
		numbers[8] = 152;
		boolean moreThan100 = isGreaterThan100(numbers);
		System.out.println(moreThan100);
		
		double numpers[] = new double[5];
		numpers[0] = 22;
		numpers[1] = 5.22;
		numpers[2] = 15;
		numpers[3] = 63.5;
		numpers[4] = 40.02;
		double average = calculateAverage(numpers);
		System.out.println(average);
		
		double nimbles[] = new double[3];
		nimbles[0] = 55.2;
		nimbles[1] = 42.15;
		nimbles[2] = 5;
		boolean greaterThan = isGreater(numpers, nimbles);
		System.out.print(greaterThan + ",");
		if (greaterThan == false) {
			System.out.println(" The average of the elements within numpers is not greater than that of nimbles.");
		}
		
		int temp = 119;
		boolean isHotOutside = temp > 100;
		double moneyInPocket = 10.51;
		boolean buyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(buyDrink + ", a really nice drink would be really nice today!");
		
		int raptorLevel = 135;
		String raptorColor = "red";
		String tameRaptor = worthTaming(raptorLevel, raptorColor);
		System.out.println(tameRaptor);
	}
	

	public static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}return result;
	}
	
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
	}
	
	public static boolean isGreaterThan100(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];	
		}return sum > 100;
	}
	
	public static double calculateAverage(double[] number) {
		double sum = 0;
		for (double num : number) {
			sum += num;
		}return sum / number.length;
	}
	
	public static boolean isGreater(double[] first, double[] second) {
		double sum1 = 0;
		double sum2 = 0;
		for (int a = 0; a < first.length; a++) {
			sum1 += first[a];	
		}
		double ave1 = sum1 / first.length;
		for (int a = 0; a < second.length; a++) {
			sum2 += second[a]; 
		}
		double ave2 = sum2 / second.length;
		return ave1 > ave2;
		
	}
	
	public static boolean willBuyDrink(boolean isHot, double hasMoney) {
		return isHot && hasMoney > 10.50;
	}
	
	
	
	
	/*This is my custom method. I made it check the inputs for level 
	 * and color to see if a certain raptor is worth taming. In the 
	 * video game Ark: Survival Evolved, you can tame all sorts of dinosaurs.
	 *  Raptors are nice to have, but are only useful if they are a high level.
	 *   Also, red is cool. Ark is fun.
	*/
	public static String worthTaming(int highLevel, String rightColor) {
		String message = "";
		if (highLevel >= 130 && rightColor == "red"){
			message += "Tame this raptor. Big levels and red color is the way to go.";
		}else if (highLevel < 130 && rightColor == "red"){
			message += "Don't tame this raptor, it's too low a level. It's red tho!";
		}else if (highLevel >= 130 && rightColor != "red") {
			message += "This raptor is in the level range for taming, but it's not red!";
		}else if (highLevel < 130 && rightColor != "red") {
			message += "This raptor is neither in the level range or the color red!";
		}return message;
	}
}
