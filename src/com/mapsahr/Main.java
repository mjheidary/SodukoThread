package com.mapsahr;

public class Main {

    public static void main(String[] args) throws InterruptedException {
            int[][] board = {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0}
            };

            Solver solver = new Solver();
            solver.printBoard(board);
            System.out.println(" ");
            solver.solve(board);
            solver.printBoard(board);
            System.out.println(" ");
            Solver solver1 = new Solver();
            SolverMultithreading solverThread=new SolverMultithreading(solver1,board);
            Thread thread = new Thread(solverThread);
            thread.start();

    }
}
