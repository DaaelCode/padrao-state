public class Pedido {
    private EstadoPedido estado = new Rascunho();
    private final String numero;

    public Pedido(String numero) {
        this.numero = numero;
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void enviar() {
        estado.enviar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void mudarEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado.nome();
    }

    public String getNumero() {
        return numero;
    }
}
