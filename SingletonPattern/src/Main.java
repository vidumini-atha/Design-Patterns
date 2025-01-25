public class Main {
    public static void main(String[] args) {

        //SingleObject object = new SingleObject();
        //This gives an compile time error.

        //Can only get the available object.
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}