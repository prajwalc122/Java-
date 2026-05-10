class Demos1{

    // finalize() method
    // This method is called before object destruction
    protected void finalize() {
        System.out.println("Finalize method called");
    }

    public static void main(String[] args) {

        // Creating object
        Demo d1 = new Demo();

        // Removing reference to object
        d1 = null;

        // Requesting Garbage Collector
        System.gc();

        System.out.println("Main method ended");
    }
}