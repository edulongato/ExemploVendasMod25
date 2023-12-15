package br.com.edulongato.services;

import br.com.edulongato.dao.ClienteDAO;
import br.com.edulongato.dao.IClienteDAO;
import br.com.edulongato.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;
    public ClienteService(IClienteDAO clienteDAO){
        this.clienteDAO = clienteDAO;
    }

    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);
    }


    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }
}
