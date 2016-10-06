import java.util.Scanner;

public class Average {

	public static void zamanSorgusu(double assignment, String submit) {

		// Kullanicinin input girebilmesi için scanner methodu
		Scanner x = new Scanner(System.in);

		// ögrenci zamaninda yüklemisse notu etkilenmiyor
		while (submit.equalsIgnoreCase("yes")) {
			break;
		}

		// submitin cevabı no ise 10 dakika sonra yükledin mi sorusunu
		// yazdiriyor
		// kullanici late=scan.next(); sayesinde cevap veriyor.
		// 10 dakika sonra yüklemisse puanindan %10 düsüyor.
		// yüklememisse notu 0 oluyor.
		while (submit.equalsIgnoreCase("no")) {
			System.out.println("Did you submit it within 10 hours after the dead line?");
			String late = x.next();
			if (late.equals("yes")) {
				assignment = (assignment - (assignment * 0.10));
			} else
				assignment = 0;
			break;
		}
		Average.addToList(assignment);
	}

	// Array olusturdugum kisim
	static int numberofassignment;
	static double[] array = new double[6];

	// ögrencinin notlarinin listeye eklendigi kisim
	public static void addToList(double assignments) {

		array[numberofassignment] = assignments;
		numberofassignment++;
	}

	// yüzdelere göre sonuç hesaplama methodu
	public static double sonuc(double[] i, double midtermgrade, double finalgrade) {
		double average = ((i[0] * 0.15 + i[1] * 0.10 + i[2] * 0.20 + i[3] * 0.25 + i[4] * 0.15 + i[5] * 0.15) * 0.45
				+ midtermgrade * 0.25 + finalgrade * 0.30);
		return average;
	}

}