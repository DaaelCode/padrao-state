public class Rascunho implements EstadoPedido {
    public void pagar(Pedido pedido) {
        pedido.mudarEstado(new Pago());
    }

    public void enviar(Pedido pedido) {
        throw new IllegalStateException("pedido no rascunho não pode ser enviado!");
    }

    public void cancelar(Pedido pedido) {
        pedido.mudarEstado(new Cancelado());
    }

    public String nome() {
        return "RASCUNHO";
    }
}
