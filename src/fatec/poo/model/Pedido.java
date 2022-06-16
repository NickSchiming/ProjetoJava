package fatec.poo.model;

import java.util.ArrayList;

public class Pedido {
    private final String numero;
    private final String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;
    private final ArrayList<ItemPedido> itensPedido;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itensPedido = new ArrayList<>();
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void addItem(ItemPedido i){
        itensPedido.add(i);
        i.setPedido(this);
        cliente.setLimiteDisp(cliente.getLimiteDisp() - (i.getProduto().getPreco() * i.getQtdeVendida()));
    }
    
    public void voltaCredito(double subtotal){
        cliente.setLimiteDisp(cliente.getLimiteDisp() + subtotal);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public ArrayList<ItemPedido> getItensPedido() {
        return itensPedido;
    }
    
    
}