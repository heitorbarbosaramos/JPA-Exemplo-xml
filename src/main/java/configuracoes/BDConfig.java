package configuracoes;

import entidades.Aluno;
import entidades.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BDConfig {

    public static void instaciaBanco(){

        // 1 - Passos iniciais para criar um gerenciador de entidades com o banco de dados especificado no arquivo "persistence.xml"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // 2.1 - Criar instancias para serem adicionadas no banco de dados
        Estado estado1 = new Estado(null, "AC", "Acre");
        Estado estado2 = new Estado(null, "AL", "Alagoas");
        Estado estado3 = new Estado(null, "AP", "Amapá");
        Estado estado4 = new Estado(null, "AM", "Amazonas");
        Estado estado5 = new Estado(null, "BA", "Bahia");

        Aluno aluno1 = new Aluno(null, "João Lima Santos", 15, estado1);
        Aluno aluno2 = new Aluno(null, "Pedro de Lara", 14, estado1);
        Aluno aluno3 = new Aluno(null, "Camila Santos de Nobrega", 15, estado1);
        Aluno aluno4 = new Aluno(null, "Luzia Maria da Costa", 17, estado5);

        // 2.2 - Iniciar uma trasacao para adiconar as instancias no banco de dados
        entityManager.getTransaction().begin();

        entityManager.persist(estado1);
        entityManager.persist(estado2);
        entityManager.persist(estado3);
        entityManager.persist(estado4);
        entityManager.persist(estado5);

        entityManager.persist(aluno1);
        entityManager.persist(aluno2);
        entityManager.persist(aluno3);
        entityManager.persist(aluno4);

        entityManager.getTransaction().commit();

        // 3 - Encerrar o gerenciador de entidades e encerrar a fabrica de gerenciadores de entidade.
        entityManager.close();
        entityManagerFactory.close();

    }
}
