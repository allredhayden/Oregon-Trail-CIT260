package byui.cit260.oregontrail.control;

import byui.cit260.oregontrail.model.InventoryItem;
import byui.cit260.oregontrail.model.Location;
import byui.cit260.oregontrail.model.Map;
import byui.cit260.oregontrail.model.Question;
import byui.cit260.oregontrail.model.Scene;
import byui.cit260.oregontrail.model.SceneType;
import byui.cit260.oregontrail.model.QuestionType;
import byui.cit260.oregontrail.model.QuestionScene;

public class MapControl {
        
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
        
        Scene[] scenes = createScenes();
        Question[] questions = createQuestions();
        
        assignQuestionsToScenes(questions, scenes);
        assignItemsToScenes(items, scenes);
        assignScenesToLocations(map, scenes);
        
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
        
        System.out.println("\ncreateLocations stub function called.");
        return locations;
    }
    
    private static Scene[] createScenes() {
        
        Scene[] regScene = new Scene[] { new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene(), new Scene() };
        
        
        Scene scene1 = regScene[0];
        scene1.setDescription("\nStarting scene in Oregon trail.");
        scene1.setBlocked(true);
        scene1.setSymbol("ST");

        Scene scene2 = regScene[1];
        scene2.setDescription("\nAngel scene in Oregon trail.");
        scene2.setBlocked(true);
        scene2.setSymbol("AN");

        Scene scene3 = regScene[SceneType.lumber.ordinal()];
        scene3.setDescription("\nLumber scene in Oregon trail.");
        scene3.setBlocked(true);
        scene3.setSymbol("LU");

        Scene scene4 = regScene[SceneType.iron.ordinal()];
        scene4.setDescription("\nIron scene in Oregon trail.");
        scene4.setBlocked(true);
        scene4.setSymbol("IR");

        Scene scene5 = regScene[SceneType.rye.ordinal()];
        scene5.setDescription("\nRye scene in Oregon trail.");
        scene5.setBlocked(true);
        scene5.setSymbol("RY");

        Scene scene6 = regScene[SceneType.camp.ordinal()];
        scene6.setDescription("\nCamp scene in Oregon trail.");
        scene6.setBlocked(true);
        scene6.setSymbol("CP");

        Scene scene7 = regScene[SceneType.instructions.ordinal()];
        scene7.setDescription("\nInstructions scene in Oregon trail.");
        scene7.setBlocked(true);
        scene7.setSymbol("IN");
        
        Scene scene8 = regScene[SceneType.forest.ordinal()];
        scene8.setDescription("\nThe area before you is a vast, dense forest that is suspiciously silent."
                + " There seems to be no clear way of going around it. It would seem as if you must go through it.");
        scene8.setBlocked(true);
        scene8.setSymbol("FR");
        
        Scene scene9 = regScene[SceneType.lake.ordinal()];
        scene9.setDescription("\nA large, calm lake is between you and your destination."
                + " Fortunately, it looks safe to cross - and better yet, there's a healthy population of fish inhabiting it.");
        scene9.setBlocked(false);
        scene9.setSymbol("LK");
        
        Scene scene10 = regScene[SceneType.river.ordinal()];
        scene10.setDescription("\nTo what is likely your disappointment, a deadly looking river seems to be obstructing your path."
                + " For the moment, luck does not seem to be on your side, as there is no visible alternative to crossing it.");
        scene10.setBlocked(true);
        scene10.setSymbol("RI");
        
        Scene scene11 = regScene[SceneType.mountain.ordinal()];
        scene11.setDescription("\nJagged, towering mountains cover the majority of the surrounding area."
                + " There unfortunately seems to be no option except to travel through them."
                + " This will undoubtedly be a very physically demanding trek. Wagons don't tend to fair too well in a path uphill.");
        scene11.setBlocked(true);
        scene11.setSymbol("MT");
        
        Scene scene12 = regScene[SceneType.village.ordinal()];
        scene12.setDescription("\nHome sweet home: At least for a while."
                + " You've encountered a village, one that for the moment seems to have no visible name."
                + " Fortunately, it looks comfy enough. The town is bustling with activity, and there is a large"
                + " quantity of villagers traveling throughout a rather plentiful market in the main square."
                + " Surely, this is a safe place to stop and rest, and perhaps even shop.");
        scene12.setBlocked(false);
        scene12.setSymbol("VL");

        Scene scene13 = regScene[SceneType.finish.ordinal()];
        scene13.setDescription("\nEnding scene in Oregon Trail.");
        scene13.setBlocked(true);
        scene13.setSymbol("EN");    
        
        System.out.println("\ncreateScenes function called successfully.");
        
        return regScene;
    }
    
    private static Question[] createQuestions() {
        Question[] questions = new Question[7];
        
        Question question1 = new Question();
        question1.setQuestion("Find ore question.");
        question1.setAnswer("Find ore answer.");
        question1.setPoints(10);
        question1 = questions[QuestionType.findOre.ordinal()];
        
        Question question2 = new Question();
        question2.setQuestion("Build ship question.");
        question2.setAnswer("Build ship answer.");
        question2.setPoints(10);
        question2 = questions[QuestionType.buildShip.ordinal()];

        Question question3 = new Question();
        question3.setQuestion("Find water question.");
        question3.setAnswer("Find water answer.");
        question3.setPoints(10);
        question3 = questions[QuestionType.findWater.ordinal()];

        Question question4 = new Question();
        question4.setQuestion("Faithful question.");
        question4.setAnswer("Faithful answer.");
        question4.setPoints(10);
        question4 = questions[QuestionType.faithful.ordinal()];

        Question question5 = new Question();
        question5.setQuestion("Number of travelers question.");
        question5.setAnswer("Number of travelers answer.");
        question5.setPoints(10);
        question5 = questions[QuestionType.numOfTravelers.ordinal()];

        Question question6 = new Question();
        question6.setQuestion("Ship done question.");
        question6.setAnswer("Ship done answer.");
        question6.setPoints(10);
        question6 = questions[QuestionType.shipDone.ordinal()];

        Question question7 = new Question();
        question7.setQuestion("Find honey question.");
        question7.setAnswer("Find honey answer.");
        question7.setPoints(10);
        question7 = questions[QuestionType.findHoney.ordinal()];     
        
        
        System.out.println("\ncreateQuestions function called successfully.");
        return questions;
    }
    
    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        
     /* QuestionScene startScene = (QuestionScene) scenes[SceneType.start.ordinal()];
        QuestionScene angelScene = (QuestionScene) scenes[SceneType.angel.ordinal()];
        QuestionScene lumberScene = (QuestionScene) scenes[SceneType.lumber.ordinal()];
        QuestionScene ironScene = (QuestionScene) scenes[SceneType.iron.ordinal()];
        QuestionScene ryeScene = (QuestionScene) scenes[SceneType.rye.ordinal()];
        QuestionScene campScene = (QuestionScene) scenes[SceneType.camp.ordinal()];
        QuestionScene instructionsScene = (QuestionScene) scenes[SceneType.instructions.ordinal()];
        QuestionScene forestScene = (QuestionScene) scenes[SceneType.forest.ordinal()];
        QuestionScene lakeScene = (QuestionScene) scenes[SceneType.lake.ordinal()];
        QuestionScene riverScene = (QuestionScene) scenes[SceneType.river.ordinal()];
        QuestionScene mountainScene = (QuestionScene) scenes[SceneType.mountain.ordinal()];
        QuestionScene villageScene = (QuestionScene) scenes[SceneType.village.ordinal()];
        QuestionScene finishScene = (QuestionScene) scenes[SceneType.finish.ordinal()];
        
        Question[] questionsInScene = new Question[7];
        
        questionsInScene[0] = questions[0];
        questionsInScene[1] = questions[1];
        questionsInScene[2] = questions[2];
        questionsInScene[3] = questions[3];
        questionsInScene[4] = questions[4];
        questionsInScene[5] = questions[5];
        questionsInScene[6] = questions[6];
        
        startScene.setQuestion(questionsInScene[0]);
        angelScene.setQuestion(questionsInScene[1]);
        lumberScene.setQuestion(questionsInScene[2]);
        ironScene.setQuestion(questionsInScene[3]);
        ryeScene.setQuestion(questionsInScene[4]);
        campScene.setQuestion(questionsInScene[5]);
        instructionsScene.setQuestion(questionsInScene[6]);
        forestScene.setQuestion(questionsInScene[0]);
        lakeScene.setQuestion(questionsInScene[1]);
        riverScene.setQuestion(questionsInScene[2]);
        mountainScene.setQuestion(questionsInScene[3]);
        villageScene.setQuestion(questionsInScene[4]);
        finishScene.setQuestion(questionsInScene[5]); */
     
        System.out.println("\nassignQuestionsToScenes function called successfully.");
    }
    
    private static void assignItemsToScenes(InventoryItem[] questions, Scene[] scenes) {
        System.out.println("\nassignItemsToScenes function called successfully.");
    }
    
    private void assignScenesToLocations(Map map, Scene[] scenes) {
        
        Location[][] sceneLocations = map.getLocations();
        
        sceneLocations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        sceneLocations[0][1].setScene(scenes[SceneType.angel.ordinal()]);
        sceneLocations[0][2].setScene(scenes[SceneType.lumber.ordinal()]);
        sceneLocations[0][3].setScene(scenes[SceneType.iron.ordinal()]);
        sceneLocations[0][4].setScene(scenes[SceneType.rye.ordinal()]);
        sceneLocations[0][5].setScene(scenes[SceneType.camp.ordinal()]);
        sceneLocations[0][6].setScene(scenes[SceneType.instructions.ordinal()]);
        sceneLocations[0][7].setScene(scenes[SceneType.forest.ordinal()]);
        sceneLocations[0][8].setScene(scenes[SceneType.lake.ordinal()]);
        sceneLocations[0][9].setScene(scenes[SceneType.river.ordinal()]);
        sceneLocations[1][0].setScene(scenes[SceneType.mountain.ordinal()]);
        sceneLocations[2][0].setScene(scenes[SceneType.village.ordinal()]);
        sceneLocations[3][0].setScene(scenes[SceneType.finish.ordinal()]);
        
        System.out.println("\nassignScenesToLocations function called successfully.");
    }
}
