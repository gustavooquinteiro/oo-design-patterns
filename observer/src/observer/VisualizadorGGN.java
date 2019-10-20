package observer;

public class VisualizadorGGN implements Observer{

	public VisualizadorGGN() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(Titulo a) {
		// TODO Auto-generated method stub
		System.out.println("GGN aqui");
		double compra = a.getValorCompra();
		double venda = a.getValorVenda();
		System.out.println("Titulo tem valor de compra =" + compra + " e valor de venda =" + venda);;
	}

}
