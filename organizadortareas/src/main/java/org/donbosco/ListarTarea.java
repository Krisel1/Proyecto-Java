package org.donbosco;

public class ListarTarea {

    static final int MAX_TAREAS = 100;
    static String[] tareas = new String[MAX_TAREAS];
    static boolean[] completadas = new boolean[MAX_TAREAS];
    static int contadorTareas = 0;

    public static void listarTareas() {
        System.out.println("\nLista de Tareas:");
        for (int i = 0; i < contadorTareas; i++) {
            String estado = completadas[i] ? "[Completada]" : "[Pendiente]";
            System.out.println(i + ". " + tareas[i] + " " + estado);
        }
    }

    public static void marcarTareaComoCompletada(int indice) {
        if (indice >= 0 && indice < contadorTareas) {
            completadas[indice] = true;
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("Índice no válido.");
        }
    }
}
 

