//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir nombre de la araña
        System.out.print("Nombra a nuestra protagonista como tu quieras: ");
        String nombre = sc.nextLine();

        int distancia = 0; // en metros
        boolean sobrevive = false;
        int decisionesTomadas = 0;

        System.out.println("\nÉste es el viaje de la araña " + nombre + ".");
        System.out.println(nombre + " ha llegado al aula de DAM 1, sin saber los peligros que le esperan.\n     ");

        // Primera decisión
        System.out.println("Primera decisión: " + nombre + " desciende desde el techo con su hilo .");
        System.out.println("1) Vuelve a subir al techo.");
        System.out.println("2) Se aventura a intentar llegar al suelo.");
        System.out.print("Elige (1 o 2): ");
        int decision1 = sc.nextInt();
        decisionesTomadas++;

        if (decision1 == 1) {
            distancia += 2;
            System.out.println("\n" + nombre + " tal y como descendió, vuelve al techo rápidamente, desde donde observa todo.");
        } else {
            distancia += 1;
            sobrevive = false;
            System.out.println("\n" + nombre + " desciende hasta el suelo, donde encuentra una migaja de pan.");
        }

        // Segunda decisión
        System.out.println("\nSegunda decisión: Un fuerte ruido sacude el aula. La han visto.");
        System.out.println("1) Intenta huir por la ventana.");
        System.out.println("2) Corre hasta un abrigo cercano en busca de refugio.");
        System.out.print("Elige (1 o 2): ");
        int decision2 = sc.nextInt();
        decisionesTomadas++;

        if (decision2 == 1) {
            distancia += 1;
            System.out.println("\n" + nombre + " intenta huír por la ventana, pero está cerrada. Su única opción es un abrigo cercano.");
        } else {
            distancia += 2;
            System.out.println("\n" + nombre + " corre hacia un abrigo de una mesa cercana. Parece haber despistado a los humanos.");
        }

        // Tercera decisión
        System.out.println("\nTercera Decisión: Parece que los humanos se han ido de ese sitio.");
        System.out.println("1) Intenta de nuevo huir despaborida de aquel lugar por la ventana, ahora abierta.");
        System.out.println("2) No se fía, se queda en el abrigo.");
        System.out.print("Elige (1 o 2): ");
        int decision3 = sc.nextInt();
        decisionesTomadas++;

        if (decision3 == 1) {
            distancia += 2;
            System.out.println("\n" + nombre + "La ventana se cierra delante de sus narices. Sigue encerrada en aquella clase y no le queda otra que meterse en el abrigo, el cual comenza a zarandear");
        }else {
            distancia += 1;
            System.out.println("\nDepués de un rato, " + nombre + " pensaba en salir del abrigo, pero justo en ese momento, empezó a moverse y a doblarse");
        }

        // Cuarta decisión
        System.out.println("\nCuarta decisión: Harta de tanto bamboleo, " + nombre + " empieza a pensar en dejar el abrigo");
        System.out.println("1)" + nombre + " sigue su instinto y salta del abrigo");
        System.out.println("2)" + nombre + " no se atreve, estaría demasiado expuesta");
        System.out.print("Elige (1 o 2): ");
        int decision4 = sc.nextInt();
        decisionesTomadas++;

        if (decision4 == 1) {
            distancia += 2;
            System.out.println("\nJusto al caer al suelo, una ola de personas se dirigen hacia " + nombre + " y presa del miedo, vuelve por donde ha venido, pero esta vez, la ventana estaba abierta");
        }else {
            distancia += 1;
            System.out.println("\nAl dejar de moverse aquel dichoso abrigo " + nombre + "decide asomarse para ver que ha cambiado y... no puede ser, ha vuelto al mismo sitio, pero esta vez la ventana abierta");
        }

        String finalAventura = "";

        if (decision4 == 1) {
            distancia += 1;
            if (sobrevive) {
                finalAventura = nombre + " se dirige despaborida hacia la ventana. Por fin, ha tenido su día de suerte, y consigue escapar";
            } else {
                finalAventura =  nombre + " Corre hacia la ventana, pero justo antes de llegar, una mano humana la aplasta al instante.";
            }
        } else if (decision1 == 1) {
            distancia += 3;
            if (decision2 == 2) {
                finalAventura = nombre + " nota como aquel abrigo se mueve, y con el tambaleo, se cae al suelo. Solo puede ver humanos que la miran fijamente, además de algún grito de fondo, pero antes de darse cuenta, ya tiene un zapato encima.";
            } else {
                finalAventura = nombre + " nota como aquel abrigo se mueve, y con el tambaleo, se cae. Por suerte, cae sobre hierba. Por fin era libre.";
            }
        } else if (decision1 == 2) {
            distancia += 5;
            if (decision2 == 1) {
                finalAventura = nombre + " vuelve corriendo al abrigo y consigue escapar cuando el dueño sale del aula";
            }else {
                finalAventura = nombre + " piensa en volver al abrigo pero es pisada al momento";
            }
        }else if (decision3 == 1) {
            distancia += 6;
            if (decision4 == 2) {
                finalAventura = nombre + " corre hacia la ventana, pero la pisa alguien";
            }else {
                finalAventura = nombre + " consigue escapar cuando el dueño sale del aula";
            }
        }


        // Final de la aventura
        System.out.println("\n===== FINAL DE LA AVENTURA =====");
        System.out.println(finalAventura);

        // Resumen de estadísticas
        System.out.println("\n===== RESUMEN DE ESTADÍSTICAS =====");
        System.out.println("Nombre de la araña: " + nombre);
        System.out.println("Decisiones tomadas: " + decisionesTomadas);
        System.out.println("Distancia total recorrida: " + distancia + " metros");
        System.out.println("¿Consiguió sobrevivir? " + (sobrevive? "Sí" : "No"));

        sc.close();
    }
}


