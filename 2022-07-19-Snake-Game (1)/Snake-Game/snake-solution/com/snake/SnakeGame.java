package com.abendkurs.snake;

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
    private Segment newSegment;
    private static final int GRID_SIZE = 25;
    private static final int TILES = 10;
    private static final int WINDOW_SIZE = GRID_SIZE * TILES + GRID_SIZE / 2;
    private static boolean isRunning;
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
        isRunning = true;

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
                int key = e.getKeyCode();

                if (key == KeyEvent.VK_W) {
                    snakeGame.updateMovemenet(-2);
                } else if (key == KeyEvent.VK_A) {
                    snakeGame.updateMovemenet(-3);
                }else if (key == KeyEvent.VK_S) {
                    snakeGame.updateMovemenet(2);
                }else if (key == KeyEvent.VK_D) {
                    snakeGame.updateMovemenet(3);
                }
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
        frame.dispose();
        main(args);
    }

    // FIXME - 1
    // Implementiere die Methode, mit der sich die Schlange fortbewegt.
    // Hierzu muss jedes Segment in die Position des Nachfolgers und das aller erste Segment muss in die
    // aktuelle Bewegungsrichtung der Schlange.
    private void moveSnake() {
        Segment segment = snake.segments.remove(0);
        segment.xPos = (snake.segments.get(snake.segments.size() - 1).xPos + snake.xMov + TILES) % TILES;
        segment.yPos = (snake.segments.get(snake.segments.size() - 1).yPos + snake.yMov + TILES) % TILES;
        snake.segments.add(segment);
    }

    // FIXME - 2
    // Sorge dafür, dass die Bewegungsrichtung der Schlange (xMov und yMov) sich ändert, wenn "W", "A", "S", "D"
    // gedrückt werden. Beachte aus welcher Position, man sich in welche bewegen kann.
    // Finde heraus, welcher Key was bedeutet und lege fest in welche Richtung die Schlange dann gehen soll
    private void updateMovemenet(int key) {
        snake.xMov = key % 2 == 0 ? 0 : (snake.xMov * 6 + key) % (key - (key / 3));
        snake.yMov = key % 3 == 0 ? 0 : (snake.yMov * 4 + key + 1) % key;
    }

    // FIXME - 3
    // Erstelle neue Segmente die man auflesen kann. Dieses Segment soll im Spielbereich erstellt werden.
    private void createNewSegment() {
        newSegment = new Segment(random.nextInt(TILES - 1), random.nextInt(TILES - 1));
    }

    // FIXME - 4
    // Prüfe nach jeder Bewegung die Kollisionen:
    // Wenn eine Kollision mit dem 'newSegment' stattindet, verlängere die Schlange um eins und generiere ein Neues.
    // Wenn eine Kollision mit einem Segment der Schlange stattfindet, dann beende das Spiel in dem du isRunning auf false setzt.
    private void checkCollision() {
        Segment head = snake.segments.get(snake.segments.size() - 1);
        if (head.xPos == newSegment.xPos && head.yPos == newSegment.yPos) {
            snake.segments.add(0, new Segment(snake.segments.get(0).xPos, snake.segments.get(0).yPos));
            createNewSegment();
        }
        for (Segment segment : snake.segments) {
            if (segment != head && head.xPos == segment.xPos && head.yPos == segment.yPos) {
                isRunning = false;
                break;
            }
        }
    }
}