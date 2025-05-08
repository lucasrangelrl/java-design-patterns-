public class Main {
    public static void main(String[] args) {
        Singleton f1 = Singleton.getInstancia();
        Singleton f2 = Singleton.getInstancia();

        f1.mostrarMensagem();

        System.out.println("f1 == f2? " + (f1 == f2)); // true
    }
}
