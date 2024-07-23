package apps;

public class Musica implements validacoes{
    public void tocar(){
        validarConectadoInternet();
        System.out.println("TOCANDO MÚSICA");
        salvarHistorico();
    }
    public void pausar(){
        System.out.println("MÚSICA PAUSADA");
    }
    public void selecionarMusica(){
        System.out.println("MÚSICA SELECIONADA");
    }
    @Override
    public void validarConectadoInternet() {
        // TODO Auto-generated method stub
        System.out.println("Validar conectando a internet para música");
    }
    @Override
    public void salvarHistorico() {
        // TODO Auto-generated method stub
        System.out.println("Salvando histórico de música");
    }
}
