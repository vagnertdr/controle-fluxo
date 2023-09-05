public class CondicaoTernaria {
    public static void main(String[] args) {
        // Refatorando as aulas anteriores utilizando a condição Ternária
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado"  : "Reprovado";
        System.out.println("Caso Simples: " + resultado);

        String resultado2 = nota >=7 ? "Aprovado"  : nota >= 5 && nota < 7 ? "Aluno em Recuperação" : "Reprovado Direto";
        // Na linha acima se emprega o uso de mais de uma condição no modelo Ternário.
        System.out.println("Caso Complexo: " + resultado2);

    }
}
