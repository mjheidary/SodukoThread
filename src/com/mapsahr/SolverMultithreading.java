package com.mapsahr;

public class SolverMultithreading implements Runnable  {
    private Solver solver;
    int[][] board;
    private int threadsUsed = 0;

    public SolverMultithreading(Solver solver, int[][] board) {
        this.solver = solver;
        this.board = board;
    }

    @Override
    public void run() {
        threadsUsed++;
        Solver solver=this .solver;
        solver.solve(board);
        System.out.println(" ");
        solver.printBoard(board);
        System.out.println("Threads used: " + threadsUsed);
        System.out.println("Threads ID: " + Thread.currentThread().getId());
        System.out.println(("Threads Name: " +Thread.currentThread().getName()));

    }
}
