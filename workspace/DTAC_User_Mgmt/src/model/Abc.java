package model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.NamedQuery;


/**
 * The persistent class for the abc database table.
 * 
 */
@Entity
@NamedQuery(name="Abc.findAll", query="SELECT a FROM Abc a")

public class Abc implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String text;

	private Long tno;

	public Abc() {
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getTno() {
		return this.tno;
	}

	public void setTno(Long tno) {
		this.tno = tno;
	}

}