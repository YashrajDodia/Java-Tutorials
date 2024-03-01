import java.util.Scanner;

class Vowel{
	Scanner sc = new Scanner(System.in);
	String str1 = "quit";
	int acount;
	int ecount;
	int icount;
	int ocount;
	int ucount;
	int i=0;
	public void countVowels(){
		System.out.println("Just enter quit if you want to end the program....");
		while(i>=0){
	    System.out.print("Enter sentence no. " + (i+1) + " :- ");		
		String str=sc.nextLine();
		acount=0;
		ecount=0;
		icount=0;
		ocount=0;
		ucount=0;
		if(str.equals(str1)){
			break;
		}
		else{
			for (int j=0;j<str.length();j++) {
			if(str.charAt(j)==97||str.charAt(j)==65){
				acount++;
			}
			if(str.charAt(j)==101||str.charAt(j)==69){
				ecount++;
			}
			if(str.charAt(j)==105||str.charAt(j)==73){
				icount++;
			}
			if(str.charAt(j)==111||str.charAt(j)==79){
				ocount++;
			}
			if(str.charAt(j)==85||str.charAt(j)==117){
				ucount++;
			}
		   }
		}
		i++;
		System.out.println("a = "+acount+";");
		System.out.println("e = "+ecount+";");
		System.out.println("i = "+icount+";");
		System.out.println("o = "+ocount+";");
		System.out.println("u = "+ucount+";");
	  }
	}
}


public class CountVowels{
	public static void main(String[] args) {
		Vowel vc = new Vowel();
        vc.countVowels();
	}
}
