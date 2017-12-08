package byui.cit260.oregontrail.view;

public class AboutAuthorsView extends View {
    
    static enum authors {
        Jeremy_Alkire, Blair_Furner, Hayden_Allred, Allen_Relthford
    }

    public AboutAuthorsView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n|              About Us                |"
              + "\n-----------------------------------------"
              + "\nJ - " + authors.Jeremy_Alkire
              + "\nB - " + authors.Blair_Furner
              + "\nH - " + authors.Hayden_Allred
              + "\nA - " + authors.Allen_Relthford
              + "\nZ - Quit"
              + "\n-----------------------------------------");
        super.display();
    }

    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();

        switch (choice)
        {
        case "J":
            this.console.print("\nHello, my name is Jeremy Alkire, and I'm pursuing a degree in CIT.\n");
            break;
        case "B":
            this.console.println("\nHi, my name is Blair Furner and I simply love long walks on beaches and stallions. I really love stallions.");
            break;
        case "H":
            this.console.println("\nHowdy folks! My name is Hayden Alred and I love to cattle wrangle and cow poke.");
            break;
        case "A":
            this.console.println("\nHello everybody! I'm Allen Relthford and I like to color outside the lines. I love gaming and movies.");
            break;
        case "Z":
            new MainMenuView();
            break;
        default:
            this.console.println("\nInvalid selection. Please try again");
        }
        return false;
    }
}
