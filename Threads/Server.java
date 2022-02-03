import java.io.BufferedReader;
import java.io.InputStreamReader;


class Handler {
    public Handler() {
        System.out.println("thread constructor: Start");
        Thread tHandler = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    runHandler();
                }
            }
        );
        tHandler.start();
        System.out.println("thread constructor: End");
    }
    
    public void runHandler() {
        try {
            System.out.println("2 thread handling started");
            Thread.sleep(1000);
            System.out.println("3 thread handling successfully finished");
        } catch (Exception notIgnoredException) {
            notIgnoredException.printStackTrace();
        }
    }
}

public class Server {
    public Server() {
        Thread t = new Thread(
            new Runnable() {
                @Override
                public void run() {
                    runServer();
                }
            }
        );
        t.start();
    }
    
    public void runServer() {
        while( true ) {
            try {
                System.out.println("1 waiting for new task / waiting for request ... ");
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                String test = br.readLine();
                Handler handler = new Handler();
                System.out.println("4 new handler started");
                Thread.sleep(50);
            } catch(Exception ignored) {}
        }
    }
    
    public static void main(String[] args) {
        new Server();
    }
}