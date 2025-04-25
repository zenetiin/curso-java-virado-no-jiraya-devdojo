package academy.devdojo.maratonajava.javacore.interfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo...");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo...");
    }
    
    @Override
    public void checkPermission() {
        System.out.println("Check permission in FileLoader...");
    }
}
