
public class Aplicativo {
	private Estado meuestado;
	public Aplicativo(Estado e) {
		this.setMeuestado(e);
	}
	public Estado getMeuestado() {
		return meuestado;
	}


	public void setMeuestado(Estado meuestado) {
		this.meuestado = meuestado;
	}
	
	public static void main(String[] args) {
		Aplicativo a = new Aplicativo(new Offline());
		a.getMeuestado().sair(a);
		a.getMeuestado().conectar(a);
		
		a.getMeuestado().logar(a);
		a.getMeuestado().logar(a);
		
		a.getMeuestado().conectar(a);
		
		a.getMeuestado().sair(a);
		a.getMeuestado().sair(a);
	}


}
