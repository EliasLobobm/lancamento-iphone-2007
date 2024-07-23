package apps;

public class Navegador implements validacoes{
    public void exibirPagina(){
        validarConectadoInternet();
        System.out.println("EXIBINDO PÁGINA");
        salvarHistorico();
    }
    public void adicionarAba(){
        System.out.println("ADICIONANDO ABA");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA");
    }
    @Override
    public void validarConectadoInternet() {
        // TODO Auto-generated method stub
        System.out.println("Validar conectando a internet para Navegador");
    }
    @Override
    public void salvarHistorico() {
        // TODO Auto-generated method stub
        System.out.println("Salvando histórico de Navegador");
    }
}
