package com.snake;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel {

    private static final int refreshRate = 250;
    private Snake snake;
    private static final int GRID_SIZE = 25;
    private static final int TILES = 10;
    private Segment newSegment = new Segment(TILES - 2, TILES - 2);
    private static final int WINDOW_SIZE = GRID_SIZE * TILES + GRID_SIZE / 2;
    private static boolean isRunning = true;
    private static final Random random = new Random(1);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.CYAN);
        for (Segment segment : snake.segments) {
            g2d.fillRect(segment.xPos * GRID_SIZE, segment.yPos * GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }
        g2d.setColor(Color.BLUE);
        g2d.fillRect(newSegment.xPos * GRID_SIZE, newSegment.yPos * GRID_SIZE, GRID_SIZE, GRID_SIZE);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Snake Demo");

        SnakeGame snakeGame = new SnakeGame();
        snakeGame.snake = new Snake();
        List<Segment> segments = new ArrayList<>();
        segments.add(new Segment(0, 0));
        segments.add(new Segment(1, 0));
        segments.add(new Segment(2, 0));
        snakeGame.snake.segments = segments;
        snakeGame.createNewSegment();

        frame.add(snakeGame);
        frame.setSize(WINDOW_SIZE, WINDOW_SIZE + GRID_SIZE);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
				snakeGame.updateMovemenet(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });

        // GameLoop
        while (isRunning) {
            snakeGame.moveSnake();
            snakeGame.checkCollision();
            snakeGame.repaint();
            Thread.sleep(refreshRate);
        }

        JOptionPane.showMessageDialog(frame, "You lost. The only way to win is to never play");
        isRunning = true;
        frame.dispose();
        main(args);
    }

    // FIXME - 1
    // Implementiere die Methode, mit der sich die Schlange sich immer fortbewegt
    // Hierzu muss jedes Segment in die Position des Nachfolgers und das aller erste Segment muss in die
    // aktuelle Bewegungsrichtung der Schlange
    private void moveSnake() {
    }

    // FIXME - 2
    // Sorge dafür, dass die Bewegungsrichtung der Schlange sich ändert, wenn "W", "A", "S", "D"
    // gedrückt werden
    // Finde heraus, welcher Key was bedeutet und lege fest in welche Richtung die Schlange dann gehen soll
    private void updateMovemenet(int key) {
    }

    // FIXME - 3
    // Erstelle neue Segmente die man auflesen kann. Wenn die Schlange auf so ein Element kommt,
    // dann wird dieses Segment zu der Liste hinzugefügt.
    private void createNewSegment() {
    }

    // FIXME - 4
    // Prüfe nach jeder Bewegung die Collision, wenn eine Collision stattfindet, dann
    // beende das Spiel in dem du isRunning auf false setzt
    private void checkCollision() {
    }
}