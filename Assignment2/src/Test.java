//B�HTER �AKAL 113200011

public class Test {

	// main method
	public static void main(String[] args) {

		// Yeni bir A koltu�u yarat�yorum
		// ka� tane A koltu�u sat�ld���n� ve bir tanesinin ne kadar oldu�unu belirtiyorum.
		Seat A = new Seat(14, 50.5);
		//System.out.println("The number of A type sold:" + " " + A.getNumber() + "seat");
		//System.out.println("Price of a 'A type' ticket:" + " " + A.getPrice() + "$");
	    System.out.println("A type: " + A);

		// Yeni bir B koltu�u yarat�yorum
		// ka� tane B koltu�u sat�ld���n� ve bir tanesinin ne kadar oldu�unu belirtiyorum.
		Seat B = new Seat(12, 30.3);
		//System.out.println("The number of B type sold:" + " " + B.getNumber() + "seat");
		//System.out.println("Price of a 'B type' ticket:" + " " + B.getPrice() + "$");
	    System.out.println("B type: " + B);

		// Yeni bir C koltu�u yarat�yorum
		// ka� tane C koltu�u sat�ld���n� ve birtanesinin ne kadar oldu�unu belirtiyorum.
		Seat C = new Seat(15, 20.2);
		//System.out.println("The number of C type sold:" + " " + C.getNumber() + "seat");
		//System.out.println("Price of a 'C type' ticket:" + " " + C.getPrice() + "$");
		System.out.println("C type: " + C);

		// Toplam sat�� fiyat�n� �l��yor
		// A.getNumber()*A.getPrice()-> Sat�lan A tipi koltuklar�n toplam fiyat�n� hesapl�yor.
		double totalsale = (A.getNumber() * A.getPrice() + B.getNumber() * B.getPrice() + C.getNumber() * C.getPrice());

		// toplam sat��� ekrana bas�yor.
		System.out.println("TOTAL SALE:" + totalsale + "$");

	}
}
