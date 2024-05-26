
public class main {
public static void main(String[] args) {
	Cat kedi1= new Cat();
	kedi1.name ="Onur" ;
	kedi1.age =31 ;
	kedi1.color ="siyah";
	kedi1.hobi= "uyumak";
   System.out.println(kedi1.name + ", " + kedi1.color + ", " +  kedi1.age + ", " + kedi1.hobi  );
   Cat kedi2= new Cat(22," Yavuz", "Pembe", "Onur Diþi Kedisine MartAyýnda Hallenmek");
   System.out.println(kedi2.age + ", " + kedi2.name + ", " + kedi2.color + ", " + kedi2.hobi);
   Cat kedi3 = new Cat(18 , "Yakup kedisi", "Turuncu ", "Ciftlesen kedilere ýyyyyh one demek" );
   System.out.println(kedi3.age + ", " + kedi3.name + ", " + kedi3.color + ", " + kedi3.hobi);
}
}
