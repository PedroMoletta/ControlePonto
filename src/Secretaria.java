public class Secretaria extends Funcionario{
    private String ramal;
    private String telefone;

    public Secretaria(int idFunc, String nome, String email, String documento, String ramal, String telefone) {
        super(idFunc, nome, email, documento);
        this.ramal = ramal;
        this.telefone = telefone;
    }

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
