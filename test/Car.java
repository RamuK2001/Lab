package test;

import java.util.*;

public class Car implements Comparable<Car>{
	public String model;
	public String color;
	Car(String model,String color){
		this.model = model;
		this.color = color;
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(model, other.model);
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}
	@Override
	public int compareTo(Car o) {
		if(model.compareTo(o.model) == 0) {
			return color.compareTo(o.color);
		}
		return model.compareTo(o.model);
	}
}