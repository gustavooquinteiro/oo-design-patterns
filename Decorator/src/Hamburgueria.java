
public class Hamburgueria {

	public static void main(String[] args) {
		Hamburguer cliente1 = new DeCarne();
		cliente1 = new MolhoBarbecue(cliente1);
		cliente1 = new QueijoPrato(cliente1);
		cliente1 = new Bacon(cliente1);
		
		System.out.println(cliente1.getDescricao() + " R$ " + cliente1.calcularPreco());
		
		Hamburguer cliente2 = new CebolaCaramelizada(new QueijoProvolone(new MolhoSecreto(new DeFrango())));
		System.out.println(cliente2.getDescricao() + " R$ " + cliente2.calcularPreco());
	}

}
