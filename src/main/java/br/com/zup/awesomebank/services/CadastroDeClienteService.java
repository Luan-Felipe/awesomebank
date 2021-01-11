package br.com.zup.awesomebank.services;

import br.com.zup.awesomebank.model.entities.Cliente;
import br.com.zup.awesomebank.model.exceptions.DbException;
import br.com.zup.awesomebank.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class CadastroDeClienteService {

  @Autowired
  ClienteRepository clienteRepository;

  public String cadastrar(Cliente cliente) {

    try {
      clienteRepository.save(cliente);
    } catch (DataIntegrityViolationException e) {
      throw new DbException("CPF ou Email ja registrado!");
    } catch (RuntimeException e) {
      throw new DbException("erro nao mapeado");
    }
    return "Cliente cadastrado com sucesso";
  }
}


