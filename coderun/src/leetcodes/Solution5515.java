package leetcodes;

public class Solution5515 {
    class ParkingSystem {
        int big,medium,small;


        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            switch (carType){
                case 1: big--;return big>0 ?true:false;
                case 2:medium--;return medium>0?true:false;
                case 3:small--;return small>0?true:false;
            }

            return false;
        }
    }

}
