package exercicioaula5;


public class ExercicioAula5 {

 
    public static void main(String[] args) {
        Conta c1= new Conta();
        c1.numConta = 4212;
        c1.setDono("Jubricreusu");
        c1.AbrirConta("CC");
        c1.EstadoAtual();
        System.out.println(c1.getDono());
    }
    
}
