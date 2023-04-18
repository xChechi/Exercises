package exercises.polymorphismabstraction.bakeries;

public class MainBakeries {

    public static void main(String[] args) {

        Bread bread = new Bread(500,2,300,20, 100);
        Cookies cookies = new Cookies(500,2,300,150);
        Banitza banitza = new Banitza(500,2,300,4,500);

        bread.baking();
        cookies.baking();
        banitza.baking();
        System.out.println("-------------------");
        bread.garlicBaking();
        cookies.garlicBaking();
        banitza.garlicBaking();
    }

}
