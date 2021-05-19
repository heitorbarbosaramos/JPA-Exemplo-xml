import AlgumasOperacoes.BuscarNoBanco;
import configuracoes.BDConfig;
import entidades.Aluno;
import entidades.Estado;

public class Principal {

    public static void main(String[] args) {
//        BDConfig.instaciaBanco();
        Estado estado = BuscarNoBanco.findEstado(1);
        System.out.println(estado.toString());
        Aluno aluno = BuscarNoBanco.findAluno(1);
        System.out.println(aluno.toString());

    }
}
