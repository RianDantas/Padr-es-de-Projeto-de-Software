public class ConfigurationManager{
    private static ConfigurationManager instance;
    private String servidor;
    private String porta;

    private configurationManager(){

    }

    static configurationManager getInstance(){
        if( instance == nul){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void setConfig(String key, String value){
        if(key == "servidor"){
            this.servidor = value;
        }else if (key == "porta"){
            this.porta = value;
        }
        
    }

    public String getConfig(String Key){
        if(key == "servidor"){
            return servidor;
        }else if (key == "porta"){
            return porta;
        }
    }

    public void showConfigs(){
        if(servidor != null){
            System.out.println("Servidor: " + servidor);
        }
        if(porta != null){
            System.out.println("Porta: " + porta);
        }
    }
}

public static void main(String[] args){
    ConfiguarationManager c = new ConfiguarationManager();

}