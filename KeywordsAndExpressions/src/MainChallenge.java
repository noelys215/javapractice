public class MainChallenge {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();

        /*
        kitchen.getDishWasher().setHasWorkToDo(true);
        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();
        */
    }
}
