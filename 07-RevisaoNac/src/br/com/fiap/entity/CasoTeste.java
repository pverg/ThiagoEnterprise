package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TAB_CASO_TESTE")
@SequenceGenerator(name="casoTeste", sequenceName="SEQ_TAB_CASO_TESTE", allocationSize=1)
public class CasoTeste {

	@Id
	@Column(name="cod_caso_teste")
	@GeneratedValue(generator="casoTeste", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nom_caso_teste")
	private String nome;
	
	@Column(name="des_caso_teste")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="cod_sistema")
	private Sistema sistema;
	
	@OneToMany(mappedBy="casoTeste", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<ItemTeste> itemTeste;
	
}
