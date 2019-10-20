
public class Aplicativo {
	private static Aplicativo instancia;
	private Estado meuestado;
	private Aplicativo(Estado s) {		
		this.setMeuestado(s);
	}
	
	public Estado getMeuestado() {
		return meuestado;
	}

	public static Aplicativo getInstancia() {
		if (instancia == null)
			instancia = new Aplicativo(Offline.getInstancia());
		return instancia;
	}

	public void setMeuestado(Estado meuestado) {
		this.meuestado = meuestado;
	}
	
	public static void main(String[] args) {
		Aplicativo a = Aplicativo.getInstancia();
		a.getMeuestado().sair();
		a.getMeuestado().conectar();
		
		a.getMeuestado().logar();
		a.getMeuestado().logar();
		
		a.getMeuestado().conectar();
		
		a.getMeuestado().sair();
		a.getMeuestado().sair();
	}


}
