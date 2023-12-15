package br.com.edulongato;

import br.com.edulongato.dao.ClienteDaoMock;
import br.com.edulongato.dao.IClienteDAO;
import br.com.edulongato.domain.Cliente;
import br.com.edulongato.services.ClienteService;
import br.com.edulongato.services.IClienteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ClienteTest {
    private  IClienteService clienteService;

    public ClienteTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }
    @Test
    public void pesquisarCliente(){
        Cliente cliente = new Cliente();
        cliente.setCpf(12312312313L);
        cliente.setNome("Carlos");
        cliente.setCidade("Bauru");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(12);
        cliente.setTel(14999999977L);

        clienteService.salvar(cliente);

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assertions.assertNotNull(clienteConsultado);

    }
}
