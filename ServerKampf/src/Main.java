import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    private static volatile boolean isRunning = true;

    public static void main(String[] args) {
        try (Socket socket = new Socket("85.214.103.108", 8000);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            new Thread(() -> {
                System.out.println("Started thread");
                try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    while (isRunning) {
                        String line = "";
                        while ((line = in.readLine()) != null) {
                            System.out.println(line);
                            if (line.equals("exit")) {
                                isRunning = false;
                                scanner.close();
                                writer.close();
                            }
                        }
                    }
                } catch (IOException ignore) {
                    System.out.println("Exception in thread");
                }
            }).start();

            while (isRunning) {
                writer.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

