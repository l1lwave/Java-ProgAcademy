package lesson7JavaStart;

import java.io.IOException;
import java.io.PrintWriter;

public class SixthEx {
    public static void main(String[] args) {
        String filePath = "ascii_art.txt";
        
        createASCIIArt(filePath);
    }
    
    public static void createASCIIArt(String filePath) {
    	int size = 40;
        char[][] grid = new char[size][size];
        int center = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '*';
            }
        }

        int a = 0, b = 1;
        int x = center, y = center;
        grid[y][x] = '0';
        int direction = 0; 

        for (int i = 0; i < 15; i++) { 
            int steps = b;
            for (int s = 0; s < steps; s++) {
                switch (direction) {
                    case 0: x += 1; break;
                    case 1: y += 1; break;
                    case 2: x -= 1; break;
                    case 3: y -= 1; break;
                }
                if (x >= 0 && x < size && y >= 0 && y < size) {
                    grid[y][x] = '0';
                }
            }
            direction = (direction + 1) % 4;
            int next = a + b;
            a = b;
            b = next;
        }

        try (PrintWriter writer = new PrintWriter(filePath)) {
            for (int i = 0; i < size; i++) {
                writer.print(grid[i]);
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("ASCIIArt was create in file: " + filePath);
    }
}
