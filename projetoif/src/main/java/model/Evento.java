package model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;
	private String palestrante;
	private String nivel;
	private String datainicioevento;
	private String datafimevento;
	private String datainicioinsc;
	private String datafiminsc;
	
	
	
	public Evento() {
		super();
	}

	public Evento(Integer id, String titulo, String descricao, String palestrante, String nivel,
			String datainicioevento, String datafimevento, String datainicioinsc, String datafiminsc) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.palestrante = palestrante;
		this.nivel = nivel;
		this.datainicioevento = datainicioevento;
		this.datafimevento = datafimevento;
		this.datainicioinsc = datainicioinsc;
		this.datafiminsc = datafiminsc;
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

	public String getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(String palestrante) {
		this.palestrante = palestrante;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getDatainicioevento() {
		return datainicioevento;
	}

	public void setDatainicioevento(String datainicioevento) {
		this.datainicioevento = datainicioevento;
	}

	public String getDatafimevento() {
		return datafimevento;
	}

	public void setDatafimevento(String datafimevento) {
		this.datafimevento = datafimevento;
	}

	public String getDatainicioinsc() {
		return datainicioinsc;
	}

	public void setDatainicioinsc(String datainicioinsc) {
		this.datainicioinsc = datainicioinsc;
	}

	public String getDatafiminsc() {
		return datafiminsc;
	}

	public void setDatafiminsc(String datafiminsc) {
		this.datafiminsc = datafiminsc;
	}
	
	

	

}
