package models;

/**
 * Top level state container for the entire game.  Most state is
 * delegated to more specific State objects.
 */
public class GameModel {

    private PlayerModel player;
    private BallModel ball;
    private HoopModel hoop;
    private ShotModel shot = new ShotModel();
    private GroundModel ground = new GroundModel();

    public GameModel(PlayerModel player, BallModel ball, HoopModel hoop) {
        this.player = player;
        this.ball = ball;
        this.hoop = hoop;
    }

    public PlayerModel getPlayer() {
        return player;
    }

    public BallModel getBall() {
        return ball;
    }

    public HoopModel getHoop() {
        return hoop;
    }

    public GroundModel getGround() {
        return ground;
    }

    public ShotModel getShot() {
        return shot;
    }
}
