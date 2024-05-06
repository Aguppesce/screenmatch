import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");


        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;


        System.out.println("Película: " + nombre);
        System.out.println("Fecha lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluido en el plan básico: " + incluidoEnElPlanBasico);
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);
        //System.out.println(sinopsis);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingresa la nota que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la película " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}