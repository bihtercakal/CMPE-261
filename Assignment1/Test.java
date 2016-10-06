import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String args[]) {

		try {

			// Kullanicinin input girebilmesi için scanner methodu
			Scanner scan = new Scanner(System.in);

			// scan.nextline(); sayesinde kullanici isim ve soyismini girebiliyor
			System.out.println("Input your name and last name: ");
			String name = scan.nextLine();

			//assignment için for döngüsü 1 ile 7 arasýnda
			for (int i = 1; i < 7; i++) {
				// kullanicinin Assignment notlarini girebilmesi için
				System.out.println("input your Assignment" + i + " grade: ");
				double A1grade = scan.nextDouble();

				// kullanicinin zamaninda yükleyip yüklemedigini sorguluyor.
				// scan.next(); sayesinde kullanici cevabini giriyor.
				System.out.println("Did you submit it on time?: ");
				String submit = scan.next();

				Average.zamanSorgusu(A1grade, submit);
			}

			// kullanicinin midterm notunu girebildigi kisim
			System.out.println("Input your midterm grade: ");
			double midtermgrade = scan.nextDouble();

			// kullanicinin final notunu girebildigi kisim
			System.out.println("Input your final grade:");
			double finalgrade = scan.nextDouble();

			// Ortalamayi; assignment, midterm ve final grade yüzdelerine göre hesaplayip, yazdiriyor
			System.out.println("Dear " + name.toUpperCase() + ", " + " your average grade is "
					+ Average.sonuc(Average.array, midtermgrade, finalgrade));

			// if kisminda kullanabilmek için ögrencinin ortalama notunu double a degerine esitledim
			double a = Average.sonuc(Average.array, midtermgrade, finalgrade);

			// ögrencinin ortalamasina göre bir mesaj veriyor
			if (a >= 75) {
				System.out.println("Congratulations! You are very succesfull");
			}
			if (a < 75 && a >= 50) {
				System.out.println("Good Standing!");
			} else
				System.out.println("You should study more");

			// bir hata tespit edilince mesaj verildigi kisim
		} catch (InputMismatchException hata1) {
			System.out.println("Please write carefully. Process is over and run again!");
		}

	}
}