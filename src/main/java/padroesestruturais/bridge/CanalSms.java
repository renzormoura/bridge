package padroesestruturais.bridge;

public class CanalSms implements Canal {

    public String enviar(String mensagem) {
        return "[SMS] " + mensagem;
    }
}
