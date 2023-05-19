package ar.edu.unq.po2.tp9Composite.ej6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeShifter implements IShapeShifter {
	
	private List<IShapeShifter> shapes;
	
	public ShapeShifter() {
		super();
		this.setShapes(new ArrayList<IShapeShifter>());
	}

	public List<IShapeShifter> getShapes() {
		return shapes;
	}

	private void setShapes(List<IShapeShifter> shapes) {
		this.shapes = shapes;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shape) {
		return null;
	}

	@Override
	public int deepest() {
		return this.getShapes()
				   .stream()
				   .mapToDouble();
	}

	@Override
	public IShapeShifter flat() {
		
		List<IShapeShifter> flatList = this.getShapes()
										   .stream()
										   .flatMap(Collection::stream)
										   .collect(Collectors.toList());
		
		return flatList;
	}

	@Override
	public List<Integer> values() {
		return this.getShapes().stream().map(s -> s.values()).;
	}
	
	public void addShape(IShapeShifter shape) {
		this.getShapes().add(shape);
	}
	
	public void removeShape(IShapeShifter shape) {
		this.getShapes().remove(shape);
	}
}
