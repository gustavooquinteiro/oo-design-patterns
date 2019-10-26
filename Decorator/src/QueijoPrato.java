
public class QueijoPrato extends CondimentoDecorator {

	protected QueijoPrato(Hamburguer hamburguer) {
		super(hamburguer);
	}
	
	public String getDescricao() {
		return super.getDescricao() + ", queijo prato";
	}

	@Override
	public double calcularPreco() {
		return 0.2 + hamburguer.calcularPreco();
	}

}
