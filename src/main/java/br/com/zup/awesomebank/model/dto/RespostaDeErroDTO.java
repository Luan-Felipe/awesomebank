package br.com.zup.awesomebank.model.dto;

import java.util.Collections;
import java.util.List;

public class RespostaDeErroDTO {

    private List<String> mensagens;

    public RespostaDeErroDTO(List<String> mensagens) {

        this.mensagens = mensagens;
    }

    public RespostaDeErroDTO(String message) {

        this.mensagens = Collections.singletonList(message);
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }
}



