import AlgumasOperacoes.Atualizar;
import AlgumasOperacoes.BuscarNoBanco;
import AlgumasOperacoes.Inserts;
import AlgumasOperacoes.Remover;
import configuracoes.BDConfig;
import entidades.Aluno;
import entidades.Estado;

public class Principal {

    public static void main(String[] args) {
        BDConfig.instaciaBanco();
        Estado estado = BuscarNoBanco.findEstado(2);
        System.out.println(estado.toString());
        Aluno aluno = BuscarNoBanco.findAluno(1);
        System.out.println(aluno.toString());

        aluno.setIdade(16);
        aluno.setEstado(estado);

        aluno = Atualizar.atualizarAluno(aluno);
        System.out.println(aluno.toString());

        Aluno insertAluno = new Aluno(null, "Pedrinho Fernando Paula", 22, estado);
        Inserts.insertAluno(insertAluno);

        Aluno alunoRemove = BuscarNoBanco.findAluno(2);
        Remover.removerAluno(alunoRemove);




    }
}
