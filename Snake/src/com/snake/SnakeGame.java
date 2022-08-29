package com.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SnakeGame extends JPanel {

    private static final int refreshRate = 250;
    private static final int GRID_SIZE = 25;
    private static final int TILES = 10;
    private static final int WINDOW_SIZE = GRID_SIZE * TILES + GRID_SIZE / 2;
    private static final Random random = new Random(1);
    private static int currentDirection = 68;
    private static boolean isRunning = true;
    private static boolean isPressed = false;
    private Snake snake;
    private Segment newSegment = new Segment(TILES - 2, TILES - 2);

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Snake Demo");

        SnakeGame snakeGame = new SnakeGame();
        snakeGame.snake = new Snake();
        List<Segment> segments = new ArrayList<>();
        segments.add(new Segment(0, 6));
        segments.add(new Segment(1, 6));
        snakeGame.snake.segments = segments;
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
                if (!isPressed) {
                    snakeGame.updateMovemenet(e.getKeyCode());
                    isPressed = true;
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
        isRunning = true;
        frame.dispose();
        main(args);
    }

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

    // FIXME - 1
    // Implementiere die Methode, mit der sich die Schlange sich immer fortbewegt
    // Hierzu muss jedes Segment in die Position des Nachfolgers und das aller erste Segment muss in die
    // aktuelle Bewegungsrichtung der Schlange
    private void moveSnake() {
        Segment s = snake.segments.get(snake.segments.size() - 1);
        if (currentDirection == 87) {
            if ((s.yPos - 1) == -2) {
                s.yPos = 10;
            }
            snake.segments.add(new Segment(s.xPos, s.yPos - 1));
        } else if (currentDirection == 65) {
            if ((s.xPos - 1) == -2) {
                s.xPos = 10;
            }
            snake.segments.add(new Segment(s.xPos - 1, s.yPos));
        } else if (currentDirection == 83) {
            if ((s.yPos + 1) == 11) {
                s.yPos = -1;
            }
            snake.segments.add(new Segment(s.xPos, s.yPos + 1));
        } else if (currentDirection == 68) {
            if ((s.xPos + 1) == 11) {
                s.xPos = -1;
            }
            snake.segments.add(new Segment(s.xPos + 1, s.yPos));
        }
        Segment s1 = snake.segments.get(snake.segments.size() - 1);
        if (s1.xPos == newSegment.xPos && s1.yPos == newSegment.yPos) {
            createNewSegment(true);
        } else {
            createNewSegment(false);
        }
        isPressed = false;
    }


    // FIXME - 2
    // Sorge dafür, dass die Bewegungsrichtung der Schlange sich ändert, wenn "W", "A", "S", "D"
    // gedrückt werden
    // Finde heraus, welcher Key was bedeutet und lege fest in welche Richtung die Schlange dann gehen soll
    private void updateMovemenet(int key) {

        if (key == 87 && currentDirection != 83) { // w
            Segment s = snake.segments.get(snake.segments.size() - 1);
            currentDirection = 87;
        } else if (key == 65 && currentDirection != 68) { // a
            currentDirection = 65;
        } else if (key == 83 && currentDirection != 87) { // s
            currentDirection = 83;
        } else if (key == 68 && currentDirection != 65) { // d
            currentDirection = 68;
        }
    }

    // FIXME - 3
    // Erstelle neue Segmente die man auflesen kann. Wenn die Schlange auf so ein Element kommt,
    // dann wird dieses Segment zu der Liste hinzugefügt.
    private void createNewSegment(boolean create) {
        if (!create) {
            snake.segments.remove(0);
        } else {
            Random r = new Random();
            newSegment = new Segment(r.nextInt(10), r.nextInt(10));
            checkCollision();
        }
    }

    // FIXME - 4
    // Prüfe nach jeder Bewegung die Collision, wenn eine Collision stattfindet, dann
    // beende das Spiel in dem du isRunning auf false setzt
    private void checkCollision() {
        for (Segment s : snake.segments) {
            for (Segment s2 : snake.segments) {
                if (s.xPos == s2.xPos && s.yPos == s2.yPos && s != s2) {
                    isRunning = false;
                    currentDirection = 68;
                }
            }
            /*if ((s.xPos >= 10 || s.xPos < 0) || (s.yPos >= 10 || s.yPos < 0)) {
                isRunning = false;
                currentDirection = 68;
            }*/
            if (s.xPos == newSegment.xPos && s.yPos == newSegment.yPos) {
                createNewSegment(true);
            }
        }
    }
}