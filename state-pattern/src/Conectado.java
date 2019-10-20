
public class Conectado extends Estado {

	@Override
	public void logar(Aplicativo a) {
		System.out.println("Você já está online..");

	}

	@Override
	public void sair(Aplicativo a) {
		System.out.println("Saindo..");
		a.setMeuestado(new Online());

	}

	@Override
	public void conectar(Aplicativo a) {
		System.out.println("Você já está conectado");

	}

}
