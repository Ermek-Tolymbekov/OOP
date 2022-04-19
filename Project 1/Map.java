import java.util.Scanner;
import java.util.ArrayList;

public class Map {
    private int size;
    private ArrayList<ArrayList<Character>> map = null;

    public Map(Scanner input) throws InvalidMapException {
        size = input.nextInt();

        //Check if the size is 0
        if (size == 0)
            throw new InvalidMapException("Map size can not be zero");
        map = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            ArrayList<Character> row = new ArrayList<>();
            for(int j = 0; j < size; j++) {
                String element = input.next();
                //Check if element if valid
                if (element.length() != 1) //user already typing moves
                    throw new InvalidMapException("Not enough map elements");
                row.add(element.charAt(0));
            }
            map.add(row);
        }
    }

    public int getSize() {
        return size;
    }

    public char getValueAt(int x, int y) {
        if (x >= size || y >= size || x < 0 || y < 0) // if OoB
            return '1';
        return map.get(y).get(x);
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(map.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public void move(int x, int y, char d){
        map.get(y).set(x, '0');
        switch(d){
            case 'R':
                map.get(y).set(x + 1, 'P');
                break;
            case 'L':
                map.get(y).set(x - 1, 'P'); 
                break;
            case 'U':
                map.get(y - 1).set(x, 'P');
                break;
            case 'D':
                map.get(y + 1).set(x, 'P');
                break;
        }
    }
}
