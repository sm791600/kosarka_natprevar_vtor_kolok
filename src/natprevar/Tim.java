package natprevar;

public class Tim {
	private String ime, grad;
		
	public Tim(String ime, String grad) {
		this.ime=ime;
		this.grad=grad;
	}
	
	public String joinString() {
		return ime+" od ("+grad+")";
	}
}
