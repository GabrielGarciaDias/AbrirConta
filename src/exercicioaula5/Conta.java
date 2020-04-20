package exercicioaula5;

public class Conta {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float Saldo;
    private boolean status;
   
    //Métodos
    //Aqui o T seria você passar CC ou CP na hora de chamar o metodo .
    public void AbrirConta(String t){
        this.setTipo(t);
        setStatus(true);
        if  ("CC".equals(t)){
            System.out.println("Parabéns sua CC foi aberta, um Presente de "
                    + "R$50,00");
            Saldo = 50;
        }else if("CP".equals(t)){
            System.out.println("Parabéns sua CP foi aberta, um Presente de "
                    + "R$150,00");
            Saldo = 150;
            }
        }
        public void FecharConta(){
        if (Saldo > 0) {
            System.out.println("Conta com Dinheiro!");
        }else if(Saldo < 0){
            System.out.println("Conta em Debito!");
        }else{
            setStatus(false);
            }
        }
        //V valor que vai inserir para o metodo
        public void Depositar(float v){
            if (status == true){
                setSaldo(getSaldo() + v);
            }else{
                System.out.println("Impossivel depositar!!");
            }
        }
        //V valor que vai inserir para o metodo
        public void Sacar(float v){
            if (status == true){
                if (Saldo >v){
                }else{
                    System.out.println("Saldo Insuficiente !");
                }
            }else{
                System.out.println("Impossível Sacar!");
            }
        }
        public void PagarMensal(){
            int v;
            if ("CC".equals(tipo)){
                v=12;
            }else if("CP".equals(tipo)){
                v=20;
            }
            if(status==true){
                if("CC".equals(tipo)){
                    
                }else{
                    System.out.println("Saldo Insuficiente!");
                }   
            }else{
                System.out.println("Impossível Pagar!");
            }
        }
        public void EstadoAtual(){
            System.out.println("Número Conta:"+this.numConta);
            System.out.println("Tipo da Conta:"+this.tipo);
            System.out.println("Proprietaria da conta:"+this.dono);
            System.out.println("Saldo Atual:"+this.Saldo);
            System.out.println("Status da conta:"+this.status);
            System.out.println("------------------------------");
        }
        
    public int getNumConta(){
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
