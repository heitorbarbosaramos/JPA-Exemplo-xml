package AlgumasOperacoes;

import entidades.Aluno;
import entidades.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscarNoBanco {

    public static Estado findEstado(Integer id){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Estado estado = entityManager.find(Estado.class, id);

        entityManager.close();
        entityManagerFactory.close();


        return estado;
    }

    public static Aluno findAluno(Integer id){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Aluno aluno = entityManager.find(Aluno.class, id);

        entityManager.close();
        entityManagerFactory.close();


        return aluno;


    }
}
