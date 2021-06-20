package entities;

abstract class MensagemCriacao{
    public Mensagem msg;
    abstract Mensagem mensagemCriar();

    public void newMensagem(){
        this.msg = this.mensagemCriar();
    }
}
public class Mensagem {
    String textos;
    String fotos;
    String videos;
    String audio;
}

// public class CriacaoMensagem extends MensagemCriacao {
//     Mensagem mensagemCriar() {
//         Mensagem msg = new Mensagem();
//         return msg;
//     }
// }
