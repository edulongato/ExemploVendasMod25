package br.com.edulongato.services;

import br.com.edulongato.domain.Cliente;

public interface IClienteService {
    default void salvar(Cliente cliente) {
    }


    default Cliente buscarPorCPF(Long cpf) {
        return null;
    }
}
