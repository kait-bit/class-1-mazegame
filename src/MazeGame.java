import java.util.ArrayList;

public class MazeGame {
    private final ArrayList<String> moves;
    private final ArrayList<String> solution;
    private boolean solved;

    public MazeGame() {
        this.moves = new ArrayList<>();
        this.solution = new ArrayList<>();
        this.solved = false;
        startGame();
    }

    public void startGame() {
        solution.add("Up");
        solution.add("Left");
        solution.add("Down");
        solution.add("Left");
        solution.add("Up");
    }

    public void addMove(String move) {
        this.moves.add(move);
    }

    public String checkSolution() {
        if (moves.equals(solution)) {
            solved = true;
            return "Congratulations, you solved the maze!";
        }

        return "You have not solved the maze.";
    }

    public void resetMoves() {
        moves.clear();
    }

    public ArrayList<String> getMoves() {
        return moves;
    }

    public ArrayList<String> getSolution() {
        return solution;
    }

    public boolean getSolved() {
        return solved;
    }
}
