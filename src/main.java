public class main {
    public static void main(String[] args) {
        Cricle cricle1 = new Cricle();
        display(cricle1);

        Cricle cricle2 = new Cricle(2.0);
        display(cricle2);

        Cricle cricle3 = new Cricle(3.0 , "black");
        display(cricle3);

        Cricle cricle4 = new Cricle();
        cricle4.setRadius(2.0);
        cricle4.setColor("Green");
        display(cricle4);
    }

    public static void display(Cricle cricle) {
        System.out.println(cricle.toString());
        System.out.println("Aren: " + cricle.getArea());
        System.out.println();
    }


}
