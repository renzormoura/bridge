package padroesestruturais.bridge;

public class NotificacaoNormal extends Notificacao {

    public NotificacaoNormal(Canal canal) {
        super(canal);
    }

    public String notificar(String mensagem) {
        return this.canal.enviar(mensagem);
    }
}
