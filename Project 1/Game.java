public class Game {
    private Map map;
    private Player player = null;

    public Game(Map map) {
        this.map = map;
    }

    public void addPlayer(Player player) {
        this.player = player;
        this.player.setMap(map);
    }    
}
