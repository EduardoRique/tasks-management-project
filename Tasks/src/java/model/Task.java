/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luis
 */
@Entity
@Table(name = "task")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t")
    , @NamedQuery(name = "Task.findById", query = "SELECT t FROM Task t WHERE t.id = :id")
    , @NamedQuery(name = "Task.findByTitulo", query = "SELECT t FROM Task t WHERE t.titulo = :titulo")
    , @NamedQuery(name = "Task.findByDescricao", query = "SELECT t FROM Task t WHERE t.descricao = :descricao")
    , @NamedQuery(name = "Task.findByResponsavel", query = "SELECT t FROM Task t WHERE t.responsavel = :responsavel")
    , @NamedQuery(name = "Task.findByPrioridade", query = "SELECT t FROM Task t WHERE t.prioridade = :prioridade")
    , @NamedQuery(name = "Task.findBySituacao", query = "SELECT t FROM Task t WHERE t.situacao = :situacao")
    , @NamedQuery(name = "Task.findByDeadline", query = "SELECT t FROM Task t WHERE t.deadline = :deadline")})
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "responsavel")
    private String responsavel;
    
    @Column(name = "prioridade")
    private String prioridade;
    
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "deadline")
    @Temporal(TemporalType.DATE)
    private Date deadline;

    public Task() {
    }

    public Task(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Task)) {
            return false;
        }
        Task other = (Task) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Task[ id=" + id + " ]";
    }
    
}
