package Controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Motorista;
import Entidades.Passageiro;
import Entidades.Smart42;
import Entidades.Tripulante;
import View.View;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		View view = new View();
		
		List<Tripulante> terminal = new ArrayList<>();
		List<Tripulante> aviao = new ArrayList<>();
		
		terminal.add(new Motorista("Piloto"));
		terminal.add(new Motorista("ChefeDeServiço"));
		terminal.add(new Motorista("Policial"));
		terminal.add(new Passageiro("Oficial1"));
		terminal.add(new Passageiro("Oficial2"));
		terminal.add(new Passageiro("Comissaria1"));
		terminal.add(new Passageiro("Comissaria2"));
		terminal.add(new Passageiro("Presidiario"));
		
		do{
			Smart42 s42 = new Smart42();
			
		    System.out.println("Tripulantes no Terminal:");
		    for (Tripulante x : terminal) {
				System.out.println(x);
			}
			System.out.printf("\nEscolha um motorista:");
			
			String m = sc.nextLine();
			s42.setM(m);
			s42.canDrive();
			
			Tripulante checkM = new Motorista(m);
			if (!terminal.contains(checkM)) {
				System.out.println("Motorista não se encontra mais no Terminal, tente novamente.");
				break;
			}
			
			System.out.printf("Agora escolha um passageiro:");
			String p = sc.nextLine();
			s42.setP(p);
			
			Tripulante checkP = new Passageiro(p);
			if (!terminal.contains(checkP)) {
				System.out.println("Passageiro não se encontra mais no Terminal, tente novamente.");
				break;
			}
			
			if(p.equals("Policial")) {
				int i = 1;
				int n = 0;
				if(aviao.size() > i || aviao.size() == n) {
					System.out.println("Policial não pode deixar Presidiario sozinho com os outros passageiros, tente novamente.");
					break;
				}
			}
			
			s42.theSame();
			s42.rulesDriver();
			
			Tripulante delete = new Passageiro(p);	
			terminal.remove(delete);
			aviao.add(new Passageiro(p));
			view.setM(m);
			view.setP(p);
			
			
			Tripulante checkI = new Passageiro("Presidiario");
			Tripulante checkC = new Passageiro("Policial");
			if(aviao.contains(checkI) && !aviao.contains(checkC) && aviao.size() > 1) {
				System.out.println("Presidiario não pode ficar com os ouros passageiros sem a presença do Policial, tente novamente.");
				break;
			}
			
			if(p.equals("Policial")) {
				int i = 2;
				if(aviao.size() == i && !aviao.contains(checkI)) {
					System.out.println("Policial não pode deixar Presidiario sozinho com os outros passageiros, tente novamente.");
					break;
				}
			}
			
			view.embarkView();
			
		}while(terminal != null);
		sc.close();
	}

}
