package main;

import philosophers.DinningRoomPorter;
import philosophers.Fork;
import philosophers.Philosopher;
import views.ControlViews;

/**
 * Programa 2 de la tarea 02 de PSP de DAM, Problema de la cena de los Filósofos,
 * Se resuelve utilizando un Portero del Comedor con n-1 plazas o turnos en relación al número
 * de Filósofos y si un filósofo tarda en conseguir el segundo tenedor pierde el turno.
 * <p>
 * El programa ejecuta los hilos de forma concurrente mediante monitores.
 * <p>
 * Paquete: {@link vistas} contiene todas las interfaces gráficas y sus clases relacionadas con la interface.
 * Paquete: {@link utilidades} contiene todas las clases que aportan utilidad a la ejecución del programa.
 * Paquete: {@link logica} contiene todas las clases que tiene la estructura principal del programa.
 * Paquete: {@link filosofos} contiene todas las clases realcionadas con los hilos {@link Philosopher}.
 * y con los recursos {@link DinningRoomPorter} y con los {@link Fork}.
 * Paquete: images contiene todas las imágenes del programa.
 */
public class Main {

    /**
     * @param args No contempla argumentos
     */
    public static void main(String[] args) {
        new ControlViews();
    }

}
