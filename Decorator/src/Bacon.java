
public class Bacon extends CondimentoDecorator {

	protected Bacon(Hamburguer hamburguer) {
		super(hamburguer);
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao() + ", bacon";
	}

	@Override
	public double calcularPreco() {
		return 0.6 + hamburguer.calcularPreco();
	}

}
