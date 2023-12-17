package models;

public class Students {
    String name;
    int age;
    int[] marks;
    char grade;

    public Students(String name, int age, int[] marks, char grade) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void getResult(){
        String student_name=this.name;
        int student_age=this.age;
        int[] student_marks=this.marks;
        char student_grade=this.grade;
        String[] subjects={"English","Nepali","Math","Physics","Chem","Comp","Python","Java"};
        int total=0;
        double student_percentage;

        System.out.println("Deerwalk Sifal School");
        System.out.println("**First Term Report Card**");
        System.out.println("Name:"+student_name+"\t\t\tAge:"+student_age);
        System.out.println("\n\nResults:");

        for(int i=0;i<student_marks.length;i++){
            System.out.println(subjects[i]+":"+student_marks[i]);
            total=total+student_marks[i];
        }
        student_percentage=total/8;

        System.out.println("\n\nObtained Percentage:"+student_percentage);
        System.out.println("Grade:"+student_grade);

    }
}
