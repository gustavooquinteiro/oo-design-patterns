
public class CebolaCaramelizada extends CondimentoDecorator {

	protected CebolaCaramelizada(Hamburguer hamburguer) {
		super(hamburguer);
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao() + ", cebola caramelizada";
	}

	@Override
	public double calcularPreco() {
		return 0.4 + hamburguer.calcularPreco();
	}

}
