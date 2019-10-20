package observer;

public class VisualizadorUOL implements Observer {

	public VisualizadorUOL() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(Titulo a) {
		// TODO Auto-generated method stub
		System.out.println("UOL aqui");
		double compra = a.getValorCompra();
		double venda = a.getValorVenda();
		System.out.println("Titulo tem valor de compra =" + compra + " e valor de venda =" + venda);
	}

}
