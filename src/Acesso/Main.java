package Acesso;

public class Main {

	public static void main(String[] args) {
		Acesso acesso = new Acesso();

        // Acesso ao atributo privado usando método setter
        acesso.setAtributoPrivado("Valor privado");
        
        // Acesso ao atributo protegido usando método setter
        acesso.setAtributoProtegido(10);
        
        // Acesso ao atributo público diretamente
        acesso.atributoPublico = true;

        // Acesso aos atributos usando os métodos getters
        String valorPrivado = acesso.getAtributoPrivado();
        int valorProtegido = acesso.getAtributoProtegido();
        boolean valorPublico = acesso.isAtributoPublico();

        System.out.println(valorPrivado);
        System.out.println(valorProtegido);
        System.out.println(valorPublico);
	}

}
