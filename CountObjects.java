class Objects{
	static int count = 0;
	public void addObjects(){
		Objects o5 = new Objects();
	}
	public Objects(){
		count++;
	}
	public void printCount(){
		System.out.println(count);
	}
}

public class CountObjects{
	public static void main(String[] args) {
		Objects o1 = new Objects();
		Objects o2 = new Objects();
		Objects o3 = new Objects();
		Objects o4 = new Objects();
		o1.addObjects();
		o1.printCount();
	}
}