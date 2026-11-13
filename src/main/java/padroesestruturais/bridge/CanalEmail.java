package padroesestruturais.bridge;

public class CanalEmail implements Canal {

    public String enviar(String mensagem) {
        return "[E-mail] " + mensagem;
    }
}
