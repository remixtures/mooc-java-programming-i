
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } 
        
        String text = "";
        
        if (elements.size() == 1) {
            for (String message: elements) {
                text = message;
            }
            return "The collection " + this.name + " has 1 element:\n" + text;
        } else {
            for (String message: elements) {
                text = text + message + "\n";
            }
            return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + text;
        }  
    }
    
}
