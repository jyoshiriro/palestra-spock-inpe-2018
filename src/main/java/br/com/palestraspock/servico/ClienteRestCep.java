package br.com.palestraspock.servico;

public interface ClienteRestCep {

    /**
     * Método que se conecta com uma REST API de consulta de CEP
     * @param cep
     * @return O logradouro encontrado
     * @throws IllegalArgumentException Quando o cep for inválido ou inexistente
     * @throws IllegalStateException Quando o serviço estiver fora ou em caso de problema de rede
     */
    String getLogradouro(String cep)
            throws IllegalArgumentException, IllegalStateException;
}
