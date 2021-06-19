package entities;
import java.util.*;

public class Grupo {
    public String descricao;
    public String adm;
    public ArrayList<Usuario> usuario;
    public ArrayList<Mensagem> mensagem;
//    public ArrayList<Boolean> arrayAdm;

    public Grupo(String descricao, String adm){
        this.descricao = descricao;
        this.adm = adm;
    }
}
