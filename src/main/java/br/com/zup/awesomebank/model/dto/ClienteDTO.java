package br.com.zup.awesomebank.model.dto;

import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ClienteDTO {

  @NotNull(message = "O nome nao pode ser nulo!")
  @NotBlank(message = "O nome nao pode estar em branco!")
  private String nome;

  @NotNull(message = "O email nao pode ser nulo!")
  @NotBlank(message = "O email nao pode estar em branco!")
  @Email(message = "O email informado e invalido!")
  private String email;

  @NotNull(message = "O CPF nao pode ser nulo!")
  @NotBlank(message = "O CPF nao pode estar em branco!")
  @CPF(message = "O CPF informado e invalido!")
  private String cpf;

  @Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message = "A data de nascimento esta no formato invalido!")
  @NotNull(message = "A data de nascimento nao pode ser nula!")
  @NotBlank(message = "A data de nascimento nao pode estar em branco!")
  private String dataDeNascimento;

  public ClienteDTO() {
  }

  public ClienteDTO(String nome, String email, String cpf, String dataDeNascimento) {
    this.nome = nome;
    this.email = email;
    this.cpf = cpf;
    this.dataDeNascimento = dataDeNascimento;
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

  public String getDataDeNascimento() {
    return dataDeNascimento;
  }

  public void setDataDeNascimento(String dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }
}
