import java.util.Scanner;

class Student{
	int sum=0;
	Scanner sc = new Scanner(System.in);
	int id_No;
	int no_of_subjects_registered;
	double spi;
	public Student(int j){
		System.out.print("Enter id number of student no. "+ (j+1)+" : ");
		id_No = sc.nextInt();
		System.out.print("Enter no of subjects registered : ");
		no_of_subjects_registered = sc.nextInt();
		int[] subject_code = new int[no_of_subjects_registered];
	    int[] subject_credit = new int[no_of_subjects_registered];
		char[] grade_obtained = new char[no_of_subjects_registered];
		for (int i=0;i<no_of_subjects_registered;i++) {
			System.out.print("  Enter subject code for subject no. "+(i+1)+" : ");
			subject_code[i]=sc.nextInt();
			System.out.print("  Enter subject credit : ");
			subject_credit[i] = sc.nextInt();
			System.out.print("  Enter grade obtained in this subject : ");
			grade_obtained[i]=sc.next().charAt(0);
			if(grade_obtained[i]=='A'){
				sum = sum + (10*subject_credit[i]);
			}
			else if(grade_obtained[i]=='B'){
				sum = sum + (9*subject_credit[i]);
			} 
			else if(grade_obtained[i]=='C'){
				sum = sum + (8*subject_credit[i]);
			} 
			else if(grade_obtained[i]=='D'){
				sum = sum + (7*subject_credit[i]);
			} 
			else if(grade_obtained[i]=='E'){
				System.out.println("Sorry you are fail !");
				return;
			} 
		}
		
	}
	public double calculateSPI(){
			double spi = sum/24;
			return spi;
		}
}


public class StudentDetails{
public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter number of students : ");
		int n = sc1.nextInt();
		Student[] s = new Student[n];
		for (int i=0;i<n;i++){
			s[i] = new Student(i);
			Double spi = s[i].calculateSPI();
			System.out.println("SPI is : "+spi);
		}
	}
}	
