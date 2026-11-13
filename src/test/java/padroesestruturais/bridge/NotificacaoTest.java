package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoTest {

    @Test
    void deveEnviarNotificacaoNormalPorEmail() {
        Notificacao notificacao = new NotificacaoNormal(new CanalEmail());
        assertEquals("[E-mail] Fatura gerada", notificacao.notificar("Fatura gerada"));
    }

    @Test
    void deveEnviarNotificacaoNormalPorSms() {
        Notificacao notificacao = new NotificacaoNormal(new CanalSms());
        assertEquals("[SMS] Fatura gerada", notificacao.notificar("Fatura gerada"));
    }

    @Test
    void deveEnviarNotificacaoUrgentePorEmail() {
        Notificacao notificacao = new NotificacaoUrgente(new CanalEmail());
        assertEquals("[E-mail] URGENTE: ACESSO SUSPEITO", notificacao.notificar("Acesso suspeito"));
    }

    @Test
    void deveEnviarNotificacaoUrgentePorSms() {
        Notificacao notificacao = new NotificacaoUrgente(new CanalSms());
        assertEquals("[SMS] URGENTE: ACESSO SUSPEITO", notificacao.notificar("Acesso suspeito"));
    }

    @Test
    void deveTrocarCanalDaNotificacao() {
        Notificacao notificacao = new NotificacaoNormal(new CanalEmail());
        notificacao.setCanal(new CanalSms());
        assertEquals("[SMS] Fatura gerada", notificacao.notificar("Fatura gerada"));
    }
}
