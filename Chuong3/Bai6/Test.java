package Chuong3.Bai6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter gender: ");
        char gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter employee id: ");
        String employeeId = sc.nextLine();
        System.out.println("Enter date hired: ");
        String dateHired = sc.nextLine();
        System.out.println("Enter hours per week: ");
        int hoursPerWeek = sc.nextInt();

        PartTimeEmployee p = new PartTimeEmployee(name, age, gender, employeeId, dateHired, hoursPerWeek);
        System.out.println(p.toString());

    }
}
