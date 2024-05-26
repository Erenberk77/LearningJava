
public class Cat {
int age;
String name;
String color;
String hobi;
public Cat() {
	this.age = 0;
	this.name = "isim girilmedi.";
	this.color = "renk girilmedi";
	this.hobi = "hobi ekleyiniz" ;
}
	public Cat(int age, String name) {
		this.name= name;
		this.age= age;
	}
	public Cat(int age, String name, String color, String hobi) {
		this.name =name;
		this.color = color;
		this.age =age;
		this.hobi = hobi;
	}
}

