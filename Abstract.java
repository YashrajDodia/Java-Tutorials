abstract class Vegetables{
	String color;

}

class Potato extends Vegetables{
	Potato(String color){
		this.color = color;
	}

	public String toString(){
		return "Vegetable : Potato"+" " + "Color name : " + color;
	}
}

class Tomato extends Vegetables{
	Tomato(String color){
		this.color = color;
	}
	public String toString(){
		return "Vegetable : Tomato"+" " + "Color name : " + color;
	}
}

class Brinjal extends Vegetables{
	Brinjal(String color){
		this.color = color;
	}

	public String toString(){
		return "Vegetable : Brinjal"+" " + "Color name : " + color;
	}
}

public class Abstract{
	public static void main(String[] args) {
		Potato p = new Potato("brown");
		String str = p.toString();
		System.out.println(str);
		Tomato t = new Tomato("red");
		String str1 = t.toString();
		System.out.println(str1);
		Brinjal b = new Brinjal("purple");
		String str2 = b.toString();
		System.out.println(str2);
	}
}