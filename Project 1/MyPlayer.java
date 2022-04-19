public class MyPlayer implements Player {
    private Map map;
    private Position position;
    
    public void setMap(Map map) {
        this.map = map;
        for(int i = 0; i < map.getSize(); i++) {
            for(int j = 0; j < map.getSize(); j++){
                if (map.getValueAt(i, j) == 'P'){
                    setPosition(new Position(i, j));
                    return;
                }
            }
        }
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Map getMap() {
        return map;
    }

    public Position getPosition() {
        return position;
    }

    public void moveRight() {
        int x = position.getX();
        int y = position.getY();
        if (map.getValueAt(x + 1, y) == '0'){
            position.setX(x + 1);
            map.move(x, y, 'R');
        }
        else
            return;
    }

    public void moveLeft() {
        int x = position.getX();
        int y = position.getY();
        if (map.getValueAt(x - 1, y) == '0'){
            position.setX(x - 1);
            map.move(x, y, 'L');
        }
        else
            return;
    }

    public void moveUp() {
        int x = position.getX();
        int y = position.getY();
        if (map.getValueAt(x, y - 1) == '0'){
            position.setY(y - 1);
            map.move(x, y, 'U');
        }
        else
            return;
    }
    
    public void moveDown() {
        int x = position.getX();
        int y = position.getY();
        if (map.getValueAt(x, y + 1) == '0'){
            position.setY(y + 1);
            map.move(x, y, 'D');
        }
        else
            return;
    }

}
