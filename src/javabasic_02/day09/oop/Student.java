package javabasic_02.day09.oop;

public class Student {

    // Student 멤버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;
    String gender;
    private int[] scores;
    private int total;


    // 생성자를 통하여 학생 객체의 필드를 초기화
    Student() { } // 기본 생성자

    // 생성자 메소드 오버로딩
    Student(String stu_name, int[] scores){
        this.stu_name = stu_name;
        this.scores = scores;
    }

    Student(String stu_name, String stu_ssn) {
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
    }
    Student(String stu_name, Integer stu_age, String address, String stu_ssn) {
        this.stu_name = stu_name;
        this.stu_age = stu_age;
        this.address = address;
        this.stu_ssn = stu_ssn;
    }

    // Object 클래스의 toString() 오버라이딩
    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssn='" + stu_ssn + '\'' +
                '}';
    }

    public String getStu_name() {
        return stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public String getAddress() {
        return address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

    public void getStu_scores() {
        System.out.printf("%s의 국어, 영어, 수학 점수는 : %d, %d, %d\n",this.stu_name,this.scores[0],this.scores[1],this.scores[2]);
    }
    public void getStu_total_avg() {
        int total = 0;
        for (int score : scores) {
            total+=score;
        }
        System.out.printf("%s의 총점과 평균 점수는 : %d, %d\n", this.stu_name ,total,total/this.scores.length);
    }

}
