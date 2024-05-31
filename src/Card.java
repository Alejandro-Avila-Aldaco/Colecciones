public class Card {
    String palo;
    String color;
    String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}
