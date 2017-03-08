
public class Seat {

	// variables
	private int number;
	private double price;
	
	//constructor
	public Seat(){
		//System.out.println("constructor");
		
		//number= 45;
		//price= 10.5;
		
	}

	// test class�nda kullanmak i�in define ediyorum
	// her cins koltuktan ka� adet ve ne kadar oldu�unu di�er classta belirtiyorum.
	public Seat(int number, double price) {
		this.number = number;
		this.price = price;
	}

	// variables private oldu�u i�in set ve get methodunu kullan�yorum.
	// de�i�kenlere de�er y�klemek i�in setNumber methodu
	public void setNumber(int number) {

		this.number = number;
	}

	// de�i�kenlere y�klenmi� olan de�eri almak i�in getNumber methodu
	public int getNumber() {

		return number;
	}

	// de�i�kenlere de�er y�klemek i�in setPrice methodu
	public void setPrice(double price) {

		this.price = price;
	}

	// de�i�kenlere y�klenmi� olan de�eri almak i�in getPrice methodu
	public double getPrice() {

		return price;
	}

	// e�er bu methodu kullanmazsak ekranda sadece "Seat@22b3ea59" gibi bir ifade g�r�r�z.
	// toString methodu kulland���m�zda ekrana number ve price de�erlerini string cinsinden bast�rm�� oluruz
	public String toString() {

		return number + "seat sold " + ", a ticket" + price + "$";

	}

}
