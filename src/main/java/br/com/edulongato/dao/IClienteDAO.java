package br.com.edulongato.dao;

import br.com.edulongato.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);
    Cliente buscarPorCPF(Long cpf);
}
