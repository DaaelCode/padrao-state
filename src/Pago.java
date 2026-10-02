public class Pago implements EstadoPedido {
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("Pedido ja esta pago");
    }

    public void enviar(Pedido pedido) {
        pedido.mudarEstado(new Enviado());
    }

    public void cancelar(Pedido pedido) {
        pedido.mudarEstado(new Cancelado());
    }

    public String nome() {
        return "PAGO";
    }
}
