package com.example.backend.models;

public class GameState {
    public static final int BOARD_SIZE = 9;
    public static final int MAX_WALLS = 10;

    // Player Positions: [x, y]
    private int[] player1Pos;
    private int[] player2Pos;
    
    // Wall status: 8x8 grid of possible wall placements + if a wall is placed its corresponding place in the array will be True
    private final boolean[][] horizontalWalls;
    private final boolean[][] verticalWalls;
    
    private int player1Walls;
    private int player2Walls;
    
    private int currentPlayer; // 1 or 2

    public GameState() {
        // Initialize board
        this.horizontalWalls = new boolean[8][8];
        this.verticalWalls = new boolean[8][8];
        
        // Starting walls
        this.player1Walls = MAX_WALLS;
        this.player2Walls = MAX_WALLS;
        
        // Initialize Turn
        this.currentPlayer = 1;

        // Set starting positions to the middle of the first and last rows
        this.player1Pos = new int[]{4, 0}; 
        this.player2Pos = new int[]{4, 8};
    }
}