package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {
				1.1,
				1.2,
				4.2,
				5.5
				};
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if(max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam Sayı : " + total);
		System.out.println("En Büyük : " + max);

	}

}
