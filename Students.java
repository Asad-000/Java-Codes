class Student {
    String Name;
    int rollNo;
    double marks;
    public static void calculateGrade(Student s) {
    if(s.marks > 80) {
        System.out.println(s.Name + " A grade");
    }
    else if(s.marks > 70) {
        System.out.println(s.Name + " B grade");
    }
    else if(s.marks < 50) {
        System.out.println(s.Name + " F grade");
    }
}
}

public class Students {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Asad";
        s1.rollNo = 3026;
        s1.marks = 88.6;

        Student s2 = new Student();
        s2.Name = "Ali";
        s2.rollNo = 3078;
        s2.marks = 72.3;

        Student s3 = new Student();
        s3.Name = "Rubab";
        s3.rollNo = 3054;
        s3.marks = 48.6;

        s1.calculateGrade(s1);
        s2.calculateGrade(s2);
        s3.calculateGrade(s3);
    }
}