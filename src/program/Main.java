package program;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int employeeNumber = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i=1;i<=employeeNumber;i++){
            System.out.print("Employee #" + i + " data:\n");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (outsourced == 'n' || outsourced == 'N')
            {
                employees.add(new Employee(name, hours, valuePerHour));
            }
            if (outsourced == 'y' || outsourced == 'Y')
            {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }

        System.out.print("\nPAYMENTS:\n");
        for (Employee e : employees){
            System.out.print(e.toString());
        }
    }
}