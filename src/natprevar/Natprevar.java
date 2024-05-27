package natprevar;

public class Natprevar {
	public Tim domakin, gostin;
	public int poeniDomakin, poeniGostin;

	public Natprevar(Tim d, Tim g) {
		domakin = d;
		gostin = g;
	}

	public void poeniZaDomakin(int poeni) {
		poeniDomakin += poeni;
	}

	public void poeniZaGostin(int poeni) {
		poeniGostin += poeni;
	}
	public void kojEPobednik() {
		if(poeniDomakin>poeniGostin) System.out.println("pobednik e "+domakin.joinString());
		else if(poeniDomakin<poeniGostin) System.out.println("pobednik e "+gostin.joinString());
		else System.out.println("nereseno");
	}
	
}
