public class CargoInfo {
    private final int dimensions;
    private final int weight;
    private final String deliveryAdress;
    private final boolean canOverturn;
    private final String regNumber;
    private final boolean isFragile;

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

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
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
