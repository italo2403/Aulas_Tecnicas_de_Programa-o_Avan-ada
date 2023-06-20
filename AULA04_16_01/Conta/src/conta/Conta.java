package conta;

public class Conta {

	private int Numero;
    public int op;
    private String Dono; 
    private double Saldo;
    private double Limite;
    
    public Conta() {
        this.Numero=0;
        this.Dono=" ";
        this.Saldo=0;
        this.Limite=0; 
    }
    public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public int getOp() {
		return op;
	}
	public void setOp(int op) {
		this.op = op;
	}
	public String getDono() {
		return Dono;
	}
	public void setDono(String dono) {
		Dono = dono;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public double getLimite() {
		return Limite;
	}
	public void setLimite(double limite) {
		Limite = limite;
	}
	boolean saca(double quantidade) {
        if (this.Saldo<quantidade)
    return false;
    else {
        this.Saldo = this.Saldo - quantidade;
    return true; 
        }
    }
    void deposita(double quantidade) {
        this.Saldo = this.Saldo + quantidade;
    }
    void inseredados(String a, int b, float c, float l){
        this.Dono = a;
        this.Numero = b;
        this.Saldo = c;
        this.Limite = l;
    }
    void mostrardado(){
        System.out.println("Dono da Conta: " + this.getDono());
        System.out.println("Numero da Conta: " + this.getNumero());
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    void mostrarsal(){
            System.out.println("Saldo Atual: " + this.getSaldo()); 
        
    }
}
