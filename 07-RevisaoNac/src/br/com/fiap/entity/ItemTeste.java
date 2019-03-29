package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TAB_ITEM_TESTE")
@SequenceGenerator(name="itemTeste", sequenceName="SQ_TAB_ITEM_TESTE", allocationSize=1)
public class ItemTeste {

	@Id
	@Column(name="cod_item_teste")
	@GeneratedValue(generator="itemTeste", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="des_item_teste")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="cod_caso_teste")
	private CasoTeste casoTeste;
	
	@ManyToMany(mappedBy="itensTeste")
	private List<Usuario> usuarios;
}
