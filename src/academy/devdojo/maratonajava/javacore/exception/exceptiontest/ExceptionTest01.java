package academy.devdojo.maratonajava.javacore.exception.exceptiontest;
import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("C:\\Users\\jose_\\OneDrive\\Área de Trabalho\\vscode\\JAVA\\atividades\\javinha\\arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}