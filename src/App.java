import entities.*;

public class App{
    public static void main(String[] args){
        Usuario p1 = new Usuario("p1", "41-99999999", "online", "foto1");
        Usuario p2 = new Usuario("p2", "41-88888888", "ausente", "foto2");
        Usuario p3 = new Usuario("p3", "41-77777777", "online", "foto3");
        Usuario p4 = new Usuario("p4", "41-66666666", "ocupado", "foto4");


		// Anderson cria o grupo g1 e g2
		// João cria o grupo g3
        Grupo g1 = p1.criarGrupo("g1", p1);
        Grupo g2 = p1.criarGrupo("g2", p1);
        Grupo g3 = p3.criarGrupo("g3", p3);

		// Anderson inclui os usuarios Maria, João e jessica no grupo g1 (Anderson adm do g1)
		p1.incluirUsuario(p2, g1);
        p1.incluirUsuario(p3, g1);
        p1.incluirUsuario(p4, g1);

		// Anderson inclui a Maria e o João no grupo g2 (Anderseon adm do g2)
		p1.incluirUsuario(p2, g2);
		p1.incluirUsuario(p3, g2);

		// João inclui a Jessica no grupo g3 (João adm do g3)
		p3.incluirUsuario(p4, g3);

		p2.enviarMensagem(g1, "Enviar esta mensagem 1", TipoMensagem.TEXTO, p2);
		p1.enviarMensagem(g1, "Enviar esta mensagem 2", TipoMensagem.TEXTO, p1);
		p2.enviarMensagem(g2, "Enviar esta mensagem 3", TipoMensagem.TEXTO, p2);
		p3.enviarMensagem(g3, "Enviar esta mensagem 4", TipoMensagem.TEXTO, p3);
		p3.enviarMensagem(g2, "Enviar esta mensagem 5", TipoMensagem.TEXTO, p3);
		p3.enviarMensagem(g3, "Enviar esta mensagem 6", TipoMensagem.TEXTO, p3);

		g1.excluirMensagem(p2, g1);
		g1.excluirMensagem(p1, g1);
		g2.excluirMensagem(p2, g2);
		g3.excluirMensagem(p3, g3);
		g2.excluirMensagem(p3, g2);
		g3.excluirMensagem(p3, g3);

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
