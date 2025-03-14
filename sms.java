package Student;

public class sms {
	private String name;
	private int studentID;
	private double grade;
	private boolean isPassing;
			
	public sms(String name, int studentID, double grade) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
		
		}
		
	public boolean updateGrade(double grade) {
		if(grade > 50) {
			isPassing = true;
		}else {
			isPassing = false;
		}
		return isPassing;
		}
		
	public void displayStudentInfo() {
		System.out.println("Student Name: " + name);
		System.out.printf("Student ID: %03d%n " , studentID);
		System.out.println("Number Grade: " + grade);
		System.out.println("Passing: " + isPassing);
	}
		
	public static void main(String[] args) {
		sms st1 = new sms("Mehvish", 0001, 91.5);
		st1.updateGrade(st1.grade);
		st1.displayStudentInfo();
		
		sms st2 = new sms("Sufi", 0002, 81.5);
		st2.updateGrade(st2.grade);
		st2.displayStudentInfo();
		
		sms st3 = new sms("Ayomide", 0003, 45.55);
		st3.updateGrade(st3.grade);
		st3.displayStudentInfo();
	}
}
