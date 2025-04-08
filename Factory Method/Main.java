public class Main {
    public static void main(String[] args){
        FabricaNotificacao fabrica = new FabricaEmail();
        Notificacao notificacao = fabrica.criarNotificacao();
        notificacao.enviar();

        FabricaNotificacao fabrica2 = new FabricaSms();
        Notificacao notificacao2 = fabrica2.criarNotificacao();
        notificacao2.enviar();

        FabricaNotificacao fabrica3 = new FabricaPushNotification();
        Notificacao notificacao3 = fabrica3.criarNotificacao();
        notificacao3.enviar();

        };
    }

