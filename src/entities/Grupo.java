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
    public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    public ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
    public ArrayList<Usuario> arrayAdm = new ArrayList<Usuario>();

    public Grupo(String descricao, String adm){
        this.descricao = descricao;
        this.adm = adm;
    }

	public void imprimirInformacoesGrupo(Grupo g){
		System.out.println("Grupo: " + g.descricao);
		int indice = 0;
		for(Usuario user : g.usuarios){
			System.out.println("Usuario: " + user.nome + " - " + indice);
			indice += 1;
		}

		System.out.println("\nAdministrador do grupo: " + g.descricao);
		for(Usuario user : g.arrayAdm){
			System.out.println(user.nome);
		}

		System.out.println();
	}
}

// public class CriacaoGrupo extends GrupoCriacao {
//     Grupo grupoCriar() {
//         Grupo crew = new Grupo();
//         crew.usuarios = new ArrayList<Usuario>();
//         crew.mensagens = new ArrayList<Mensagem>();
// 
//         return crew;
//     }
// } 
