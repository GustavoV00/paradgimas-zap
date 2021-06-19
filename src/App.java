import entities.*;

public class App{
    public static void main(String[] args){
        Usuario p1 = new Usuario("nome", "telefone", "status", "foto");
        System.out.println(p1.nome);
    }
}
