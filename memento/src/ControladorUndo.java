import java.util.ArrayList;
import java.util.List;

public class ControladorUndo {

	private List<MementoWeather> mementoList = new ArrayList<MementoWeather>();

	public void add(MementoWeather memento) {
		mementoList.add(memento);
	}
	
	public MementoWeather get(int index) {
		return mementoList.get(index);
	}
	
	public MementoWeather undo() {
		return get(mementoList.size() - 1);
	}
}
