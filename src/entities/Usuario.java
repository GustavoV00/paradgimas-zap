package entities;
import java.util.*;

public class Usuario {
    public String nome;
    public String telefone;
    public String status;
    public String foto;
    public ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	public ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();

    public Usuario(String nome, String telefone, String status, String foto){
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
        this.foto = foto;
    }
	// Cria grupo, e ao criar, inclui o usuário que criou o grupo como adiministrador
    public Grupo criarGrupo(String descricao, Usuario criadorDoGrupo){
        Grupo g = new Grupo(descricao);

		incluirUsuario(criadorDoGrupo, g);
		incluirAdm(criadorDoGrupo, g);
		return g;
    }

	// Inclui usuário em um grupo
    public void incluirUsuario (Usuario u, Grupo g){
        u.grupos.add(g);
        g.usuarios.add(u);
    }

	public void incluirAdm(Usuario u, Grupo g){
		g.arrayAdm.add(u);
	}

	// Criar uma instancia da mensagem, que vai ser enviada.
	// Está mensagem é salva, tanto no grupo, quanto no usuário.
	public void enviarMensagem(Grupo g, String str, TipoMensagem tipo, Usuario user){
		Mensagem msg = new Mensagem(user , tipo, str, new Date(), g.descricao);
		g.mensagens.add(msg);
        user.mensagens.add(msg);
	}

	// Método para imprimir a informação dos usuários 
	public void imprimirInformacoesUsuarios(Usuario u){
		System.out.println();
		System.out.println("Nome: " + u.nome);
		System.out.println("Telefone: " + u.telefone);
		System.out.println("Status: " + u.status);
		System.out.println("Foto: " + u.foto);

		int i = 0;
		// Imprime a descrição de cada grupo que o usuário pertence
		System.out.print("Grupos que o usario faz parte: ");
		System.out.print("{ ");
		for(Grupo grupo: u.grupos){
			System.out.print(u.nome + "-" + grupo.descricao + ", ");
			i += 1;
		}
		System.out.println("}");

		i = 0;
		// Imprime todas as mensagens que vão ser enviadas aos grupos.
		System.out.print("Mensagens que o usário enviou: ");
		System.out.print("{ ");
		for(Mensagem msg: u.mensagens){
			System.out.print("\"" + msg.corpoMsg+ "\"" + ", ");
			i += 1;
		}
		System.out.print("}");

		System.out.println();
	}

}