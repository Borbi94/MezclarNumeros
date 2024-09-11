import java.util.ArrayList;
import java.util.List;

public class MezclarNumeros {

    public static List<Integer> merge(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> mezclacion = new ArrayList<>();
        int i = 0, j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                mezclacion.add(lista1.get(i));
                i++;
            } else {
                mezclacion.add(lista2.get(j));
                j++;
            }
        }
        while (i < lista1.size()) {
            mezclacion.add(lista1.get(i));
            i++;
        }
        while (j < lista2.size()) {
            mezclacion.add(lista2.get(j));
            j++;
        }

        return mezclacion;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Ingrese los números que quieras mezclar:");
            return;
        }
        List<Integer> lista1 = convertirStringALista(args[0]);
        List<Integer> lista2 = convertirStringALista(args[1]);
        List<Integer> resultado = merge(lista1, lista2);
        System.out.println(resultado);
    }
    private static List<Integer> convertirStringALista(String str) {
        List<Integer> list = new ArrayList<>();
        String[] numeros = str.split(",");
        for (String numero : numeros) {
            list.add(Integer.parseInt(numero.trim()));
        }
        return list;
    }
}
