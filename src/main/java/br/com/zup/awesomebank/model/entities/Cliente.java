package br.com.zup.awesomebank.model.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String cpf;

  @Column(unique = true)
  private String email;

  private String nome;

  private Date dataDeNascimento;

  public Cliente() {
  }

  public Cliente(String nome, String email, String cpf, Date dataDeNascimento) {
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Date getDataDeNascimento() {
    return dataDeNascimento;
  }

  public void setDataDeNascimento(Date dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }
}


