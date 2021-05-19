package entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String sigla;
    private String nomeEstado;

    @OneToMany(mappedBy = "estado", fetch = FetchType.LAZY)
    private List<Aluno> alunos = new ArrayList<>();

    public Estado(){
    }

    public Estado(Integer id, String sigla, String nomeEstado) {
        this.id = id;
        this.sigla = sigla;
        this.nomeEstado = nomeEstado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removeAlunos(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estado{");
        sb.append("id=").append(id);
        sb.append(", sigla='").append(sigla).append('\'');
        sb.append(", nomeEstado='").append(nomeEstado).append('\'');
        sb.append(", alunos=").append(alunos);
        sb.append('}');
        return sb.toString();
    }
}
