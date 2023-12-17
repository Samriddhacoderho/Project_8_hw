import models.Students;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] marks1={90,80,70,60,70,80,90,100};
        int[] marks2={10,20,30,40,50,60,70,80};
        int[] marks3={2,100,20,50,70,75,87,89};

        Students std_1=new Students("Samriddha Raj Satyal",17,marks1,'A');
        Students std_2=new Students("Sparsh Pangeni",16,marks2,'C');
        Students std_3=new Students("Nayem Raj Angdambey",18,marks3,'B');

        std_1.getResult();
        std_2.getResult();
        std_3.getResult();
    }
}