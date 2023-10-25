package exercicio;
	
public class Pedido {
	static final double VALOR_APLICAVEL_DESCONTO = 1000.0;
	static final int PERCENTUAL_DESCONTO = 10;
	
	Integer codigo;
	
	Double subTotal;
	
	Double desconto;
	
	Integer getCodigo() {
		return codigo;
	}
	
	void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	Double getSubTotal() {
		return subTotal;
	}
	
	void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}
	
	public Boolean descontoAplicavel() {
		if (subTotal >= VALOR_APLICAVEL_DESCONTO) {
				desconto = (subTotal * PERCENTUAL_DESCONTO) / 100;
				return true;
		} else {
			desconto = 0.0;
			return false;
		}
	}
	
	Double getDesconto() {
		return desconto;
	}
	
	void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	Double getTotal() {
		return getSubTotal() - getDesconto();
	}
	
	void imprimirTotais() {
		System.out.println("Codigo do produto: " + getCodigo());
		System.out.println("Desconto total: " + getDesconto());
		System.out.println("Subtotal do produto: " + getSubTotal());
		System.out.println("Total do produto:" + getTotal());
	}
	
	
	
	
	
	
	
}