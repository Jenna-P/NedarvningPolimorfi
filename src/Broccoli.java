public class Broccoli extends Grønsag implements Freezer, RoomTemperature {
    String name = "Øko Broccoli";
    String pakageName = "freezed Broccoli";

    @Override
    public void freezing(String f) {
        System.out.println(f);
    }

    @Override
    public void storeRoomTemperature() {
        System.out.println("Står på reol i grønsager afdeling");

    }


}
