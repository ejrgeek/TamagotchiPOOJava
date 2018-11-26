package modelo;

public class Usuario {

    private String user, senha;
    private BichinhoVirtual bichinhoVirtual;

    public Usuario(){}

    public Usuario(String user, String senha, BichinhoVirtual bichinhoVirtual) {
        this.user = user;
        this.senha = senha;
        this.bichinhoVirtual = bichinhoVirtual;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public BichinhoVirtual getBichinhoVirtual() {
        return bichinhoVirtual;
    }

    public void setBichinhoVirtual(BichinhoVirtual bichinhoVirtual) {
        this.bichinhoVirtual = bichinhoVirtual;
    }

    @Override
    public String toString() {
        return "Usuario {" +
                "\nUsuario: '" + user + '\'' +
                "\nBichinho Virtual: " + bichinhoVirtual + "\n" +
                '}';
    }
}
