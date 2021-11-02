package app;

public class ServidorJettyRunnable implements Runnable {

    @Override
    public void run() {
    	ServidorJetty servidor = new ServidorJetty();
    	servidor.iniciarServidor();
    }
}