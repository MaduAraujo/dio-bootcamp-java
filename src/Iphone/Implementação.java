package Iphone;

public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
}

// ReprodutorMusical
public class ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }
}

// AparelhoTelefonico
public class AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando.");
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void enviarMensagem() { // Melhor nome para o método
        System.out.println("Enviando mensagem.");
    }
}

// NavegadorInternet
public class NavegadorInternet {
    public void exibirPagina() {
        System.out.println("Exibindo página web.");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void pesquisar() {
        System.out.println("Pesquisando na internet.");
    }
}

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
    
        meuIphone.getReprodutorMusical().tocar();
        meuIphone.getReprodutorMusical().pausar();
    
        meuIphone.getAparelhoTelefonico().ligar();
        meuIphone.getAparelhoTelefonico().atender();
        meuIphone.getAparelhoTelefonico().enviarMensagem();
    
        meuIphone.getNavegadorInternet().exibirPagina();
        meuIphone.getNavegadorInternet().pesquisar();
    }
}