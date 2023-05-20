package leetcode.easy.solved;

class ParkingSystem {
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if(carType == 1){
            big--;
            return big >= 0;
        }else if(carType == 2){
            medium--;
            return medium >= 0;
        }else{
            small--;
            return small >= 0;
        }

    }
}

public class easy1630 {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
        System.out.println(parkingSystem.addCar(1));
    }
}
