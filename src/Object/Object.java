package Object;

import java.util.Objects;

class Model{
	String name;
	int price;
	
	 public String toString() {
		 return name + " : " + price;
	 }

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model other = (Model) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	 
	 
//	 public Boolean equals(Model that) {
//		 
//		 return this.name.equals(that.name)&& this.price==that.price;
//		 
//	 }

	 
	 
	
}

public class Object {
	
	public static void main(String args[]) {
		
		Model model=new Model();
		model.name="sunil";
		model.price=100;
		System.out.println(model);
		// System.out.println(model.name + model.price);
		
		
		Model model2 =new Model();
		model2.name="sunil";
		model.price=100;
		
         
		System.out.println(model.equals(model2));
		
	
		
	}

}
