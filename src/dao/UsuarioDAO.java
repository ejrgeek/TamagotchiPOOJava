package dao;

import modelo.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements ITamagotchiCRUD {

    private ArrayList<Usuario> usuariosList;

    public UsuarioDAO(){
        usuariosList = new ArrayList<>();
    }

    @Override
    public boolean criandoUsuario(Usuario usuario) {
        boolean status = usuariosList.add(usuario);
        return status;
    }

    @Override
    public boolean atualzarUsuario(int index, Usuario usuario) {
        Usuario usuario1 = usuariosList.set(index, usuario);

        if (usuario1 != null){
            return true;
        }
        return false;

    }

    @Override
    public boolean deletarUsuario(int index) {
        Usuario usuario = usuariosList.remove(index);

        if (usuario != null){
            return true;
        }
        return false;

    }

    @Override
    public List<Usuario> listaUsuarios() {
        return usuariosList;
    }
}
