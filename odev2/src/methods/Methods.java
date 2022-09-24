package methods;

public class Methods {

	public static void main(String[] args) {
sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean varmi = false;
		
		for(int sayi:sayilar) {
			if (sayi == aranacak) {
				varmi = true;
				break;
			}
		}
		
		String mesaj = "";
		if (varmi) {
			mesaj = "Sayi mevcuttur: " + aranacak;
			mesajVer(mesaj);
		}else {
			mesaj = "Sayi mevcut degildir: " + aranacak;
			mesajVer(mesaj);
		}

			
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
