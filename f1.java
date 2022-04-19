import java.util.Scanner;

public class f1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos pontos Charles Leclerc somou na corrida da Australia?");
        Integer resultado = scanner.nextInt();
        double charlesLeclercPosicao = 0.0;
        switch(resultado) {
            case 1:
                charlesLeclercPosicao = 25.0;
                break;
            case 2:
                charlesLeclercPosicao = 19.0;
                break;
            case 3:
                charlesLeclercPosicao = 18.0;
                break;
            case 4:
                charlesLeclercPosicao = 17.0;
                break;
            case 5:
                charlesLeclercPosicao = 16.0;
                break;
            case 6:
                charlesLeclercPosicao = 15.0;
                break;
            case 7:
                charlesLeclercPosicao = 14.0;
                break;
            case 8:
                charlesLeclercPosicao = 13.0;
                break;
            case 9:
                charlesLeclercPosicao = 12.0;
                break;
            case 10:
                charlesLeclercPosicao = 11.0;
                break;
            case 11:
                charlesLeclercPosicao = 10.0;
                break;
            case 12:
                charlesLeclercPosicao = 9.0;
                break;
            case 13:
                charlesLeclercPosicao = 8.0;
                break;
            case 14:
                charlesLeclercPosicao = 7.0;
                break;
            case 15:
                charlesLeclercPosicao = 6.0;
                break;
            case 16:
                charlesLeclercPosicao = 5.0;
                break;
            case 17:
                charlesLeclercPosicao = 4.0;
                break;
            case 18:
                charlesLeclercPosicao = 3.0;
                break;
            case 19:
                charlesLeclercPosicao = 2.0;
                break;
            case 20:
                charlesLeclercPosicao = 1.0;
                break;
            case 0:
                charlesLeclercPosicao = 0.0;
                break;
            default:
        }
        System.out.print("Quantos pontos George Russell somou na corrida da Australia?");
        Double georgeRussel = scanner.nextDouble();
        System.out.print("Quantos pontos Carlos Sainz somou na corrida da Australia?");
        Double carlosSainz = scanner.nextDouble();
        System.out.print("Quantos pontos Sergio Pérez somou na corrida da Australia?");
        Double sergioPerez = scanner.nextDouble();
        System.out.print("Quantos pontos Lewis Hamilton somou na corrida da Australia?");
        Double lewisHamilton = scanner.nextDouble();
        System.out.print("Quantos pontos Max Verstappen somou na corrida da Australia?");
        Double maxVerstappen = scanner.nextDouble();
        System.out.print("Quantos pontos Esteban Ocon somou na corrida da Australia?");
        Double estebanOcon = scanner.nextDouble();
        System.out.print("Quantos pontos Lando Norris somou na corrida da Australia?");
        Double landoNorris = scanner.nextDouble();
        System.out.print("Quantos pontos Kevin Magnussen somou na corrida da Australia?");
        Double kevinMagnussen = scanner.nextDouble();
        System.out.print("Quantos pontos Valtteri Bottas somou na corrida da Australia?");
        Double valtteriBottas = scanner.nextDouble();
        System.out.print("Quantos pontos Daniel Ricciardo somou na corrida da Australia?");
        Double danielRicciardo = scanner.nextDouble();
        System.out.print("Quantos pontos Pierre Gasly somou na corrida da Australia?");
        Double pierreGasly = scanner.nextDouble();
        System.out.print("Quantos pontos Yuki Tsunoda somou na corrida da Australia?");
        Double yukiTsunoda = scanner.nextDouble();
        System.out.print("Quantos pontos Fernando Alonso somou na corrida da Australia?");
        Double fernandoAlonso = scanner.nextDouble();
        System.out.print("Quantos pontos Guanyu Zhou somou na corrida da Australia?");
        Double guanyuZhou = scanner.nextDouble();
        System.out.print("Quantos pontos Alexander Albon somou na corrida da Australia?");
        Double alexanderAlbon = scanner.nextDouble();
        System.out.print("Quantos pontos Mick Schumacher somou na corrida da Australia?");
        Double mickShumacher = scanner.nextDouble();
        System.out.print("Quantos pontos Lance Stroll somou na corrida da Australia?");
        Double lanceStroll = scanner.nextDouble();
        System.out.print("Quantos pontos Nicholas Latifi somou na corrida da Australia?");
        Double nicholasLatifi = scanner.nextDouble();
        System.out.print("Quantos pontos Sebastian Vettel somou na corrida da Australia?");
        Double sebastianVettel = scanner.nextDouble();
        int primeiroLugar = 25;
        int segundoLugar = 19;
        int terceirolugar = 18;
        int quartoLugar = 17;
        int quintoLugar = 16;
        int sextoLugar = 15;
        int setimoLugar = 14;
        int oitavoLugar = 13;
        int nonoLugar = 12;
        int decimoLugar = 11;
        int decimoPrimeiroLugar = 10;
        int decimoSegundoLugar = 9;
        int decimoTerceirolugar = 8;
        int decimoQuartoLugar = 7;
        int decimoQuintoLugar = 6;
        int decimoSextoLugar = 5;
        int decimoSétimoLugar = 4;
        int decimoOitavoLugar = 3;
        int decimoNonoLugar = 2;
        int vigesimoLugar = 1;
        int abandonouACorrida = 0;
        int naoParticipouDaCorrida = 0;
        int resultadoPontuacaoCharlesLeclarc = (int) (primeiroLugar + segundoLugar + charlesLeclercPosicao);
        System.out.println("Charles Leclerc tem " + resultadoPontuacaoCharlesLeclarc + " Pontos!");
        int resultadoPontuacaoGeorgeRussel = (int) (quartoLugar + quintoLugar + georgeRussel);
        System.out.println("George Russel tem " + resultadoPontuacaoGeorgeRussel + " Pontos!");
        int resultadoPontuacaoCarlosSainz = (int) (segundoLugar + terceirolugar + carlosSainz);
        System.out.println("carlos sainz tem " + resultadoPontuacaoCarlosSainz + " Pontos!");
        int resultadoPontuacaoSergioPerez = (int) (decimoOitavoLugar + quartoLugar + sergioPerez);
        System.out.println("Sergio perez tem " + resultadoPontuacaoSergioPerez + " Pontos!");
        int resultadoPontuacaoLewisHamilton = (int) (terceirolugar + decimoLugar + lewisHamilton);
        System.out.println("Lewis Hamilton tem" + resultadoPontuacaoLewisHamilton + " Pontos!");
        int resultadoPontuacaoMaxVerstappen = (int) (decimoNonoLugar + primeiroLugar + maxVerstappen);
        System.out.println("Max Veerstappen tem" + resultadoPontuacaoMaxVerstappen + " Pontos!");
        int resultadoPontuacaoEstebanOcon = (int) (setimoLugar + sextoLugar + estebanOcon);
        System.out.println("Estebam ocon tem" + resultadoPontuacaoEstebanOcon + " Pontos!");
        int resultadoPontuacaoLandoNorris = (int) (decimoQuintoLugar + setimoLugar + landoNorris);
        System.out.println("Lando Norris tem" + resultadoPontuacaoLandoNorris + " Pontos!");
        int resultadoPontuacaoKevinMagnussen = (int) (quintoLugar + nonoLugar + kevinMagnussen);
        System.out.println("Kevin Magnussen tem" + resultadoPontuacaoKevinMagnussen + " Pontos!");
        int resultadoPontuacaoValtteriBottas = (int) (sextoLugar + vigesimoLugar + valtteriBottas);
        System.out.println("valtteri Bottas tem" + resultadoPontuacaoValtteriBottas + " Pontos!");
        int resultadoPontuacaoDanielRicciardo = (int) (decimoQuartoLugar + decimoNonoLugar + danielRicciardo);
        System.out.println("Daniel Ricciardo tem" + resultadoPontuacaoDanielRicciardo + " Pontos!");
        int resultadoPontuacaoPierreGasly = (int) (decimoOitavoLugar + oitavoLugar + pierreGasly);
        System.out.println("Pierre Gasly tem" + resultadoPontuacaoPierreGasly + " Pontos!");
        int resultadoPontuacaoYukiTsunoda = (int) (oitavoLugar + decimoSétimoLugar + yukiTsunoda);
        System.out.println("Yuki Tsunoda tem" + resultadoPontuacaoYukiTsunoda + " Pontos!");
        int resultadoPontuacaoFernandoAlonso = (int) (nonoLugar + decimoSextoLugar + fernandoAlonso);
        System.out.println("Fernando Alonso tem" + resultadoPontuacaoFernandoAlonso + " Pontos!");
        int resultadoPontuacaoGuanyuZhou = (int) (decimoLugar + decimoPrimeiroLugar +guanyuZhou);
        System.out.println("Guanyu Zhou tem" + resultadoPontuacaoGuanyuZhou + " Pontos!");
        int resultadoPontuacaoAlexanderAlbon = (int) (decimoTerceirolugar + decimoQuartoLugar + alexanderAlbon);
        System.out.println("Alexander Albon tem" + resultadoPontuacaoAlexanderAlbon + " Pontos!");
        int resultadoPontuacaoMickShumacher = (int) (decimoPrimeiroLugar + abandonouACorrida + mickShumacher);
        System.out.println("Mick Shumacher tem" + resultadoPontuacaoMickShumacher + " Pontos!");
        int resultadoPontuacaoLanceStroll = (int) (decimoSegundoLugar + decimoTerceirolugar + lanceStroll);
        System.out.println("Lance Stroll tem" + resultadoPontuacaoLanceStroll + " Pontos!");
        int resultadoPontuacaoNicholasLatifi = (int) (decimoSextoLugar + abandonouACorrida + nicholasLatifi);
        System.out.println("Nicholas latifi tem" + resultadoPontuacaoNicholasLatifi + " Pontos!");
        int resultadoPontuacaoSebastianVettel = (int) (naoParticipouDaCorrida + naoParticipouDaCorrida + sebastianVettel);
        System.out.println("Sebastian vettel tem" + resultadoPontuacaoSebastianVettel + " Pontos!");
    }
}
