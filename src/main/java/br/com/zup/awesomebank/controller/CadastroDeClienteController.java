package br.com.zup.awesomebank.controller;

import br.com.zup.awesomebank.model.dto.ClienteDTO;
import br.com.zup.awesomebank.model.dto.RespostaDeErroDTO;
import br.com.zup.awesomebank.mapper.ClienteMapper;
import br.com.zup.awesomebank.model.exceptions.DbException;
import br.com.zup.awesomebank.model.entities.Cliente;
import br.com.zup.awesomebank.services.CadastroDeClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/cliente")
public class CadastroDeClienteController {

    @Autowired
    CadastroDeClienteService service;

    @Autowired
    ClienteMapper mapper;

    @PostMapping(value = "/cadastrar")

    public ResponseEntity<Object> cadastrar(@RequestBody @Valid ClienteDTO clienteDTO, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getAllErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList());
            return new ResponseEntity(new RespostaDeErroDTO(errors), HttpStatus.BAD_REQUEST);
        }

        Cliente cliente;
        try {
            cliente = service.cadastrar(mapper.clienteDtoParaCliente(clienteDTO));
        }catch (DbException e){
            return new ResponseEntity(new RespostaDeErroDTO(e.getMessage()),HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(mapper.clienteParaClienteDto(cliente), HttpStatus.CREATED);
    }
}


