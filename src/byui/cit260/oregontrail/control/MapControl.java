package byui.cit260.oregontrail.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Question;
import byui.cit260.oregontrail.model.QuestionScene;

@SuppressWarnings("serial")
public class MapControl implements Serializable {
    
    List<QuestionScene> questionScenes;

    public Map createMap(int numOfRows, int numOfColumns, InventoryItem[] items) {
        
        if (numOfRows < 0 || numOfColumns < 0) {
            System.out.println("You need at least 1 row and 1 column to create a new map.");
            return null;
        }
        if (items == null || items.length < 1) {
            System.out.println("Item list needs to have a length of at least 1.");
            return null;
        }
        
        Map map = new Map();
        map.setRowCount(numOfRows);
        map.setColumnCount(numOfColumns);
    
        Location[][] locations = createLocations(10,10);
        map.setLocations(locations);
        
        questionScenes = createQuestionScenes();
        
        assignScenesToLocations(map, questionScenes);
        
        return map;
    }
    
    public static Location[][] createLocations(int rows, int columns) {
        
        if (rows < 1 || columns < 1) {
            return null;
        }
        
        Location[][] locations = new Location[rows][columns];
        
        for (int rowCount = 0; rowCount < rows; rowCount++) {
            for (int colCount = 0; colCount < columns; colCount++) {
               
                Location area = new Location();
                area.setVisited(false);
                
                locations[rowCount][colCount] = area;
            }
        }
        return locations;
    }
    
    public List<QuestionScene> createQuestionScenes() {
        List<QuestionScene> questionScenes = new ArrayList<QuestionScene>();
        questionScenes.add(new QuestionScene(new Question("Find ore question.", "Find ore answer.", 10), "\nStarting scene in Oregon trail.", true, "ST"));
        questionScenes.add(new QuestionScene(new Question("Build ship question.", "Build ship answer.", 10), "\nAngel scene in Oregon trail.", true, "AN"));
        questionScenes.add(new QuestionScene(new Question("Find water question.", "Find water answer.", 10), "\nLumber scene in Oregon trail.", true, "LU"));
        questionScenes.add(new QuestionScene(new Question("Faithful question.", "Faithful answer.", 10), "\nIron scene in Oregon trail.", true, "IR"));
        questionScenes.add(new QuestionScene(new Question("Number of travelers question.", "Number of travelers answer.", 10), "\nRye scene in Oregon trail.", true, "RY"));
        questionScenes.add(new QuestionScene(new Question("Ship done question.", "Ship done answer.", 10), "\nCamp scene in Oregon trail.", true, "CP"));
        questionScenes.add(new QuestionScene(new Question("Find honey question.", "Find honey answer.", 10), "\nInstructions scene in Oregon trail.", true, "IN"));
        questionScenes.add(new QuestionScene(new Question("What is a dog.", "Find a K9 answer.", 10), "\nEnding scene in Oregon Trail.", true, "EN"));
        
        return questionScenes;
    }
        
    private void assignScenesToLocations(Map map, List<QuestionScene> questionScenes) {
        
        for (QuestionScene questionScene : questionScenes) {
            Pair pair = Pair.addPair();
            map.getLocation(pair.getX(),pair.getY()).setScene(questionScene);
        }
    }

    public static class Randomizer {
        private static Random rand = new Random();
        private static int max = 10;
        
        private static int getNextRandom() {
            return rand.nextInt(max);
        }
    }
    
    static List<Pair> pairs = new ArrayList<Pair>();

    public static class Pair implements Serializable {
        private int x;
        private int y;
        
        
        public static Pair addPair() {
            Pair pair = new Pair();
            do {
                pair.x = Randomizer.getNextRandom();
                pair.y = Randomizer.getNextRandom();
            } while (pairs.contains(pair));
            pairs.add(pair);
            return pair;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this != obj) {
                Pair pairObj = (Pair)obj;
                if (!(x == pairObj.x && y == pairObj.y)){
                    return false;
                }
            }
            return true;
        }
        
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
        
        public List<Pair> getPairList() {
            return Collections.unmodifiableList(pairs);
        }
        
        public Pair getIndex(int index) {
            return pairs.get(index);
        }

        public static void clear() {
            pairs.clear();
        }
    }
    
    public List<Pair> getPairs() {
        return pairs;
    }
    
    public List<QuestionScene> getQuestionScenes() {
        return questionScenes;
    }
}
