public class Book implements Printable {
    String name;
    Book(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return name;
    }

    static public void printBooks(Printable[] printables){
        for (int i=0;i< printables.length;i++){
            if (printables[i] instanceof Book){
                System.out.println(printables[i]);
            }
        }
    }
}
