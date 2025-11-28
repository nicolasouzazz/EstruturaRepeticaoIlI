public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Estrutura de Repetição III");
        System.out.println("==============================");

        /*
         * Exemplo do for
         * for (int i = 0; i <= 5; i++) {
         * System.out.println("Valor de i: " + i);
         * System.out.println("==============================");
         * }
         * System.out.println("Fim do Programa!");
         * System.out.println("==============================");
         */

        /* EX1- Uso do for para contar de 10 em 10 até 100 */
        System.out.println("Contagem de 10 em 10 até 100");
        System.out.println("==============================");
        for (int i = 10; i <= 100; i += 10) {
            System.out.println("Contagem:" + i);
            System.out.println("==============================");
        }
    }
}
