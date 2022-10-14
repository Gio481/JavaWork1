import java.util.*;

public class Main {
    public static void main(String[] args) {
        printTasks();
    }

    private static void printTasks() {
        System.out.println(getSolvedQuadraticEquation(4, 5, 6));
        System.out.println(getSolvedQuadraticEquation(0, 3, 10));
        String[] strings = {"c", "c++", "c#"};
        System.out.println(getShortestString(strings));
    }

    //1
    private static String getSolvedQuadraticEquation(int a, int b, int c) {
        if (a != 0) return getTextWithTwoRoots(a, b, c);
        else return getTextWithOneRoot(b, c);
    }

    private static int getDiscriminate(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    private static HashMap<String, Double> getDiscriminateRoots(int a, int b, int c) {
        HashMap<String, Double> roots = new HashMap<>();
        double x1 = (-b - Math.sqrt(getDiscriminate(a, b, c))) / (2 * a);
        double x2 = (-b + Math.sqrt(getDiscriminate(a, b, c))) / (2 * a);
        roots.put("x1", x1);
        roots.put("x2", x2);
        return roots;
    }

    private static String getTextWithOneRoot(double b, double c) {
        return "განტოლებას აქვს ერთი ფესვი " + -c / b;
    }

    private static String getTextWithTwoRoots(int a, int b, int c) {
        if (getDiscriminate(a, b, c) >= 0) {
            Double x1 = getDiscriminateRoots(a, b, c).get("x1");
            Double x2 = getDiscriminateRoots(a, b, c).get("x2");
            return "x1 ფესვია " + x1 + " x2 ფესვია " + x2;
        }
        return "დისკრიმინატი უარყოფითია და ფესვი არ ამოდის";
    }

    //2
    static String getShortestString(String[] words) {
        return "ყველაზე პატარა სტრინგია " + Arrays.stream(words).min(Comparator.comparing(String::length)).get();
    }
}