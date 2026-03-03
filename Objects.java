import java.util.Scanner;

class Marksheet {
    String name;
    int m1, m2, m3, total;
    double average;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks of 3 Subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    void calculate() {
        total = m1 + m2 + m3;
        average = total / 3.0;
    }

    void display() {
        System.out.println("\n----- Marksheet -----");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        if(average >= 50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

    public static void main(String[] args) {
        Marksheet obj = new Marksheet();
        obj.getData();
        obj.calculate();
        obj.display();
    }
}