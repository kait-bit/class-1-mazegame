public class Tester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Maze Game");
        System.out.println(""" 
                ___________E_________
                |       |   |       |
                |______ | | | _____ |
                | |   | | |   |   | |
                | | | | |_|__ | | | |
                | | | |     | | | | |
                | | | |____ | | | | |
                | | | |   | | | | | |
                | | | | | | |_| | | |
                |   |   |       |   |
                |___|___|_______|__S|""");


        MazeGame game = new MazeGame();

        game.addMove("Up");
        game.addMove("Left");
        game.addMove("Down");
        game.addMove("Left");
        game.addMove("Up");

        System.out.println("Your moves: " + game.getMoves());
        System.out.println(game.checkSolution());
    }
}
