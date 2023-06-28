package Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        Usuario usuario3 = new Usuario();

        System.out.println("Identificador do usuário 1: " + usuario1.getIdentificador());
        System.out.println("Identificador do usuário 2: " + usuario2.getIdentificador());
        System.out.println("Identificador do usuário 3: " + usuario3.getIdentificador());
    }
}

