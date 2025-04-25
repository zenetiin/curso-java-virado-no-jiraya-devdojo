package academy.devdojo.maratonajava.introducao;

public class ForExercicio {

    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " no valor de R$ " + valorParcela);
            
            
        }
    }
}