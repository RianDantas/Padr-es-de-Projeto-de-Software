public class GerenciadorTransporte {
    private static GerenciadorTransporte instance;

    private GerenciadorTransporte() {
       
    }

    public static GerenciadorTransporte getInstance() {
        if (instance == null) {
            instance = new GerenciadorTransporte();
        }
        return instance;
    }

    public Transporte solicitarTransporte(String tipo) {
        // Possível ponto do erro:
        FabricaTransporte factory = null; // A variável 'factory' é do tipo TransporteFactory

        if (tipo.equalsIgnoreCase("Caminhao")) {
            factory = new FabricaCaminhao(); // Tentando atribuir CaminhaoFactory a TransporteFactory
        } else if (tipo.equalsIgnoreCase("Navio")) {
            factory = new FabricaNavio();   // Tentando atribuir NavioFactory a TransporteFactory
        } else {
            System.out.println("Tipo de transporte inválido.");
            return null;
        }

        if (factory != null) {
            return factory.criarTransporte();
        }
        return null;
    }
}