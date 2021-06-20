package entities;
import java.util.*;

// class abstract para a criação de um usuario
abstract class UsuarioCriacao{
    public Usuario user;
    abstract Usuario criaUsuario();

    public void newUsuario() {
        this.user = this.criaUsuario();
    }
}
public class Usuario {
    public String nome;
    public String telefone;
    public String status;
    public String foto;
    //public String adminitrador; -- Decidir depois
    //public ArrayList<Grupo> grupo = new ArrayList<Grupo>();
    public ArrayList<Grupo> grupos; //test

    public Usuario(String nome, String telefone, String status, String foto){
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
        this.foto = foto;
    }

    public void criarGrupo(String descricao, String adm){

        Grupo g1 = new Grupo(descricao, adm);
        this.grupos.add(g1);
    }
//    public Mensagem criarMensagem(){}
//    public void incluirUsuario(Usuario user, Grupo grupo){}
    public void mensagemCriar () {

    }

    public void incluirUsuario (Usuario u, Grupo g){
        u.grupos.add(g);
        g.usuarios.add(u);
    }

}
