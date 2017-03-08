//BÝHTER ÇAKAL 113200011

public class Test {

	// main method
	public static void main(String[] args) {

		// Yeni bir A koltuðu yaratýyorum
		// kaç tane A koltuðu satýldýðýný ve bir tanesinin ne kadar olduðunu belirtiyorum.
		Seat A = new Seat(14, 50.5);
		//System.out.println("The number of A type sold:" + " " + A.getNumber() + "seat");
		//System.out.println("Price of a 'A type' ticket:" + " " + A.getPrice() + "$");
	    System.out.println("A type: " + A);

		// Yeni bir B koltuðu yaratýyorum
		// kaç tane B koltuðu satýldýðýný ve bir tanesinin ne kadar olduðunu belirtiyorum.
		Seat B = new Seat(12, 30.3);
		//System.out.println("The number of B type sold:" + " " + B.getNumber() + "seat");
		//System.out.println("Price of a 'B type' ticket:" + " " + B.getPrice() + "$");
	    System.out.println("B type: " + B);

		// Yeni bir C koltuðu yaratýyorum
		// kaç tane C koltuðu satýldýðýný ve birtanesinin ne kadar olduðunu belirtiyorum.
		Seat C = new Seat(15, 20.2);
		//System.out.println("The number of C type sold:" + " " + C.getNumber() + "seat");
		//System.out.println("Price of a 'C type' ticket:" + " " + C.getPrice() + "$");
		System.out.println("C type: " + C);

		// Toplam satýþ fiyatýný ölçüyor
		// A.getNumber()*A.getPrice()-> Satýlan A tipi koltuklarýn toplam fiyatýný hesaplýyor.
		double totalsale = (A.getNumber() * A.getPrice() + B.getNumber() * B.getPrice() + C.getNumber() * C.getPrice());

		// toplam satýþý ekrana basýyor.
		System.out.println("TOTAL SALE:" + totalsale + "$");

	}
}
