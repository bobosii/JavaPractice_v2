package FootballMatchFixture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FixtureCreator {
    Scanner inp = new Scanner(System.in);
    private String club;
    ArrayList<String> clubs = new ArrayList<>();

    public void start(){
        System.out.println("Lütfen takım ismi giriniz");
        System.out.println("Takım seçimini bitirmek için 0 rakamını tuşlayınız");
        enterClubs();
        clubsInfo(clubs);
        generateFixtures(clubs);
    }

    public void generateFixtures(ArrayList<String> clubs){
        if (clubs.size() % 2 != 0){
            clubs.add("Bay");
        }

        Collections.shuffle(clubs);

        int numRounds = clubs.size() * 2 - 2;
        int numMatchesPerRound = clubs.size() / 2;
        String homeTeam;
        String awayTeam;

        for (int rounds = 0; rounds<numRounds; rounds++){
            System.out.println("Round : " + (rounds + 1));
            for (int match = 0; match<numMatchesPerRound; match++){
                homeTeam = clubs.get(match);
                awayTeam = clubs.get(clubs.size() - 1 - match);
                System.out.println(homeTeam + " VS " + awayTeam);
            }
            rotateTeams(clubs);
        }

    }
    public void rotateTeams(ArrayList<String> clubs){
        String last = clubs.removeLast();
        clubs.add(1,last);
    }

    public void enterClubs(){
        boolean cont = true;
        while (cont){
            club = inp.nextLine();
            if (club.equals("0")){
                cont = false;
            }else {
                clubs.add(club);
            }
        }
    }
    public void clubsInfo(ArrayList<String> clubs){
        System.out.println("Girilen takımlar : ");
        for (String club: clubs){
            System.out.println(club);
        }
    }

}
