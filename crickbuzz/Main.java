package crickbuzz;

import java.util.List;

import crickbuzz.inning.Ball;
import crickbuzz.inning.BallType;
import crickbuzz.inning.Over;
import crickbuzz.inning.RunsScored;
import crickbuzz.player.Person;
import crickbuzz.player.Player;
import crickbuzz.player.PlayerType;

public class Main {

    public static void main(String[] args) {
        //Create team India
        Player rohit = new Player(new Person("Rohit", 35), PlayerType.BATSMAN);
        Player gill = new Player(new Person("Gill", 25), PlayerType.BATSMAN);
        Player virat = new Player(new Person("Virat", 35), PlayerType.BATSMAN);
        Player shreyas = new Player(new Person("Shreyas", 30), PlayerType.BATSMAN);
        Player surya = new Player(new Person("Surya", 30), PlayerType.BATSMAN);
        Player rahul = new Player(new Person("Rahul", 30), PlayerType.WICKETKEEPER);
        Player kishan = new Player(new Person("Kishan", 30), PlayerType.WICKETKEEPER);
        Player jadeja = new Player(new Person("Ravindra", 34), PlayerType.ALLROUNDER);
        Player hardik = new Player(new Person("Hardik", 31), PlayerType.ALLROUNDER);
        Player shardul = new Player(new Person("Shardul", 31), PlayerType.ALLROUNDER);
        Player kuldeep = new Player(new Person("Kuldeep", 28), PlayerType.BOWLER);
        Player shami = new Player(new Person("Shami", 33), PlayerType.BOWLER);
        Player siraj = new Player(new Person("Siraj", 28), PlayerType.BOWLER);
        Player jasprit = new Player(new Person("Jasprit", 29), PlayerType.BOWLER);

        List<Player> playing11Ind = List.of(rohit, gill, virat, shreyas, rahul, jadeja, hardik, kuldeep, shami, siraj, jasprit);
        List<Player> benchInd = List.of(surya, kishan, shardul);

        Team indiaTeam = new Team("INDIA", playing11Ind, benchInd);
        indiaTeam.printPlaying11();

        //create team Australia
        Player warner = new Player(new Person("Warner", 35), PlayerType.BATSMAN);
        Player marsh = new Player(new Person("Marsh", 25), PlayerType.BATSMAN);
        Player smith = new Player(new Person("Smith", 35), PlayerType.BATSMAN);
        Player labuschagne = new Player(new Person("Labuschagne", 30), PlayerType.BATSMAN);
        Player stoinis = new Player(new Person("Stoinis", 30), PlayerType.ALLROUNDER);
        Player carey = new Player(new Person("Carey", 30), PlayerType.WICKETKEEPER);
        Player inglish = new Player(new Person("Inglish", 30), PlayerType.WICKETKEEPER);
        Player green = new Player(new Person("Green", 34), PlayerType.ALLROUNDER);
        Player maxwell = new Player(new Person("Maxwell", 31), PlayerType.ALLROUNDER);
        Player abott = new Player(new Person("Abott", 31), PlayerType.ALLROUNDER);
        Player zampa = new Player(new Person("Zampa", 28), PlayerType.BOWLER);
        Player cummins = new Player(new Person("Cummins", 33), PlayerType.BOWLER);
        Player stark = new Player(new Person("Stark", 28), PlayerType.BOWLER);
        Player hazlewood = new Player(new Person("Hazlewood", 29), PlayerType.BOWLER);

        List<Player> playing11Aus = List.of(marsh, warner, smith, labuschagne, stoinis, inglish, maxwell, stark, cummins, zampa, hazlewood);
        List<Player> benchAus = List.of(carey, green, abott);

        Team ausTeam = new Team("AUSTRALIA", playing11Aus, benchAus);
        ausTeam.printPlaying11();

        //Let us start the match of 1 over
        System.out.println("match started");
        Ball ball1 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball2 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball3 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball4 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball5 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Ball ball6 = new Ball(1, BallType.LEGAL, RunsScored.FOUR, battingTeam.getPlaying11().get(0), bowlingTeam.getPlaying11().get(10));
        Over over = new Over(1, List.of(ball1, ball2, ball3, ball4, ball5, ball6));
    }

}
