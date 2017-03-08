
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

	// test classýnda kullanmak için define ediyorum
	// her cins koltuktan kaç adet ve ne kadar olduðunu diðer classta belirtiyorum.
	public Seat(int number, double price) {
		this.number = number;
		this.price = price;
	}

	// variables private olduðu için set ve get methodunu kullanýyorum.
	// deðiþkenlere deðer yüklemek için setNumber methodu
	public void setNumber(int number) {

		this.number = number;
	}

	// deðiþkenlere yüklenmiþ olan deðeri almak için getNumber methodu
	public int getNumber() {

		return number;
	}

	// deðiþkenlere deðer yüklemek için setPrice methodu
	public void setPrice(double price) {

		this.price = price;
	}

	// deðiþkenlere yüklenmiþ olan deðeri almak için getPrice methodu
	public double getPrice() {

		return price;
	}

	// eðer bu methodu kullanmazsak ekranda sadece "Seat@22b3ea59" gibi bir ifade görürüz.
	// toString methodu kullandýðýmýzda ekrana number ve price deðerlerini string cinsinden bastýrmýþ oluruz
	public String toString() {

		return number + "seat sold " + ", a ticket" + price + "$";

	}

}
