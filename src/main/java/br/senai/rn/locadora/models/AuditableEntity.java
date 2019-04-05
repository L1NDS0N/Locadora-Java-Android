package br.senai.rn.locadora.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import br.senai.rn.locadora.repositories.PersistableEntity;

public abstract class AuditableEntity implements Comparable<AuditableEntity>, PersistableEntity<Long>{

	@CreatedDate
	@Column(name = "data_criacao", nullable = false, updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	
	
	@LastModifiedDate
	@Column(name ="data_modificacao", nullable = true)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataModificacao;
	
	@Column(name = "ativo", nullable = false)
	private Boolean ativo = true;

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public Boolean isAtivo() {
		return ativo;
	}

	@Override
	public int compareTo(AuditableEntity entity) {
		
		return this.getId().compareTo(entity.getId());
	}
	
}
