import OpenStates.OpenStatesAPI;

public class Main {

    public static void main(String[] args) {
        OpenStatesAPI s = new OpenStatesAPI();
        s.legislator("mo");
        s.legislatorDetail(1234);
    }
}
