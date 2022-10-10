public class Magazine implements Printable {
    String name;
    Magazine(String name){
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
    static public void printMagazines(Printable[] printables){
        for (int i=0;i< printables.length;i++){
            if (printables[i] instanceof Magazine){
                System.out.println(printables[i]);
            }
        }
    }
}
