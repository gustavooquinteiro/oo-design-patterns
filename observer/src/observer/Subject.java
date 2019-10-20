package observer;

public interface Subject {

	public void registerObserver(Observer a);
	public void removeObserver(Observer a);
	public void notifyall();
}
