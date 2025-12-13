import java.util.stream.StreamSupport;

class studentInfo{
    String name;
    String rollno;
    String branch;
    int age;
    double marks;

    void intro(){
        System.out.println("Hi, I am " + name + " and my age is " + age);
    }
    void details(){System.out.println("From branch " + branch + " and rollno " + rollno + " with marks " + marks);}
    void checkMarks(){
        if (marks < 35){
            System.out.println("Student FAIL");
        }else {
            System.out.println("Student PASS");
        }
    }
    void setMarks(double marks){
        if (marks < 0 || marks > 100){
            System.out.println("invalid marks");
            return;
        }
        this.marks = marks;
    }

    studentInfo(String name, String rollno, String branch, int age, double marks){
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.age = age;
        this.marks = marks;
    }

}

class student{
    public static void main(String[] args){
//        studentInfo s1 = new studentInfo();
//        s1.name = "Aashay";
//        s1.age = 22;
//        s1.intro();

//        studentInfo s2 = new studentInfo("Aashay", "CS22129", "CSE", 99, 88.8);
//        s2.intro();
//        s2.details();
//        s2.checkMarks();

        studentInfo s3 = new studentInfo("Aashay", "CS22129", "CSE", 99, 22.8);
        s3.checkMarks();

        s3.setMarks(9999);
        s3.checkMarks();
    }
}