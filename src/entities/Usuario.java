package entities;
import java.util.*;

public class Usuario {
    public String nome;
    public String telefone;
    public String status;
    public String foto;
    //public String adminitrador; -- Decidir depois
    public ArrayList<Grupo> grupo = new ArrayList<Grupo>();

    public Usuario(String nome, String telefone, String status, String foto){
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
        this.foto = foto;
    }

    public void criarGrupo(String descricao, String adm){
        Grupo g1 = new Grupo(descricao, adm);
        this.grupo.add(g1);
    }
//    public Mensagem criarMensagem(){}
//    public void incluirUsuario(Usuario user, Grupo grupo){}
}
