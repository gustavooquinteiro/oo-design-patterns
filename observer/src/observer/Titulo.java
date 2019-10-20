package observer;

import java.util.ArrayList;

public class Titulo implements Subject{
	private int codigo;
	private double valorCompra;
	private double valorVenda;
	private String dataLancamento;
	private String dataVencimento;
	private ArrayList<Observer> observers;
	
	public Titulo(int codigo, double valorCompra, double valorVenda, String data, String vencimento) {
		// TODO Auto-generated constructor stub
		this.codigo = codigo;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.dataLancamento = data;
		this.dataVencimento = vencimento;
		this.observers = new ArrayList<>();
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
		notifyall();
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
		notifyall();
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public void registerObserver(Observer a) {
		// TODO Auto-generated method stub
		this.observers.add(a);
	}
	@Override
	public void removeObserver(Observer a) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(a);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	@Override
	public void notifyall() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this);
		}
	}
	
	

}
