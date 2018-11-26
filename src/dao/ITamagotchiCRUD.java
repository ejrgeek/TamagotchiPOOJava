package dao;

import modelo.*;
import java.util.List;

public interface ITamagotchiCRUD {

    boolean criandoUsuario(Usuario usuario);

    boolean atualzarUsuario(int index, Usuario usuario);

    boolean deletarUsuario(int index);

    List<Usuario> listaUsuarios();

}
