public class Enviado implements EstadoPedido {
    public void pagar(Pedido pedido) {
        throw new IllegalStateException("pedido ja foi enviado");
    }

    public void enviar(Pedido pedido) {
        throw new IllegalStateException("pedido já foi enviado");
    }

    public void cancelar(Pedido pedido) {
        throw new IllegalStateException("pedido enviado não pode ser cancelado");
    }

    public String nome() {
        return "ENVIADO";
    }
}
