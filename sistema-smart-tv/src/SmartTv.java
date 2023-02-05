public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
    }

    public void aumentarVolume () {
        ++volume;
        System.out.println("Volume aumentado para " + volume);
    }

    public void diminuirVolume () {
        --volume;
        System.out.println("Volume diminuído para " + volume);
    }

    public void incrementarCanal() {
        ++canal;
    }

    public void decrementarCanal() {
        --canal;
    }

    public void mudarCanal (int chosenChannel) {
        canal = chosenChannel == 0 ? canal : chosenChannel;
    }
}
