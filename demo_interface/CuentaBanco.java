package demo_interface;

public class CuentaBanco implements Comparable<CuentaBanco> {
    // El parámetro es de tipo de la misma clase (CuentaBanco)
    
    private Long numeroCuenta;
    
    private Double balance;

    public CuentaBanco(double balance) {
        this.balance = balance;
    }

    public CuentaBanco() {
    }

    public int compareTo(CuentaBanco other) {
        if (balance < other.getSaldo()) {
            return -1;
        }
        if (balance > other.getSaldo()) {
            return 1;
        }
        return 0;
    }

    public double getSaldo() {
        return balance;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
}
