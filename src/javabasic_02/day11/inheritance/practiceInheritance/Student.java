package javabasic_02.day11.inheritance.practiceInheritance;

public class Student {
	private String name;
	private String subject;
	private int fee;
	private int returnFee;

	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}

	public void calcReturnFee() {
		if (this.subject.equals("javaprogram")) {
			this.returnFee = (int) (this.fee * 0.25);
		}
		else if (this.subject.equals("jspprogram")) {
			this.returnFee = (int) (this.fee * 0.20);
		}
		else {
			System.out.println("그런 과정명은 없습니다.");
		}
	}

	public void print() {
		System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 이며 환급금은 %d 입니다.\n",this.name, this.subject, this.fee,this.returnFee);
	}

	public static void main(String args[]){
	Student stu = new Student("장동건", "jspprogram",
			500000);
	 stu.calcReturnFee();
	stu.print();
}
}