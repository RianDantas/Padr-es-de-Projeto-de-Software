public class Main {
    public static void main(String[] args) {
        GerenciadorTransporte gerenciador = GerenciadorTransporte.getInstance();
        Transporte caminhao = gerenciador.solicitarTransporte("caminhao");
        Transporte navio = gerenciador.solicitarTransporte("navio");
        if (caminhao != null) {
            caminhao.entregar();
        }

        if (navio != null) {
            navio.entregar();
        }
    }
}
