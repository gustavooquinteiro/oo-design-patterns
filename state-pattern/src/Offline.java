
public class Offline extends Estado{

	@Override
	public void logar(Aplicativo a) {
		System.out.println("Fazendo login...");
		a.setMeuestado(new Online());
		
	}

	@Override
	public void sair(Aplicativo a) {
		System.out.println("Voc� n�o est� offline");
	}

	@Override
	public void conectar(Aplicativo a) {
		System.out.println("Impossivel conectar, voc� est� offline");
		
	}

}
