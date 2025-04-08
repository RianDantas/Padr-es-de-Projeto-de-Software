public class FabricaEmail extends FabricaNotificacao {
    public Notificacao criarNotificacao(){
        return new Email();
    }
    
}
