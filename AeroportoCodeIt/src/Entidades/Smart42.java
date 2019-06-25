package Entidades;

public class Smart42 {

	private String passageiro;
	private String motorista;

	public Smart42() {

	}

	public Smart42(String p, String m) {
		this.passageiro = p;
		this.motorista = m;
	}

	public String getP() {
		return passageiro;
	}

	public void setP(String p) {
		this.passageiro = p;
	}

	public String getM() {
		return motorista;
	}

	public void setM(String m) {
		this.motorista = m;
	}

	public void rulesDriver() {

		if(motorista.equals("Piloto")) {
			if (passageiro.equals("Comissaria1") || passageiro.equals("Comissaria2") || passageiro.equals("Presidiario")) {
				System.out.println("Condi��o n�o aceita, tente novamente.");
				System.exit(0);
			}
		}
		if(motorista.equals("ChefeDeServi�o")) {
			if (passageiro.equals("Oficial1") || passageiro.equals("Oficial2") || passageiro.equals("Presidiario")) {
				System.out.println("Condi��o n�o aceita, tente novamente.");
				System.exit(0);
			}
		}
		if(motorista.equals("Policial")) {
			if (passageiro.equals("Comissaria1") || passageiro.equals("Comissaria2") || passageiro.equals("Oficial1") || passageiro.equals("Oficial2")) {
				System.out.println("Condi��o n�o aceita pelas regras definida, tente novamente");
				System.exit(0);
			}
		}
    }
	
	public void canDrive () {
		if(motorista.equals("Piloto") || motorista.equals("ChefeDeServi�o") || motorista.equals("Policial")) {
		}else {
			System.out.println("Condi��o n�o aceita pelas regras definida, tente novamente");
			System.exit(0);
		}
	}
	
	public void theSame() {
		if(passageiro.equals(motorista)) {
			System.out.println("O motorista e o passageiro n�o podem ser os mesmos!!!");
			System.exit(0);
		}
	}
	
}
