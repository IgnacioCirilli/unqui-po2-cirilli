package ar.edu.unq.po2.tp9Composite.ej6;

import java.util.List;

public interface IShapeShifter {

	public IShapeShifter compose(IShapeShifter shape);
	
	public int deepest();
	
	public IShapeShifter flat();
	
	public List<Integer> values();
}
