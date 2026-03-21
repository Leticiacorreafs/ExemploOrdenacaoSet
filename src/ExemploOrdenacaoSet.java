import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) throws Exception {
       Set<String> cores = new LinkedHashSet<>(Arrays.asList(
                "Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"
        ));

        // A
        System.out.println("Cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // B
        System.out.println("\nQuantidade: " + cores.size());

        // C
        System.out.println("\nOrdem alfabética:");
        Set<String> ordenadas = new TreeSet<>(cores);
        for (String cor : ordenadas) {
            System.out.println(cor);
        }

        // D
        System.out.println("\nOrdem inversa:");
        List<String> lista = new ArrayList<>(cores);
        Collections.reverse(lista);
        for (String cor : lista) {
            System.out.println(cor);
        }

        // E
        System.out.println("\nComeçam com V:");
        for (String cor : cores) {
            if (cor.startsWith("V")) {
                System.out.println(cor);
            }
        }

        // F
        cores.removeIf(cor -> !cor.startsWith("V"));
        System.out.println("\nApós remover:");
        System.out.println(cores);

        // G
        cores.clear();

        // H
        System.out.println("\nEstá vazio? " + cores.isEmpty());
    }
}


    




    