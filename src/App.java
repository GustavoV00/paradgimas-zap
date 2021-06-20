import entities.*;
import java.util.*;
import java.util.Arrays;

public class App{
    public static void main(String[] args){
        Usuario p1 = new Usuario("Anderson", "41-99999999", "online", "foto1");
        Usuario p2 = new Usuario("Maria", "41-88888888", "ausente", "foto2");
        Usuario p3 = new Usuario("João", "41-77777777", "online", "foto3");
        Usuario p4 = new Usuario("Jessica", "41-66666666", "ocupado", "foto4");

        p1.criarGrupo("Teste de desc", p1.nome);
        p1.criarGrupo("Teste de desc2", p1.nome);

        for(Grupo element: p1.grupos){
            System.out.println(element.descricao);
            System.out.println(element.adm);

        }
    }      
}