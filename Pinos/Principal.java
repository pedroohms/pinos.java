public class Principal {
    public static void main(String[] args) {

        BuracoRedondo buracoRedondo = new BuracoRedondo(5.0);
        PinoRedondo pinoRedondo = new PinoRedondoConcreto(5.0);

        if (buracoRedondo.encaixa(pinoRedondo)) {
            System.out.println("O pino redondo se encaixa no buraco redondo.");
        } else {
            System.out.println("O pino redondo não se encaixa no buraco redondo.");
        }

        PinoQuadrado pinoQuadrado = new PinoQuadrado(7.0);
        PinoRedondo adaptadorPinoQuadrado = new AdaptadorPinoQuadrado(pinoQuadrado);

        if (buracoRedondo.encaixa(adaptadorPinoQuadrado)) {
            System.out.println("O pino quadrado adaptado se encaixa no buraco redondo.");
        } else {
            System.out.println("O pino quadrado adaptado não se encaixa no buraco redondo.");
        }
    }
}

