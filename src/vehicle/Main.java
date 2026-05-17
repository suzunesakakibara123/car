package vehicle;

/**
 * VehicleクラスとCarクラスの動作確認をするクラス
 */
public class Main {

    public static void main(String[] args) {

        // Carインスタンスを作成
        Car car1 = new Car("フェラーリ", "赤");
        Car car2 = new Car("プリウス", "白");

        System.out.println("【車1の情報】");
        car1.printData();
        System.out.println("-----------------");

        System.out.println("【車2の情報】");
        car2.printData();
        System.out.println("-----------------");

        // 車1の速度を設定
        car1.setVelocity(10);

        // 車2の速度を設定
        car2.setVelocity(5);

        // 車1を3時間前に進める
        // x = 0 + 10 × 3 = 30
        car1.go(3);

        // 車2を4時間前に進める
        // x = 0 + 5 × 4 = 20
        car2.go(4);

        System.out.println("【移動後の車1の情報】");
        car1.printData();
        System.out.println("-----------------");

        System.out.println("【移動後の車2の情報】");
        car2.printData();
        System.out.println("-----------------");

        // 車1を1時間後ろに下げる
        // x = 30 - 10 × 1 = 20
        car1.back(1);

        System.out.println("【車1が後ろに下がった後の情報】");
        car1.printData();
        System.out.println("-----------------");

        // 2つの車の現在地の差を計算
        int difference = Vehicle.diff(car1.getX(), car2.getX());

        System.out.println("車1と車2の現在地の差：" + difference);
    }
}