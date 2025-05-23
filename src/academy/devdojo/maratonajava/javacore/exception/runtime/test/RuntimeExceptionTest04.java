package academy.devdojo.maratonajava.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do catch ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do catch IndexOutOfBoundsException");
        }  catch (RuntimeException e) {
            System.out.println("Dentro do catch RuntimeException");
        } 

        try{
            talvezLanceException();
        } catch (IOException | SQLException e){
            e.printStackTrace();
        } 
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}