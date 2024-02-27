import java.util.Scanner;

class Student{
	Scanner sc = new Scanner(System.in);
	int id_No;
	int no_of_subjects_registered;
	int subject_code;
	int subject_credit;
	char grade_obtained;
	double spi;
	public Student(){
		System.out.print("Enter id number : ");
		id_No = sc.nextInt();
		System.out.print("Enter no of subjects registered : ");
		no_of_subjects_registered = sc.nextInt();
		System.out.print("Enter subject code : ");
		subject_code = sc.nextInt();
		System.out.print("Enter grade obtained : ");
		grade_obtained = sc.next().charAt(0);
	}

	public double calculateSPI(){
		if(grade_obtained=='A'){
			return 10;
		}
		else if(grade_obtained=='B'){
			return 9;
		}
		else if(grade_obtained=='C'){
			return 7;
		}
		else if(grade_obtained=='D'){
			return 5;
		}
		else{
			System.out.println("You are Fail");
			return 0;
		}
	}
}

public class StudentDetails{
public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int n = sc1.nextInt();
		Student[] s = new Student[n];
		for (int i=0;i<n;i++){
			s[i] = new Student();
			Double spi = s[i].calculateSPI();
			System.out.println("SPI is : "+spi);
		}
	}
}	