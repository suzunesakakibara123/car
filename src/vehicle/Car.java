package vehicle;

public class Car extends Vehicle {

    private int fuel = 50;

    public Car(String name, String color) {
        super(name, color);
    }

    /**ガソリン量を取得する*/
    public int getFuel() {
        return this.fuel;
    }

    /**ガソリン量を変更する*/
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**車の情報を表示する*/
    @Override
    public void printData() {
    	/**Vehicleクラスのメソッドを呼び出す*/
        super.printData();
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    /**給油時のメソッド*/
    public void charge(int litre) {
        System.out.println(litre + "L給油します");

        // 0以下の場合は給油できない
        if (litre <= 0) {
            System.out.println("給油できません");

        // 給油後に100L以上になる場合は、100Lで満タンにする
        } else if (litre + this.fuel >= 100) {
            System.out.println("満タンまで給油します");
            this.fuel = 100;

        // それ以外の場合は、指定された量だけ給油する
        } else {
            this.fuel += litre;
        }

        System.out.println("ガソリン量：" + this.fuel + "L");
    }
}