package entities;
import java.util.ArrayList;


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

		System.out.println("Imprimir mensagens do grupo: ");
		int i = 0;
		for(Mensagem msg: g.mensagens){
			System.out.print(i + "-");
			System.out.print("Autor da mensagem: " +  msg.autor.nome + ", ");
			System.out.print("Tipo da mensagem: " + msg.tipoMsg + ", ");
			System.out.print("Mensagem a ser enviada: " + msg.corpoMsg + ", ");
			System.out.print("Data de envio: " + msg.dataEnvio + " ");
			System.out.print("Grupo que a mensagem pertence: " + msg.mensagemGrupo + " \n");
			i += 1;
		}

		System.out.println();
	}

	public void excluirMensagem(Usuario u, Grupo g){
		Mensagem msgAux = u.mensagens.get(0);
		for(Mensagem msg: u.mensagens){
			if(msg.mensagemGrupo == g.descricao){
				msgAux = msg;
				
			} 
		}

		if(msgAux.mensagemGrupo == g.descricao){
			g.mensagens.remove(msgAux);
			u.mensagens.remove(msgAux);
		}
		System.out.println("MENSAGEM QUE VAI SER EXCLUIDA: " + msgAux.corpoMsg);
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
