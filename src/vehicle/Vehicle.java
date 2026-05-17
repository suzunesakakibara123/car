package vehicle;

/**
 * 乗り物を表す親クラス
 * 
 * Vehicleクラスでは、
 * ・名前
 * ・色
 * ・現在地 x
 * ・速度 velocity
 * を管理する
 */
public abstract class Vehicle {

    // 乗り物の名前
    private String name;

    // 乗り物の色
    private String color;

    // 現在地を管理する変数
    // 初期値は0
    protected int x = 0;

    // 速度を管理する変数
    // 初期値は0
    protected int velocity = 0;

    /**
     * コンストラクタ
     * Vehicleオブジェクトを作るときに、名前と色を受け取る
     */
    public Vehicle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    /**
     * 名前を取得するメソッド
     */
    public String getName() {
        return this.name;
    }

    /**
     * 色を取得するメソッド
     */
    public String getColor() {
        return this.color;
    }

    /**
     * 現在地 x を取得するメソッド
     */
    public int getX() {
        return this.x;
    }

    /**
     * 速度 velocity を取得するメソッド
     */
    public int getVelocity() {
        return this.velocity;
    }

    /**
     * 名前を変更するメソッド
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 色を変更するメソッド
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 速度を変更するメソッド
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    /**
     * 前に進むメソッド
     * 
     * 引数 time に時間を受け取り、
     * 速度 velocity × 時間 time の分だけ現在地 x を増やす
     * 
     * 例：
     * velocity = 10
     * time = 3
     * の場合、x は30増える
     */
    public void go(int time) {
        this.x += this.velocity * time;
    }

    /**
     * 後ろに下がるメソッド
     * 
     * 引数 time に時間を受け取り、
     * 速度 velocity × 時間 time の分だけ現在地 x を減らす
     * 
     * 例：
     * velocity = 10
     * time = 2
     * の場合、x は20減る
     */
    public void back(int time) {
        this.x -= this.velocity * time;
    }

    /**
     * 2つの現在地の差を計算するメソッド
     * 
     * static を付けているので、
     * Vehicle.diff(10, 30)
     * のように呼び出せる
     * 
     * Math.abs は、マイナスをプラスに変えるメソッド
     */
    public static int diff(int x1, int x2) {
        return Math.abs(x1 - x2);
    }

    /**
     * 乗り物の情報を表示するメソッド
     */
    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("現在地：" + this.x);
        System.out.println("速度：" + this.velocity);
    }
}