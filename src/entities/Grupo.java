package entities;
import java.util.*;


abstract class GrupoCriacao {
    public Grupo crew;
    abstract Grupo grupoCriar();

    public void newGrupo(){
        this.crew = this.grupoCriar();
    }
}
public class Grupo {
    public String descricao;
    public String adm;
    public ArrayList<Usuario> usuarios;
    public ArrayList<Mensagem> mensagens;
//    public ArrayList<Boolean> arrayAdm;

    public Grupo(String descricao, String adm){
        this.descricao = descricao;
        this.adm = adm;
    }
}

public class CriacaoGrupo extends GrupoCriacao {
    Grupo grupoCriar() {
        Grupo crew = new Grupo();
        crew.usuarios = new ArrayList<Usuario>();
        crew.mensagens = new ArrayList<Mensagem>();

        return crew;


    }
} 
