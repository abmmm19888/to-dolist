package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public final class Todolist {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Ver tareas");
            System.out.println("4. Marcar tarea como hecha");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingrese la tarea a agregar: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Tarea agregada correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el índice de la tarea a eliminar: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Tarea eliminada correctamente.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Lista de Tareas ---");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println(i + ". " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el índice de la tarea a marcar como hecha: ");
                    int doneIndex = scanner.nextInt();
                    if (doneIndex >= 0 && doneIndex < tasks.size()) {
                        String task = tasks.get(doneIndex);
                        tasks.set(doneIndex, "[Hecho] " + task);
                        System.out.println("Tarea marcada como hecha.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }

        scanner.close();
    }
}
