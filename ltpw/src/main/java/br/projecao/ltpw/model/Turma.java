package br.projecao.ltpw.model;
// Generated 06/05/2019 22:15:14 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Turma generated by hbm2java
 */
@Entity
@Table(name="Turma"
    ,catalog="projecao"
)
public class Turma  implements java.io.Serializable {


     private int idTurma;
     private Set<Aluno> alunos = new HashSet<Aluno>(0);
     private Disciplina disciplina;
     private String idAnoSemestre;
     private String nome;
     private Double nota;
     private Professor professor;

    public Turma() {
    }

	
    public Turma(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
    }
    public Turma(Set<Aluno> alunos, Disciplina disciplina, String idAnoSemestre, String nome, Double nota, Professor professor) {
       this.alunos = alunos;
       this.disciplina = disciplina;
       this.idAnoSemestre = idAnoSemestre;
       this.nome = nome;
       this.nota = nota;
       this.professor = professor;
    }
   
     @Id @GeneratedValue

    
    @Column(name="idTurma", unique=true, nullable=false)
    public int getIdTurma() {
        return this.idTurma;
    }
    
    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="turmas")
    public Set<Aluno> getAlunos() {
        return this.alunos;
    }
    
    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idDisciplina", nullable=false)
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    
    @Column(name="id_ano_semestre", length=45)
    public String getIdAnoSemestre() {
        return this.idAnoSemestre;
    }
    
    public void setIdAnoSemestre(String idAnoSemestre) {
        this.idAnoSemestre = idAnoSemestre;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="nota", precision=22, scale=0)
    public Double getNota() {
        return this.nota;
    }
    
    public void setNota(Double nota) {
        this.nota = nota;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idProfessor", nullable=false)
    public Professor getProfessor() {
        return this.professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }




}


