package entities;
import java.util.*;

// class abstract para a criação de um usuario
// abstract class UsuarioCriacao{
//     public Usuario user;
//     abstract Usuario criaUsuario();
// 
//     public void newUsuario() {
//         this.user = this.criaUsuario();
//     }
// }
public class Usuario {
    public String nome;
    public String telefone;
    public String status;
    public String foto;
    public ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	public ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
    //public String adminitrador; -- Decidir depois

    public Usuario(String nome, String telefone, String status, String foto){
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
        this.foto = foto;
    }

    public Grupo criarGrupo(String descricao, Usuario criadorDoGrupo){
		String nome = criadorDoGrupo.nome;
        Grupo g = new Grupo(descricao, nome);
        this.grupos.add(g);

		incluirUsuario(criadorDoGrupo, g);
		incluirAdm(criadorDoGrupo, g);
		return g;
    }

    public void incluirUsuario (Usuario u, Grupo g){
        u.grupos.add(g);
        g.usuarios.add(u);
    }

	public void incluirAdm(Usuario u, Grupo g){
		g.arrayAdm.add(u);
	}

	public void enviarMensagem(Grupo g, String str, TipoMensagem tipo, Usuario user){
		Mensagem msg = new Mensagem(user , tipo, str, new Date(), g.descricao);
		g.mensagens.add(msg);
        user.mensagens.add(msg);
	}

	public void imprimirInformacoesUsuarios(Usuario u){
		System.out.println("Nome: " + u.nome);
		System.out.println("Telefone: " + u.telefone);
		System.out.println("Status: " + u.status);
		System.out.println("Foto: " + u.foto);

		int i = 0;
		for(Grupo grupo: u.grupos){
			System.out.println(i + "-" + grupo.descricao);
			i += 1;
		}

		i = 0;
		for(Mensagem msg: u.mensagens){
			System.out.println(i + "-" + msg.corpoMsg);
			i += 1;
		}

		System.out.println();
	}

}