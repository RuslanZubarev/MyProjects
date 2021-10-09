public class CargoInfo {
    private final int dimensions;
    private final int weight;
    private final String deliveryAdress;
    private final boolean canOverturn;
    private final String regNumber;
    private final boolean isFragile;

    public CargoInfo(){
        dimensions = 10;
        weight = 15;
        deliveryAdress = "N/A";
        canOverturn = true;
        regNumber = "AAA001";
        isFragile = false;
    }

    public CargoInfo(int dimensions, int weight, String deliveryAdress, boolean canOverturn,
                     String regNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAdress = deliveryAdress;
        this.canOverturn = canOverturn;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
    }

    public int getDimensions() {
        return dimensions;
    }

    public CargoInfo setDimensions(int dimensions) {
        return  new CargoInfo(dimensions, weight, deliveryAdress, canOverturn, regNumber, isFragile);
    }

    public int getWeight() {
        return weight;
    }

    public CargoInfo setWeight(int weight) {
        return  new CargoInfo(dimensions, weight, deliveryAdress, canOverturn, regNumber, isFragile);
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public CargoInfo setDeliveryAdress(String deliveryAdress) {
        return  new CargoInfo(dimensions, weight, deliveryAdress, canOverturn, regNumber, isFragile);
    }

    public boolean isCanOverturn() {
        return canOverturn;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return isFragile;
    }
}
