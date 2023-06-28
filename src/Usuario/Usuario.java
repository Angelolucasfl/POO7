package Usuario;

public class Usuario {
    private int identificador; 
    private static int cont = 0; 

    public Usuario() {
        cont++; 
        identificador = cont; 
    }

    public int getIdentificador() {
        return identificador; 
    }
}

