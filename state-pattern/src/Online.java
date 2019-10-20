
public class Online extends Estado {

	@Override
	public void logar(Aplicativo a) {
		System.out.println("Voce ja esta online");

	}

	@Override
	public void sair(Aplicativo a) {
		System.out.println("Saindo..");
		a.setMeuestado(new Offline());

	}

	@Override
	public void conectar(Aplicativo a) {
		System.out.println("Conectando..");
		a.setMeuestado(new Conectado());

	}

}
