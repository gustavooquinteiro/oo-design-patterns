
public class Online extends Estado {
	private static Online instancia;
	
	private Online () {}
	
	@Override
	public void logar() {
		System.out.println("Voce ja esta online");

	}

	@Override
	public void sair() {
		System.out.println("Saindo..");
		Aplicativo.getInstancia().setMeuestado(Offline.getInstancia());

	}

	@Override
	public void conectar() {
		System.out.println("Conectando..");
		Aplicativo.getInstancia().setMeuestado(Conectado.getInstancia());
	}

	public static Online getInstancia() {
		if (instancia == null)
			instancia = new Online();
		return instancia;
	}
}
