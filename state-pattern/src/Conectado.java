
public class Conectado extends Estado {

	@Override
	public void logar(Aplicativo a) {
		System.out.println("Voc� j� est� online..");

	}

	@Override
	public void sair(Aplicativo a) {
		System.out.println("Saindo..");
		a.setMeuestado(new Online());

	}

	@Override
	public void conectar(Aplicativo a) {
		System.out.println("Voc� j� est� conectado");

	}

}
