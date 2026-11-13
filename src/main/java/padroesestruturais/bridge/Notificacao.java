package padroesestruturais.bridge;

public abstract class Notificacao {

    protected Canal canal;

    public Notificacao(Canal canal) {
        this.canal = canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public abstract String notificar(String mensagem);
}
