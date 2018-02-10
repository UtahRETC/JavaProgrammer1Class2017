

import engines.GameEngine;
import models.BallModel;
import models.GameModel;
import models.HoopModel;
import models.PlayerModel;
import renderers.GameRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Entry point for the entire program.
 */
public class Launcher {
    public static void main(String[] args) {
        GameModel state = createGame();

        GameEngine engine = new GameEngine();

        ConcurrentLinkedQueue<String> inputQueue = new ConcurrentLinkedQueue<>();
        GameRenderer renderer = createUI(state, inputQueue);
        startGame(state, inputQueue, renderer, engine);
    }

    private static void startGame(GameModel state, ConcurrentLinkedQueue<String> inputQueue, GameRenderer renderer, GameEngine engine) {
        ScheduledExecutorService loopRunner = Executors.newScheduledThreadPool(1);
        loopRunner.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                String input = inputQueue.poll();
                engine.updateState(state, input);
                renderer.updateState(state);
            }
        }, 100,10, TimeUnit.MILLISECONDS);
    }

    private static GameRenderer createUI(GameModel state, ConcurrentLinkedQueue<String> inputQueue) {
        Dimension dimension = new Dimension(1024, 768);
        JFrame frame = new JFrame("Hoops");
        frame.setLocation(500, 150);

        frame.setPreferredSize(dimension);
        frame.setSize(dimension);
        frame.pack();
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


        GameRenderer renderer = new GameRenderer(state);
        renderer.setSize(dimension);

        Map<Integer, String> knownKeys = new HashMap<>();
        knownKeys.put(40, "ARROW_DOWN");
        knownKeys.put(38, "ARROW_UP");
        knownKeys.put(37, "ARROW_LEFT");
        knownKeys.put(39, "ARROW_RIGHT");
        knownKeys.put(32, "SPACEBAR");
        knownKeys.put(10, "ENTER");
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String input = knownKeys.get(e.getKeyCode());
                if(input != null){
                    inputQueue.offer(input);
                }
            }
        });
        frame.add(renderer);
        return renderer;
    }

    private static GameModel createGame() {
        BallModel ball = new BallModel();
        PlayerModel player = new PlayerModel(200);
        player.hold(ball);
        return new GameModel(player, ball, new HoopModel());
    }
}
