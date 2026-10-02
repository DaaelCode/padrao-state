public class Cancelado implements EstadoPedido {
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("pedido cancelado não pode ser pago");
    }

    public void enviar(Pedido pedido) {
        throw new IllegalStateException("Pedido cancelado não pode ser enviado");
    }

    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("pedido ja esta cancelado");
    }

    public String nome() {
        return "CANCELADO";
    }
}
