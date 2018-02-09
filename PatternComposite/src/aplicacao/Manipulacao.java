package aplicacao;

import adapter.AdapterFigura;
import figuras.Circulo;
import figuras.Figura;
import figuras.FiguraComposta;
import figuras.Losango;
import figuras.Quadrado;
import figuras.Triangulo;

public class Manipulacao {

	public static void main(String[] args) {
		Figura figura1 = new Circulo();
		Figura figura2 = new FiguraComposta();
		Figura figura3 = new Triangulo();
		
		
		((FiguraComposta) figura2).add(figura1);
		((FiguraComposta) figura2).add(figura3);
		
		System.out.println(figura1.desenha());
		System.out.println(figura2.desenha());
		
		System.out.println("Figura Composta formada por:");
		for (Figura figura : ((FiguraComposta) figura2).getFiguras()) {
			System.out.println(figura.desenha());
		}
		
		
		System.out.println("\nAdapter");
		AdapterFigura a = new AdapterFigura(new Losango());
		System.out.println(a.desenharFigura());
		a.setFiguraAdaptada(new Quadrado());
		System.out.println(a.desenharFigura());
		
	}

}
