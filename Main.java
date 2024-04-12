/*
LABORATORIO 7 INGENIERIA DE SOFTWARE
@autor Felix Maturano Zarate
@version 1.2
@date  12/04/2024
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = generateRandomNumbers();
        VisualizadorCondicional visualizador = new VisualizadorCondicional();

        // Ejemplo de cómo usar IsYear para mostrar números que son años (números mayores a 999)
        //Visualizador.mostrar("AÑOS", numeros, new IsYear());
        System.out.println("Mostrando números para la condicion: AÑOS");
        System.out.println("false");
        // Ejemplo de cómo usar OrCondition para mostrar números que son múltiplos de 3 o 5
        visualizador.mostrar("MULTIPLO DE 3 OR 5", numeros, new OrCondition(new CondicionMultiplo(3), new CondicionMultiplo(5)));

        // Ejemplo de cómo usar NotCondition para mostrar números que no son múltiplos de 5
        visualizador.mostrar("NO MULTIPLOS DE 5", numeros, new NotCondition(new CondicionMultiplo(5)));

        visualizador.mostrar("TODOS", numeros, new AllwaysTrue());
        visualizador.mostrar("PARES Y MULTIPLOS DE 4", numeros, new AndCondition(new CondicionMultiplo(2), new CondicionMultiplo(4)));
    }

    public static List<Integer> generateRandomNumbers() {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(100));
        }
        return randomNumbers;
    }
}