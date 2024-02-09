package Arrays.BasicOperations;
import java.util.ArrayList;
import java.util.List;

// Represents a work shift
class Shift {
    String day;
    String time;
    Employee employee; // Employee assigned to this shift

    // Constructor to initialize the shift with day and time
    public Shift(String day, String time) {
        this.day = day;
        this.time = time;
        this.employee = null; // Initially, no employee is assigned to this shift
    }

    // Method to assign an employee to this shift
    public void assignEmployee(Employee employee) {
        this.employee = employee;
    }

    // Method to convert shift details to string for printing
    @Override
    public String toString() {
        return day + ": " + time;
    }
}

// Represents an employee
class Employee {
    String name;
    List<Shift> shifts; // List of shifts assigned to this employee
    int morningShiftCount; // Counter for morning shifts
    int afternoonShiftCount; // Counter for afternoon shifts

    // Constructor to initialize employee with a name
    public Employee(String name) {
        this.name = name;
        this.shifts = new ArrayList<>();
        this.morningShiftCount = 0;
        this.afternoonShiftCount = 0;
    }

    // Method to add a shift for this employee
    public void addShift(String day, String time) {
        Shift shift = new Shift(day, time);
        shifts.add(shift); // Add the shift to the employee's list of shifts
        shift.assignEmployee(this); // Assign this employee to the shift

        // Update shift counts based on shift time
        if (time.equals("8 AM - 5 PM")) {
            morningShiftCount++;
        } else if (time.equals("1 PM - 10 PM")) {
            afternoonShiftCount++;
        }
    }

    // Method to convert employee details to string for printing
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");
        for (Shift shift : shifts) {
            sb.append(shift).append("\n");
        }
        return sb.toString();
    }

    // Getter method for morning shift count
    public int getMorningShiftCount() {
        return morningShiftCount;
    }

    // Getter method for afternoon shift count
    public int getAfternoonShiftCount() {
        return afternoonShiftCount;
    }

    // Method to calculate total working hours for this employee
    public int getTotalWorkingHours() {
        return (morningShiftCount + afternoonShiftCount) * 9; // Each shift is 9 hours now
    }
}

public class WorkingHoursProgram {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create employee instances
        Employee employeeOne = new Employee("Employee One");
        Employee employeeTwo = new Employee("Employee Two");
        Employee employeeThree = new Employee("Employee Three");
        Employee employeeFour = new Employee("Employee Four");

        // Assign shifts equally to employees
        assignShiftsEqually(employeeOne, employeeTwo, employeeThree, employeeFour);

        // Add employees to the list
        employees.add(employeeOne);
        employees.add(employeeTwo);
        employees.add(employeeThree);
        employees.add(employeeFour);

        // Print daily breakdown
        System.out.println("Daily Breakdown:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Print statistics for each employee
        System.out.println("\nTotal working hours for Employees in a week:");
        for (Employee employee : employees) {
            System.out.println(employee.name + " In a week:");
            System.out.println("Number of morning shifts: " + employee.getMorningShiftCount());
            System.out.println("Number of afternoon shifts: " + employee.getAfternoonShiftCount());
            System.out.println("Total number of shifts: " + (employee.getMorningShiftCount() + employee.getAfternoonShiftCount()));
            System.out.println("Total working hours: " + employee.getTotalWorkingHours() + " hours");
            System.out.println();
        }
    }

    // Helper method to assign shifts equally among employees
    public static void assignShiftsEqually(Employee... employees) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] shifts = {"8 AM - 5 PM", "1 PM - 10 PM"};

        int dayIndex = 0; // Index for days array
        int shiftIndex = 0; // Index for shifts array

        // Loop through each employee
        for (Employee employee : employees) {
            // Loop through each day of the week
            for (int i = 0; i < 5; i++) {
                String day = days[dayIndex]; // Get the current day
                String time = shifts[shiftIndex]; // Get the current shift time
                employee.addShift(day, time); // Add the shift for this employee

                // Update indices for next shift assignment
                dayIndex = (dayIndex + 1) % 5; // Move to the next day (loop back to Monday if Friday is reached)
                shiftIndex = (shiftIndex + 1) % 2; // Move to the next shift time (morning or afternoon)
            }
        }
    }
}
