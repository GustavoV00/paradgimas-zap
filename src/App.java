import entities.*;
import java.util.*;
import java.util.Arrays;

public class App{
    public static void main(String[] args){
        Usuario p1 = new Usuario("Anderson", "41-99999999", "online", "foto1");
        Usuario p2 = new Usuario("Maria", "41-88888888", "ausente", "foto2");
        Usuario p3 = new Usuario("João", "41-77777777", "online", "foto3");
        Usuario p4 = new Usuario("Jessica", "41-66666666", "ocupado", "foto4");


		// Anderson cria o grupo g1 e g2
		// João cria o grupo g3
        Grupo g1 = p1.criarGrupo("g1", p1);
        Grupo g2 = p1.criarGrupo("g2", p1);
        Grupo g3 = p3.criarGrupo("g3", p3);

//        for(Grupo element: p1.grupos){
//            System.out.println(element.descricao);
//            System.out.println(element.adm);
//			System.out.println();
//        }
        
		// Anderson inclui os usuarios Maria, João e jessica no grupo g1 (Anderson adm do g1)
		p1.incluirUsuario(p2, g1);
        p1.incluirUsuario(p3, g1);
        p1.incluirUsuario(p4, g1);

		// Anderson inclui a Maria e o João no grupo g2 (Anderseon adm do g2)
		p1.incluirUsuario(p2, g2);
		p1.incluirUsuario(p3, g2);

		// João inclui a Jessica no grupo g3 (João adm do g3)
		p3.incluirUsuario(p4, g3);

		g1.imprimirInformacoesGrupo(g1);
		g2.imprimirInformacoesGrupo(g2);
		g3.imprimirInformacoesGrupo(g3);
	 }
}
