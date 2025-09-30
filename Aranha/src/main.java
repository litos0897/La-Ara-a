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
        System.out.println(nombre + " ha llegado al aula de DAM 1, sin saber los peligros que le esperan.\n");

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
        System.out.println("\nParece que los humanos se han ido de ese sitio.");
        System.out.println("1) Intenta de nuevo huir despaborida de aquel lugar por la ventana, ahora abierta.");
        System.out.println("2) No se fía, se queda en el abrigo.");
        System.out.print("Elige (1 o 2): ");
        int decision3 = sc.nextInt();
        decisionesTomadas++;

        String finalAventura = "";

        if (decision3 == 1) {
            distancia += 1;
            if (sobrevive) {
                finalAventura = nombre + " ha tenido su día de suerte, y por fin consigue escapar";
            } else {
                finalAventura = nombre + " se deja llevar por el pánico, y justo cuándo parecía que podía huir, la ventana se cerró, aplastándola al instante.";
            }
        } else {
            distancia += 3;
            if (decision1 == 1 && decision2 == 2) {
                finalAventura = nombre + " nota como aquel abrigo se mueve, y con el tambaleo, se cae al suelo. Solo puede ver humanos que la miran fijamente, además de algún grito de fondo, pero antes de darse cuenta, ya tiene un zapato encima.";
            } else {
                finalAventura = nombre + " nota como aquel abrigo se mueve, y con el tambaleo, se cae. Por suerte, cae sobre hierba. Por fin era libre.";
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


