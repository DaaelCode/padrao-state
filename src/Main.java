public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("001");

        System.out.println(pedido.getEstado());
        pedido.pagar();
        System.out.println(pedido.getEstado());
        pedido.enviar();
        System.out.println(pedido.getEstado());

        Pedido outro = new Pedido("002");
        outro.cancelar();
        System.out.println(outro.getEstado());
    }
}
