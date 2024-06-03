package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList{


    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Mark Task as Done");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the task to be added: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task successfully added.");
                    break;
                case 2:
                    System.out.print("Enter the index of the task to be deleted: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Task successfully removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                    case 3:
                    System.out.println("\n--- Task List ---");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ". " + tasks.get(i));
                    }
                    break;  
            }
        }