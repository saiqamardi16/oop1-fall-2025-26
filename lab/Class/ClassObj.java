package lab.Class;

import lab.UIControl;

 public class ClassObj extends UIControl {
    public String text; // Field

    public ClassObj() {
        super(true);
        System.out.println("ClassObject"); // Constructors
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) { // Method
        this.text = text;
    }

    public void clearText() { // Method
        this.text = "";
    }
}

    

