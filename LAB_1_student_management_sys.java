class student{
    int id;
    String name;
    int age;
    String department;
    double cgpa;
     public student(int id,String name,int age,String department,double cgpa){
    this.id=id;
    this.name= name;
    this.age= age;
    this.department= department;
    this.cgpa=cgpa;
    }
    void displayStudent(){
        System.out.println("ID:"+id);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("department:"+department);
        System.out.println("cgpa:"+cgpa);
    }
    void updateCGPA(double newcgpa){
        cgpa = newcgpa;
    }
}

public class LAB_1_student_management_sys {
    public static void main(String[] args) {
        System.out.println("STIDENT 1:");
        student s1 = new student(12, "harry", 19, " UBIT", 3.50);
        s1.displayStudent();
         System.out.println("STIDENT 2:");
        student s2 = new student(13, "ali", 19, " UBIT", 3.60);
        s2.displayStudent();
         System.out.println("STIDENT 3:");
        student s3 = new student(14, "shawn", 19, " UBIT", 3.70);
        s3.displayStudent();
    }
}
