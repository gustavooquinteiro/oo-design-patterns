
public class MolhoBarbecue extends CondimentoDecorator {

	protected MolhoBarbecue(Hamburguer hamburguer) {
		super(hamburguer);
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao() + ", molho barbecue";
	}

	@Override
	public double calcularPreco() {
		return 0.5 + hamburguer.calcularPreco();
	}

}
