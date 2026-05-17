package vehicle;

/**
 * 車を表すクラス
 * 
 * CarクラスはVehicleクラスを継承する
 * つまり、Vehicleが持っている
 * ・名前
 * ・色
 * ・現在地 x
 * ・速度 velocity
 * ・goメソッド
 * ・backメソッド
 * ・diffメソッド
 * を使うことができる
 */
public class Car extends Vehicle {

    // ガソリン量を管理する変数
    // 初期値は50L
    private int fuel = 50;

    /**
     * コンストラクタ
     * 
     * Carオブジェクトを作るときに、
     * 名前と色を受け取る
     * 
     * super(name, color) は、
     * 親クラスであるVehicleのコンストラクタを呼び出している
     */
    public Car(String name, String color) {
        super(name, color);
    }

    /**
     * ガソリン量を取得するメソッド
     */
    public int getFuel() {
        return this.fuel;
    }

    /**
     * ガソリン量を変更するメソッド
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     * 車の情報を表示するメソッド
     * 
     * super.printData() で、
     * 親クラスVehicleのprintDataメソッドを呼び出す
     * 
     * その後、Car独自の情報であるガソリン量を表示する
     */
    @Override
    public void printData() {
        super.printData();
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    /**
     * 給油するメソッド
     * 
     * 引数 litre に給油する量を受け取る
     */
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