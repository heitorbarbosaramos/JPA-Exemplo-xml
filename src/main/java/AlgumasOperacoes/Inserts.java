package AlgumasOperacoes;

import entidades.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inserts {

    public static void insertAluno(Aluno aluno){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(aluno);

        entityManager.getTransaction().commit();
    }
}
