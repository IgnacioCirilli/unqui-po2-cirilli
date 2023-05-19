package ar.edu.unq.po2.tp9Composite.ej6;

import java.util.Arrays;
import java.util.List;

public class Shape implements IShapeShifter {

	private Integer value;
	
	public Shape(Integer value) {
		super();
		this.setValue(value);
	}
	
	public Integer getValue() {
		return value;
	}

	private void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shape) {
		return this;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		return Arrays.asList(this.getValue());
	}
}