package vehicle;

public abstract class Vehicle {

    /** 乗り物の名前*/
    private String name;

    /** 乗り物の色*/
    private String color;

    /** 現在地の初期値は0*/
    protected int x = 0;

    /** 速度を管理の初期値は0*/
    protected int velocity = 0;

    public Vehicle(String name, String color, int velocity) {
        this.name = name;
        this.color = color;
        this.velocity = velocity;
    }

    /**名前を取得する*/
    public String getName() {
        return this.name;
    }

    /**色を取得する*/
    public String getColor() {
        return this.color;
    }

    /**現在地 x を取得する*/
    public int getX() {
        return this.x;
    }

    /**速度 velocity を取得する*/
    public int getVelocity() {
        return this.velocity;
    }

    /**名前を変更する*/
    public void setName(String name) {
        this.name = name;
    }

    /**色を変更するメソッド*/
    public void setColor(String color) {
        this.color = color;
    }

    /*goメソッド*/
    /**速度と時間を掛け合わせた分だけ現在地xの値を増加させる*/
    public void go(int time) {
        this.x += this.velocity * time;
    }

     /*backメソッド*/
    /**速度と時間を掛け合わせた分だけ現在地 x を減らす*/
    public void back(int time) {
        this.x -= this.velocity * time;
    }

    /**現在地の差を計算する機能*/
    public static int diff(int x1, int x2) {
        return Math.abs(x1 - x2);
    }

    /**乗り物の情報を表示する*/
    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("現在地：" + this.x);
        System.out.println("速度：" + this.velocity + "km/h");
    }
}