public class Singleton {

    private static volatile Singleton instanciaUnica;

    private Singleton() {
        System.out.println("Instância criada.");
    }

    public static Singleton getInstancia() {
        if (instanciaUnica == null) {
            synchronized (Singleton.class) {
                if (instanciaUnica == null) {
                    instanciaUnica = new Singleton();
                }
            }
        }
        return instanciaUnica;
    }

    public void mostrarMensagem() {
        System.out.println("Oi, eu sou uma instância única.");
    }
}
