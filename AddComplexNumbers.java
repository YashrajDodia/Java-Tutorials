import java.util.Scanner;
class ComplexNumbers{
	int x;
	int y;
	public ComplexNumbers(){
       x=5;
       y=6;
	}
	public ComplexNumbers(int x, int y){
       this.x = x;
       this.y = y;
	}
	public void addComplexNumbers(ComplexNumbers c1, ComplexNumbers c2){
       this.x = c1.x+c2.x;
       this.y = c1.y+c2.y;
       System.out.println(x+" + "+y+"i");
	}
}

public class AddComplexNumbers{
public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int x=0;
		int y=0;
		System.out.print("Enter x and y for equation 1 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		ComplexNumbers c1 = new ComplexNumbers(x,y);
		ComplexNumbers c2 = new ComplexNumbers();
		ComplexNumbers c3 = new ComplexNumbers(0,0);
		c3.addComplexNumbers(c1,c2);
	}
}	
