package br.com.zup.awesomebank.model.dto;

import java.util.Collections;
import java.util.List;

public class RespostaDTO {

    private List<String> mensagens;

    public RespostaDTO(List<String> mensagens) {

        this.mensagens = mensagens;
    }

    public RespostaDTO(String message) {

        this.mensagens = Collections.singletonList(message);
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }
}



