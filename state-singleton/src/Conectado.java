
public class Conectado extends Estado {
	private static Conectado instancia;
	
	private Conectado(){}
	
	@Override
	public void logar() {
		System.out.println("Você já está online..");

	}

	@Override
	public void sair() {
		System.out.println("Saindo..");
		Aplicativo.getInstancia().setMeuestado(Online.getInstancia());
	}

	@Override
	public void conectar() {
		System.out.println("Você já está conectado");

	}

	public static Conectado getInstancia() {
		if (instancia == null)
			instancia = new Conectado();
		return instancia;
	}

}
