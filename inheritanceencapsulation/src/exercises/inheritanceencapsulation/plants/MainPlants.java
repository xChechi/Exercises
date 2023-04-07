package exercises.inheritanceencapsulation.plants;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPlants {

    public static void main(String[] args) {

        Tree tree1 = new Tree("Oak", true, 12, 10);
        tree1.isFruit();

        Tree tree2 = new Tree("Pine", false, 6, 5);
        tree2.isFruit();
        Tree tree3 = new Tree("Spruce", true, 4, 8);
        tree3.isFruit();

        Flower flower1 = new Flower("Daisy", false, 1, 12);
        flower1.isBlossom();
        Flower flower2 = new Flower("Rose", true, 8, 15);
        flower2.isBlossom();
        Flower flower3 = new Flower("Tulip", true, 5, 9);
        flower3.isBlossom();



        Tree[] trees = {tree1, tree2, tree3};
        Flower[] flowers = {flower1, flower2, flower3};


        for (Tree tree : trees) {
            if (tree.age > 5) {
                tree.setScore(tree.score + 3);
            }
            if (tree.isFruit) {
                tree.setScore(tree.score + 5);
            }
        }

        for (Flower flower : flowers) {
            if (flower.age > 5) {
                flower.setScore(flower.score + 3);
            }
            if (flower.isBlossom) {
                flower.setScore(flower.score + 4);
            }
        }

        Plant[] plants = {tree1, tree2, tree3, flower1, flower2, flower3};

        for (Plant p : plants) {
            System.out.println(p.score);
        }

        int highestScore = Arrays.stream(plants).mapToInt(Plant::getScore).max().orElse(0); // p -> p.getScore() replaced with method reference

        List<Plant> highestScoringPlants = Arrays.stream(plants).filter(p -> p.getScore() == highestScore).collect(Collectors.toList());

        for (Plant p : highestScoringPlants) {
            System.out.println(p.getName() + " has the highest score of " + highestScore);
        }



    }
}
