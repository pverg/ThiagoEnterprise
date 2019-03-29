package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TAB_USUARIO")
@SequenceGenerator(name="usuario", sequenceName="SQ_TAB_USUARIO", allocationSize=1)
public class Usuario {

	@Id
	@Column(name="cod_usuario")
	@GeneratedValue(generator="usuario", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nom_usuario")
	private String nome;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="TAB_ITEM_TESTE_USUARIO", 
				joinColumns=@JoinColumn(name="cod_usuario") , 
				inverseJoinColumns=@JoinColumn(name="cod_item_teste"))
	private List<ItemTeste> itensTeste;
}
