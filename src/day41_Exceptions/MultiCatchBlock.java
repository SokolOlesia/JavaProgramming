package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlock {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            System.out.println(employee.getSalary());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("First");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Second");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Third");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Forth");
            e.printStackTrace();
        }

        System.out.println("Test completed");
    }
}
