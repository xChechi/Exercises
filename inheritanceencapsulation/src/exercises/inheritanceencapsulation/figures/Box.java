package exercises.inheritanceencapsulation.figures;

public class Box {

    int height;
    int width;
    int length;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void printBox() {
        int surface;
        if (height > 0 && width > 0 && length > 0) {
            surface = 2*(width*height + width*length + height*length);
            if (height == width) {
                System.out.printf("This box is a cube and has surface area = %d%n", surface);
            } else System.out.printf("This box is a parallelepiped and has surface area = %d%n", surface);

        } else System.out.println("Invalid properties");

    }
}
