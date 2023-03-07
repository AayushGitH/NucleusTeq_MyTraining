package Training.week_4.classes;

public class Student 
{
	// Properties
		private int rollNumber;
		private String name;
		private String course;
		private int marks1;
		private int marks2;
		private int marks3;
		
		// Constructor
		public Student(int rollNumber, String name, String course, int marks1, int marks2, int marks3) {
			super();
			this.rollNumber = rollNumber;
			this.name = name;
			this.course = course;
			this.marks1 = marks1;
			this.marks2 = marks2;
			this.marks3 = marks3;
		}
		
		// toString()
		@Override
		public String toString() {
			return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", marks1=" + marks1
					+ ", marks2=" + marks2 + ", marks3=" + marks3 + "]";
		}
		
		// Getters and Setters
		public int getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public int getMarks1() {
			return marks1;
		}
		public void setMarks1(int marks1) {
			this.marks1 = marks1;
		}
		public int getMarks2() {
			return marks2;
		}
		public void setMarks2(int marks2) {
			this.marks2 = marks2;
		}
		public int getMarks3() {
			return marks3;
		}
		public void setMarks3(int marks3) {
			this.marks3 = marks3;
		}
		
		// Methods
		public int calculateTotal()
		{
			return this.marks1+this.marks2+this.marks3;
		}
		
		public double calculateAverage()
		{
			return (this.marks1+this.marks2+this.marks3)/3;
		}
		
		public void calculateGrade()
		{
			if(calculateAverage()>60)
			{
				System.out.println("First grade");
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Second grade");
				System.out.println("Fail");
			}
		}
}
