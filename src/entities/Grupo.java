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
	// Imprimi a descrição, usuário, administradores e todas as mensagens
	public void imprimirInformacoesGrupo(Grupo g){
		System.out.println("Grupo: " + g.descricao);
		int indice = 0;
		for(Usuario user : g.usuarios){
			System.out.println("Usuario: " + user.nome + " - " + indice);
			indice += 1;
		}

		// Apesar de em nossa implementação ter apenas um adm por grupo, se no futuro houver mais de um, será impresso todos
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

	// Esse metodo vai excluir a ultima mensagem, enviada pelo usuário no grupo g
	public void excluirMensagem(Usuario u, Grupo g){
		// Criar uma instância, de uma mensagem que tem na lista de usuários
		Mensagem msgAux = u.mensagens.get(0);
		// Percorre todas as mensagens, que o usuario enviou em todos os grupos
		// E encontra a ultima mensagem, que o usuario enviou ao grupo. 
		for(Mensagem msg: u.mensagens){
			if(msg.mensagemGrupo == g.descricao){
				msgAux = msg;
				
			} 
		}

		// Após encontrar a mensagem, faz uma verificação final, se a mensagem
		// está no grupo certo. Após isso, exclui a mensagem, tanto do grupo,
		// quanto das mensagens enviadas pelo usuario.
		if(msgAux.mensagemGrupo == g.descricao){
			g.mensagens.remove(msgAux);
			u.mensagens.remove(msgAux);
		}
		System.out.println("MENSAGEM QUE VAI SER EXCLUIDA: " + msgAux.corpoMsg);
	}
}

