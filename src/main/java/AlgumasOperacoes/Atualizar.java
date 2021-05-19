package AlgumasOperacoes;

import entidades.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Atualizar {

    public static Aluno atualizarAluno(Aluno aluno){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.merge(aluno);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return aluno;

    }
}
