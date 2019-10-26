
public class QueijoProvolone extends CondimentoDecorator {

	protected QueijoProvolone(Hamburguer hamburguer) {
		super(hamburguer);
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao() + ", queijo provolone";
	}

	@Override
	public double calcularPreco() {
		return 0.3 + hamburguer.calcularPreco();
	}

}
