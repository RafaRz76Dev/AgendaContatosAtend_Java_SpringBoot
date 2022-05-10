package com.api.AgendaContatos.Models;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity //Annotation
@Table(name = "TB_AGENDACONTATOS_CLIENTES") 

public class AgendaContatosModels {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
     
    private String Nome;
    
   private String Telefone;
   
    private String CPF;
     
    private String Email;
        
    private String Anotação;
    
    private String Data_Atual;

    private String Hora_Contato;
    
	public String getData_Atual() {
		return Data_Atual;
	}

	public void setData_Atual(String data_Atual) {
		Data_Atual = data_Atual;
	}

	public String getHora_Contato() {
		return Hora_Contato;
	}

	public void setHora_Contato(String hora_Contato) {
		Hora_Contato = hora_Contato;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAnotação() {
		return Anotação;
	}

	public void setAnotação(String anotação) {
		Anotação = anotação;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
