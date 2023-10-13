package org.example;

import org.example.model.Movie;
import org.example.model.Session;
import org.example.model.Theater;
import com.google.gson.Gson;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class SerializationExercises {
    /*
        Should define the class for the concepts Movie, Theater and Session.
        A session is a play of movie in a theater.
        Create 2 instances of each class and relate among them.
        Serialize to Json all objects and save then in different files.
     */
    public static class Exercise1 implements java.io.Serializable {
        public static void main(String[] args) {
            Movie movie = new Movie("Pepe", "Barbie", 120);
            Theater theater = new Theater("Guanarteme", 160);
            Session session = new Session(3, 16, 30, movie, theater);
            Gson json = new Gson();
            String jsson = json.toJson(theater);
            try (BufferedWriter escribir = new BufferedWriter(new FileWriter("C:/Users/cgsos/OneDrive/Documentos/ejemplo.txt")
            )) {
                escribir.write(jsson);

            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
    }
    /*
        Deserialize the objects created in exercise 1.
        Now serialize them using ObjectOutputStream
     */
    public static class Exercise2 {

        public static void main(String[] args) {
            Theater theater2 = new Theater("Mesa y Lopez", 100);
            Gson json = new Gson();
            String jsson_2 = json.toJson(theater2);
            //Deserializo los objetos creados del ejercicio 1
            try {
                BufferedReader bufer = new BufferedReader(new FileReader("C:/Users/cgsos/OneDrive/Documentos/ejemplo.txt")
                );
                String leer= bufer.readLine();
                System.out.println(leer);
            }catch (Exception exception) {
                throw new RuntimeException(exception);
            }try {
                //Serializo con ObjectOutputStream
                ObjectOutputStream fichero_theater = new ObjectOutputStream(new FileOutputStream("C:/Users/cgsos/OneDrive/Documentos/ejemplo_2.txt"));
                fichero_theater.writeObject(jsson_2);
            }catch (Exception exception){
                throw new RuntimeException(exception);
            }
        }
    }


    /*
       Deserialize the objects from the binary files created in exercise 2.
    */
    public static class Exercise3 {

        public static void main(String[] args) {
            try {
                ObjectInputStream leer_fichero = new ObjectInputStream(new FileInputStream("C:/Users/cgsos/OneDrive/Documentos/ejemplo_2.txt"));
                Theater leido = (Theater) leer_fichero.readObject();
                System.out.println(leido);
            }catch (Exception e){
                }
        }
    }
}
