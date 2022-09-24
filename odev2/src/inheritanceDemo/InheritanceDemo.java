package inheritanceDemo;

public class InheritanceDemo {

	public static void main(String[] args) {
		KrediUI kredi = new KrediUI();
		
OgretmenKrediManager manager = new OgretmenKrediManager();
		kredi.krediHesapla(manager);
	}
	
}
