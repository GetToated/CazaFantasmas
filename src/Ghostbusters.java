
public class Ghostbusters {

    public static String ghostBusters(String building) {
        String contador = "";
        if (building != null && building.contains(" ")) {
            building = building.replace(" ", "");
            return building;

        }else

            return "You just wanted my autograph didn't you?";
    }
    public static void main(String[] args) {
        String building = "Sky Cra per";
        System.out.println(ghostBusters((building)));
    }
}