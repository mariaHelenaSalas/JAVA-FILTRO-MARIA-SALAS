package com.hospital;

import java.util.Scanner;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private PacienteMenu pacienteMenu = new PacienteMenu();
    private MedicoMenu medicoMenu = new MedicoMenu();
    private EspecialidadMenu especialidadMenu = new EspecialidadMenu();
    private CitaMenu citaMenu = new CitaMenu();

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Gestión de Pacientes");
            System.out.println("2. Gestión de Médicos");
            System.out.println("3. Gestión de Especialidades");
            System.out.println("4. Gestión de Citas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    pacienteMenu.mostrarMenu();
                    break;
                case 2:
                    medicoMenu.mostrarMenu();
                    break;
                case 3:
                    especialidadMenu.mostrarMenu();
                    break;
                case 4:
                    citaMenu.mostrarMenu();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }
}

    
