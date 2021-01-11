package br.com.zup.awesomebank.mapper;

import br.com.zup.awesomebank.model.dto.ClienteDTO;
import br.com.zup.awesomebank.model.entities.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface ClienteMapper{

    @Mapping(target = "dataDeNascimento", dateFormat = "dd/MM/yyyy")
    Cliente clienteDtoParaCliente(ClienteDTO clienteDto);

    ClienteDTO clienteParaClienteDto(Cliente cliente);
}
