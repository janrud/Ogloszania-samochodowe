package klasy;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DodajOgloszenie {

	public static void main(String[] args) {
		ArrayList<Samochod> lista= new ArrayList<>();
		ArrayList<Samochod> lista2= new ArrayList<>();

		lista.add(new Samochod("Sprzedam","TANIO","xyz@wyx.eu",50_000,"Opel","Astra",145_200.02,2000,90));
		lista.add(new Samochod("Sprzedam","TANIO","xyz@wyx.eu",60_000,"fiat","Dukato",145_200.02,2000,90));
		lista.add(new Samochod("Sprzedam","TANIO","xyz@wyx.eu",50_000,"TOYOTA","AURIS",145_200.02,2000,90));
		lista.add(new Samochod("Sprzedam","TANIO","xyz@wyx.eu",70_000,"TOYOTA","avensis",145_200.02,2000,90));
	//	int dlugosc=lista.size();
		System.out.println("Wypisywanie:");	
		for (Samochod samochod : lista) {
			System.out.println("kolejne ogloszenie"+samochod);
		}
			String cenadoltxt=JOptionPane.showInputDialog("podaj cena dolna");
			String cenagoratxt=JOptionPane.showInputDialog("podaj cena gorna");
			int cenadol=Integer.parseInt(cenadoltxt);
			int cenagora=Integer.parseInt(cenagoratxt);
			for (Samochod samochod2 : lista) {
				if (samochod2.getCena()<cenagora&&samochod2.getCena()>cenadol)
				{
					lista2.add(samochod2);
							
				}
				
			}
			JOptionPane.showMessageDialog(Wypisz(lista2),"Nie znalazlem wiecej samochodow w bazie pasujących do podanych kryteri cenowych");		
		}

	private static Component Wypisz(ArrayList<Samochod> lista2) {
		for (int i=0;i<lista2.size();i++) {
			JOptionPane.showMessageDialog(null,(i+1+". "+lista2.get(i)));
		}
		return null;
	}
	}


