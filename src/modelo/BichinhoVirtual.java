package modelo;

public class BichinhoVirtual {

    private String nome;
    private String raca;
    private int vida = 100;

    public BichinhoVirtual(){}

    public BichinhoVirtual(String nome, String raca, int vida) {
        this.nome = nome;
        this.raca = raca;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "\n    Nome: '" + nome + '\'' +
                "\n    Raca: '" + raca + '\'' +
                "\n    Vida: " + vida;
    }
}
