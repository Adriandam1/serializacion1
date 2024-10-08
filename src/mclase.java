import java.io.Serializable;

public class mclase implements Serializable {

    private String nome;
    // private int numero1;
    private transient int numero1;
    private double numero2;


    public mclase(String nome, int numero1, double numero2) {
        this.nome = nome;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }



    // Metodo para mostrar e
    public void mostrarEstado() {
        System.out.println("Nome: " +nome +"; Numero1: "+ numero1+ "; Numero2: "+ numero2);
    }
}
