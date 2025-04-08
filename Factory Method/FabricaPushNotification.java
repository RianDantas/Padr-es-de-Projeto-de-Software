public class FabricaPushNotification extends FabricaNotificacao {
    public Notificacao criarNotificacao(){
        return new PushNotification();
    }
    
}
