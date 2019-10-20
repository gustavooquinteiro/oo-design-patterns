
public class Offline extends Estado{
	private static Offline instancia;
	
	private Offline() {}
	
	@Override
	public void logar() {
		System.out.println("Fazendo login...");
		Aplicativo.getInstancia().setMeuestado(Online.getInstancia());	
	}

	@Override
	public void sair() {
		System.out.println("Voc� n�o est� offline");
	}

	@Override
	public void conectar() {
		System.out.println("Impossivel conectar, voc� est� offline");
		
	}

	public static Offline getInstancia() {
		if (instancia == null)
			instancia = new Offline();
		return instancia;
	}
		
}
