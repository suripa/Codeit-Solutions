package View;

public class View
{
	private String p;
	private String m;
	
	public View(){
	}
	public View(String p, String m) {
		this.p = p;
		this.m = m;
	}
	
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public String getM() {
		return m;
	}
	public void setM(String m) {
		this.m = m;
	}
	
	public void embarkView () {
		System.out.printf("\n--Passageiro: %s embarcado com sucesso, Motorista: %s retornando a área de embarque\n\n", p,m);
	}
	
	public void lastEmbark() {
		System.out.printf("\n--Passageiro: %s e Motorista: %s embarcados no avião.\n", p,m);
	}
	
	public void congratz() {
		System.out.printf("\nTodos os passageiros foram embarcados com sucesso.\n\n.");
}
}
