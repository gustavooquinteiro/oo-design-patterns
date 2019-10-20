
public class Offline extends Estado{

	@Override
	public void logar(Aplicativo a) {
		System.out.println("Fazendo login...");
		a.setMeuestado(new Online());
		
	}

	@Override
	public void sair(Aplicativo a) {
		System.out.println("Você não está offline");
	}

	@Override
	public void conectar(Aplicativo a) {
		System.out.println("Impossivel conectar, você está offline");
		
	}

}
