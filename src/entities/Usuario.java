package entities;

public class Usuario {
    public String nome;
    public String telefone;
    public String status;
    public String foto;
//    ArrayList<Grupo> grupo;

    public Usuario(String nome, String telefone, String status,
            String foto){
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
        this.foto = foto;
    }

//    public Grupo criarGrupo(){}
//    public Mensagem criarMensagem(){}
//    public void incluirUsuario(Usuario user, Grupo grupo){}
}
