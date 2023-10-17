// Classe Iphone
public class Iphone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public Iphone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void pausarMusica() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    public void ligar() {
        aparelhoTelefonico.ligar();
    }

    public void atenderChamada() {
        aparelhoTelefonico.atenderChamada();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocarMusica();
        iphone.selecionarMusica("Música A");
        iphone.ligar();
        iphone.atenderChamada();
        iphone.exibirPagina("https://www.pagina.com");
    }
}

// Classe ReprodutorMusical
class ReprodutorMusical {
    public void tocar() {
        System.out.println("Reprodutor Musical: Tocando música...");
    }

    public void pausar() {
        System.out.println("Reprodutor Musical: Pausando música...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Reprodutor Musical: Selecionando música " + musica);
    }
}

// Classe AparelhoTelefonico
class AparelhoTelefonico {
    public void ligar() {
        System.out.println("Aparelho Telefônico: Ligando...");
    }

    public void atenderChamada() {
        System.out.println("Aparelho Telefônico: Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Aparelho Telefônico: Iniciando correio de voz...");
    }
}

// Classe NavegadorInternet
class NavegadorInternet {
    public void exibirPagina(String url) {
        System.out.println("Navegador na Internet: Exibindo página " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Navegador na Internet: Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Navegador na Internet: Atualizando página...");
    }
}
