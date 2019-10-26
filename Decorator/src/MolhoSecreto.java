
public class MolhoSecreto extends CondimentoDecorator {

	protected MolhoSecreto(Hamburguer hamburguer) {
		super(hamburguer);
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao() + ", molho secreto da casa";
	}

	@Override
	public double calcularPreco() {
		return 0.9 + hamburguer.calcularPreco();
	}

}
