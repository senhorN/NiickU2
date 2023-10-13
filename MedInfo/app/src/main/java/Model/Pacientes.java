package Model;

public class Pacientes {

    private int Codigo;
    private String Nome;
    private String Sexo;
    private String Altura;
    private String Peso;


    //Construtor
    public Pacientes(String nome, String sexo, String altura, String peso){
        this.Nome   = nome;
        this.Sexo   = sexo;
        this.Altura = altura;
        this.Peso   = peso;
    }

    //Getters
    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getAltura() {
        return Altura;
    }

    public String getPeso() {
        return Peso;
    }

    //Setters
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public void setAltura(String altura) {
        Altura = altura;
    }

    public void setPeso(String peso) {
        Peso = peso;
    }
}
