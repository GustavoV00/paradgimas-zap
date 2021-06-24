import entities.*;

public class App{
    public static void main(String[] args){
		// Cria uma instância de usuário, com dados aleatórios.
        Usuario p1 = new Usuario("p1", "41-99999999", "online", "foto1");
        Usuario p2 = new Usuario("p2", "41-88888888", "ausente", "foto2");
        Usuario p3 = new Usuario("p3", "41-77777777", "online", "foto3");
        Usuario p4 = new Usuario("p4", "41-66666666", "ocupado", "foto4");

		// p1 cria o grupo g1 e g2
		// p3 cria o grupo g3
        Grupo g1 = p1.criarGrupo("g1", p1);
        Grupo g2 = p1.criarGrupo("g2", p1);
        Grupo g3 = p3.criarGrupo("g3", p3);

		// p1 inclui os usuarios p2, p3 e p4 no grupo g1 (p1 adm do g1)
		p1.incluirUsuario(p2, g1);
		p1.incluirUsuario(p3, g1);
		p1.incluirUsuario(p4, g1);

		// p1 inclui a p2 e o p3 no grupo g2 (p1 adm do g2)
		p1.incluirUsuario(p2, g2);
		p1.incluirUsuario(p3, g2);

		// p3 inclui a p4 no grupo g3 (p3 adm do g3)
		p3.incluirUsuario(p4, g3);

		p2.enviarMensagem(g1, "Enviar esta mensagem 1", TipoMensagem.TEXTO, p2);// p2 envia mensagem no g1;
		p1.enviarMensagem(g1, "Enviar esta mensagem 2", TipoMensagem.TEXTO, p1);// p1 envia mensagem no g1;
		p2.enviarMensagem(g2, "Enviar esta mensagem 3", TipoMensagem.TEXTO, p2);// p2 envia mensagem no g2;
		p3.enviarMensagem(g3, "Enviar esta mensagem 4", TipoMensagem.TEXTO, p3);// p3 envia mensagem no g3;
		p3.enviarMensagem(g2, "Enviar esta mensagem 5", TipoMensagem.TEXTO, p3);// p3 envia mensagem no g2;
		p3.enviarMensagem(g3, "Enviar esta mensagem 6", TipoMensagem.TEXTO, p3);// p3 envia mensagem no g3;

		// Testes do metodo excluirMensagem
		g1.excluirMensagem(p2, g1);
		g1.excluirMensagem(p1, g1);

		// Imprime as informações dos usuários
		p1.imprimirInformacoesUsuarios(p1);
		p1.imprimirInformacoesUsuarios(p2);
		p1.imprimirInformacoesUsuarios(p3);
		p1.imprimirInformacoesUsuarios(p4);
		System.out.println("-------------------------------------------------");
		g1.imprimirInformacoesGrupo(g1);
		g2.imprimirInformacoesGrupo(g2);
		g3.imprimirInformacoesGrupo(g3);
	 }
}
