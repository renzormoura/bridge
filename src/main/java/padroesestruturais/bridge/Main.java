package padroesestruturais.bridge;

public class Main {

    public static void main(String[] args) {
        Notificacao normal = new NotificacaoNormal(new CanalEmail());
        System.out.println(normal.notificar("Sua fatura foi gerada"));

        Notificacao urgente = new NotificacaoUrgente(new CanalSms());
        System.out.println(urgente.notificar("Acesso suspeito na conta"));
    }
}
