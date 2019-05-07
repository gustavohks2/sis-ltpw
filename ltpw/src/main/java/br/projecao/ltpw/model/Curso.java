package br.projecao.ltpw.model;
// Generated 04/05/2019 17:43:09 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name="Curso"
    ,catalog="projecao"
)
public class Curso  implements java.io.Serializable {


     private int idCurso;
     private Departamento departamento;
     private String nome;
     private Set<Disciplina> disciplinas = new HashSet<Disciplina>(0);

    public Curso() {
    }

	
    public Curso(int idCurso, Departamento departamento) {
        this.idCurso = idCurso;
        this.departamento = departamento;
    }
    public Curso(int idCurso, Departamento departamento, String nome, Set<Disciplina> disciplinas) {
       this.idCurso = idCurso;
       this.departamento = departamento;
       this.nome = nome;
       this.disciplinas = disciplinas;
    }
   
     @Id 
    @GeneratedValue
    
    @Column(name="idCurso", unique=true, nullable=false)
    public int getIdCurso() {
        return this.idCurso;
    }
    
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idDepartamento", nullable=false)
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
    @Column(name="nome", length=45)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="curso")
    public Set<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }
    
    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }




}


