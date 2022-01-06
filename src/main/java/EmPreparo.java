public class EmPreparo extends Status{
    private static EmPreparo empreparo = new EmPreparo();

    private EmPreparo(){};

    public static EmPreparo getInstancia(){
        return empreparo;
    }
}