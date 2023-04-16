package exercises.inheritanceencapsulation.figures;

public class Box {

    private int height;
    private int width;
    private int length;


    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void printBox() {
        int surface;
        if (height > 0 && width > 0 && length > 0) {
            surface = 2*(width*height + width*length + height*length);
            if (height == width && length == width) {
                System.out.printf("This box is a cube and has surface area = %d%n", surface);
            } else System.out.printf("This box is a parallelepiped and has surface area = %d%n", surface);

        } else System.out.println("Invalid properties");

    }
}
