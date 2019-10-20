package observer;

import java.util.Random;

public class ExemploMonitoramento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Titulo t = new Titulo(2, 25, 65, null, null);

		Titulo p = new Titulo(3, 30, 60, null, null);
		Titulo b = new Titulo(4, 50, 80, null, null);

		Observer g = new VisualizadorGoogle();
		Observer n = new VisualizadorGGN();
		Observer U = new VisualizadorUOL();
		
		t.registerObserver(g);
		t.registerObserver(n);
		
		p.registerObserver(g);
		p.registerObserver(U);
		
		b.registerObserver(g);
		b.registerObserver(n);
		b.registerObserver(U);
		
		Random r = new Random();
		t.setValorCompra(r.nextDouble() * 100);
		p.setValorVenda(r.nextDouble() * 100);
		b.setValorCompra(r.nextDouble() * 100);
		b.setValorVenda(r.nextDouble() * 100);
	}

}
