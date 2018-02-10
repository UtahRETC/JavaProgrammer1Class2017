package renderers;

import models.GameModel;

import java.awt.*;

/**
 * Top level renderer for the whole game.  Mostly delegates actual rendering
 * to more specific renderers.  Also accepts state updates and handles
 * repainting the screen.
 */
public class GameRenderer extends Component {

    private GameModel state;
    private GroundRenderer groundRenderer = new GroundRenderer();
    private PlayerRenderer playerRender = new PlayerRenderer();
    private BallRenderer ballRenderer = new BallRenderer();
    private HoopRenderer hoopRenderer = new HoopRenderer();
    private ShotRenderer shotRenderer = new ShotRenderer();

    public GameRenderer(GameModel state) {
        this.state = state;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Dimension size = getSize();
        groundRenderer.render(state.getGround(), (Graphics2D)g, size);
        int groundHeight = state.getGround().getHeight();
        playerRender.render(state.getPlayer(), (Graphics2D)g, size, groundHeight);
        ballRenderer.render(state.getBall(), (Graphics2D)g, size, groundHeight);
        hoopRenderer.render(state.getHoop(), (Graphics2D)g, size, groundHeight);
        shotRenderer.render(state.getShot(), (Graphics2D)g, size, groundHeight);
    }

    public void updateState(GameModel state) {
        this.state = state;
        this.repaint();
    }
}
