package observer;

public class VisualizadorGoogle implements Observer {
	public VisualizadorGoogle() {
		
	}
	
	@Override
	public void update(Titulo a) {
		// TODO Auto-generated method stub
		System.out.println("Google aqui");
		double compra = a.getValorCompra();
		double venda = a.getValorVenda();
		System.out.println("Titulo tem valor de compra =" + compra + " e valor de venda =" + venda);
	}
	

}
