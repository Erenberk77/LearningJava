package week5;
import java.util.ArrayList;

public class KisiMain {
	Public static void main(String[] args) {
		Arraylist<Kisi> bireyler = new ArrayList<>(); 
		bireyler.add(new Kisi ("Ahmet", 24));
		bireyler.add(new Kisi("Kaya", 30 ));
		bireyler.add(new Kisi("Hayri", 40 ));
		for(Kisi birey:bireyler) {
			System.out.println("isim: " + birey.getIsim()+
					", yas: "+birey.getYas());
		}
	}

}
