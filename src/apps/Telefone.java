package apps;

public class Telefone implements validacoes{
    public void ligar(){
        validarConectadoInternet();;
        System.out.println("LIGANDO");
        salvarHistorico();
    }
    public void atender(){
        System.out.println("ATENDENDO");
    }
    public void iniciarCorreioVoz(){
        validarConectadoInternet();
        System.out.println("INICIANDO CORREIO DE VOZ");
        salvarHistorico();
    }
    @Override
    public void validarConectadoInternet() {
        // TODO Auto-generated method stub
        System.out.println("Validar conectando a internet para Telefone");
    }
    @Override
    public void salvarHistorico() {
        // TODO Auto-generated method stub
        System.out.println("Salvando histórico de Telefone");
    }
}
