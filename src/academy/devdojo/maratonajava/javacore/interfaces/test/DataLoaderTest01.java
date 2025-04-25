package academy.devdojo.maratonajava.javacore.interfaces.test;

import academy.devdojo.maratonajava.javacore.interfaces.domain.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

    }
}
