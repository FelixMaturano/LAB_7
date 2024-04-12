import java.util.List;
class VisualizadorCondicional {
    public void mostrar(String condicion, List<Integer> numeros, ICondicion condicionAplicar) {
        System.out.println("Mostrando números para la condicion: " + condicion);
        for (Integer numero : numeros) {
            if (condicionAplicar.cumple(numero)) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}