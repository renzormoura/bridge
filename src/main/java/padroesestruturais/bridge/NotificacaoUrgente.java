package padroesestruturais.bridge;

public class NotificacaoUrgente extends Notificacao {

    public NotificacaoUrgente(Canal canal) {
        super(canal);
    }

    public String notificar(String mensagem) {
        return this.canal.enviar("URGENTE: " + mensagem.toUpperCase());
    }
}
