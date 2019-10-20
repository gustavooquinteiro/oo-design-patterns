
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
		System.out.println("Você não está offline");
	}

	@Override
	public void conectar() {
		System.out.println("Impossivel conectar, você está offline");
		
	}

	public static Offline getInstancia() {
		if (instancia == null)
			instancia = new Offline();
		return instancia;
	}
		
}
