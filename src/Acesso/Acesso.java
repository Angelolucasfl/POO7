package Acesso;

public class Acesso {

    private String atributoPrivado;
    protected int atributoProtegido;
    public boolean atributoPublico;

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String valor) {
        this.atributoPrivado = valor;
    }

    protected int getAtributoProtegido() {
        return atributoProtegido;
    }

    protected void setAtributoProtegido(int valor) {
        this.atributoProtegido = valor;
    }

    public boolean isAtributoPublico() {
        return atributoPublico;
    }

    public void setAtributoPublico(boolean valor) {
        this.atributoPublico = valor;
    }
}
