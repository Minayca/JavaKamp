package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Dont't repeat yourself
		String internetSubeButonu = "?nternet ?ubeye gir";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar d??t? resmi");
		}
		else if (dolarBugun>dolarDun) {
			System.out.println("Dolar y?kseldi resmi");
		}
		else {
			System.out.println("Dolar e?ittir resmi");
		}
		
		String kredi1 = "H?zl? kredi";
		String kredi2 = "Mutlu emekli kredi";
		String kredi3 = "Konut kredi";
		String kredi4 = "?ift?i kredi";
		String kredi5 = "Msb kredi";
		String kredi6 = "Meb kredi";
		String kredi7 = "K?lt?r bakanl??? kredi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler = 
			{
					"H?zl? kredi",
					"Mutlu emekli kredi",
					"Konut kredi",
					"?ift?i kredi",
					"Msb kredi",
					"Meb kredi",
					"K?lt?r bakanl??? kredi"
			};
		
		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
	}

}
