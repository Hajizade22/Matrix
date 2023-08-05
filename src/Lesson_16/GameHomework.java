package Lesson_16;

import java.util.Scanner;

public interface GameHomework {
    void initialize();

    void play();

}

class WordChainGame implements GameHomework {
    private String currentWord;
    private int currentPlayer;
    private String[] players;
    private boolean gameOver;


    @Override
    public void initialize() {
        currentWord="";
        currentPlayer=0;
        players=new String[]{"Oyuncu 1","Oyuncu 2"};
        gameOver=false;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Baslangic sozu elave edin");
        currentWord= scanner.nextLine().toLowerCase();
        System.out.println("Baslangic soz "+ currentWord +" olaraq secildi");
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            String sonSoz= currentWord.substring(currentWord.length() - 1);
            String OyuncuAdi = players[currentPlayer];

            System.out.print(OyuncuAdi + " Sonu '" + sonSoz + "' ile biten bir soz daxil edin "+
                    "' (oyundan cixmaq ucun 'quit' yazin): ");
            String inputWord = scanner.nextLine().toLowerCase();

            if (inputWord.equals("quit")) {
                System.out.println("Oyun sona catdi");
                gameOver = true;
                break;
            }

            if (inputWord.isEmpty()) {
                System.out.println("Enter duymesini sixmadan once herf yaz");
                continue;
            }

            char daxilEdilen = inputWord.charAt(0);
            char sonHerf = currentWord.charAt(currentWord.length() - 1);

            if (daxilEdilen == sonHerf) {
                currentWord = inputWord;
                currentPlayer = (currentPlayer + 1)%players.length ;
            } else {
                System.out.println("Yalnis sozun ilk herfi '" + sonHerf + "' olmalidir. Yeniden yoxlayin");
            }


        }


    }

}
 class MainHomeWork {
    public static void main(String[] args) {
        WordChainGame wordChainGame = new WordChainGame();
        wordChainGame.initialize();
        wordChainGame.play();
    }
}

