package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_SISTEMA")
@SequenceGenerator(name = "sistema", sequenceName = "SQ_TAB_SISTEMA", allocationSize = 1)
public class Sistema {

	@Id
	@Column(name="cod_sistema")
	@GeneratedValue(generator="sistema", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nom_sistema")
	private String nome;
	
	@OneToMany(mappedBy="sistema", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<CasoTeste> casosTeste;
}
