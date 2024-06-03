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
            }
        }