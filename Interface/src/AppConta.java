import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import utils.MongoDB;
import utils.MySQL;

public class AppConta {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(111);
        ContaEspecial ce1 = new ContaEspecial(222,1000);

        MySQL mySQL = new MySQL();
        MongoDB mongoDB= new MongoDB();

        cc1.gravar(mySQL);

        ce1.gravar(mongoDB);
    }

}
