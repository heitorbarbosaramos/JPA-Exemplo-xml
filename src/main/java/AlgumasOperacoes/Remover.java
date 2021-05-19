package AlgumasOperacoes;

import entidades.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Remover {

    public static void removerAluno(Aluno aluno){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        entityManager.getTransaction().begin();
        Aluno remove = entityManager.find(Aluno.class, aluno.getId());
        entityManager.remove(remove);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        System.out.println("Aluno removido");
    }
}
