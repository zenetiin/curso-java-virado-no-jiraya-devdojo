package academy.devdojo.maratonajava.introducao;



public class Arrays2 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Goku";  
        nomes[1] = "Vegeta";
        nomes[2] = "Gohan";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("O nome é: " + nomes[i]);
        }   


    }
}
