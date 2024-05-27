/*Vo paket natprevar da ima klasi: Tim, Natprevar i Test
 * Tim klasa da sluzi za cuva ime i grad na timot, da ima konstruktor i metod za vrakjanje ime i gradot vo eden String [nema get i set]
 * Natprevar klasa da zeme dva obj Tim klasa, da ima konstruktori, metodi za dodavanje poeni
 * i da presmeta koj e pobednik ili nereseno
 * Test klasa da ima main, da se vnese podatoci preku tastatura, da kreira
 * instanci tim1 i tim2, i od natprevar klasa isto, da gi predade poenite na klasite i 
 * da se dobie pobednik/nereseno*/

package natprevar;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner vnes = new Scanner(System.in);
		System.out.println("Vnesi ime na prv klub \ni od koj grad e");
		String ime1= vnes.nextLine();
		String grad1 = vnes.nextLine();
		System.out.println("Vnesi ime na drugiot klub\ni od koj grad e");
		String ime2 = vnes.nextLine();
		String grad2 = vnes.nextLine();
		Tim partizan = new Tim(ime1, grad1);
		Tim dzvezda = new Tim(ime2, grad2);
		Natprevar finale = new Natprevar(partizan, dzvezda);
		System.out.println("Vnesi poeni za "+partizan.joinString());
		int poeni1 = vnes.nextInt();
		System.out.println("Vnesi poeni za "+dzvezda.joinString());
		int poeni2 = vnes.nextInt();
		finale.poeniZaDomakin(poeni1);
		finale.poeniZaGostin(poeni2);
		finale.kojEPobednik();
	}

}
