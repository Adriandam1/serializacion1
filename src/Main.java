import java.io.*;

public class Main {
    public static void main(String[] args) {
        // con tres valores:  "ola",-7, 2.7E10
        mclase object1 = new mclase("ola", -7, 2.7E10);

        // Serializar el objeto fichero 'serial'
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.dat"))) {
            oos.writeObject(object1);
            System.out.println("Obxecto gravado correctamente en 'serial.dat'.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar o obxecto: " + e.getMessage());
        }

        // Crear un obxecto baleiro de mclase
        mclase object2 = null;

        //ruta project C:\Users\Usuario\IdeaProjects\serializacion1

        // Deserializar o obxecto desde o ficheiro 'serial'
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.dat"))) {
            object2 = (mclase) ois.readObject();  // Cast a mclase
            System.out.println("Obxecto recuperado:");
            object2.mostrarEstado();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao ler o obxecto: " + e.getMessage());
        }

        // Cambiar o campo numero1 a 'transient' para a proba en mclase
         //private transient int numero1;
        // lanzar de nuevo el programa
    }
}
