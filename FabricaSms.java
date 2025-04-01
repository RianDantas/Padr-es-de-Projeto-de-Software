public class FabricaSms extends FabricaNotificacao {
        public Notificacao criarNotificacao(){
            return new Sms();
        }
}
