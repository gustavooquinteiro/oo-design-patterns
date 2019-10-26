
public abstract class CondimentoDecorator extends Hamburguer {
	
	Hamburguer hamburguer;

	protected CondimentoDecorator(Hamburguer hamburguer) {
		this.hamburguer = hamburguer;
	}
	
	public String getDescricao() {
		return hamburguer.getDescricao();
	}

}
