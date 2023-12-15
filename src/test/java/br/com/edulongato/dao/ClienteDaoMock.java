package br.com.edulongato.dao;

import br.com.edulongato.dao.IClienteDAO;
import br.com.edulongato.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {
    @Override
    public void salvar(Cliente cliente) {
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {

       Cliente cliente = new Cliente();
       cliente.setCpf(cpf);
       return cliente;
    }
}
