package vehicle;

import java.util.Scanner;

/**
 * VehicleクラスとCarクラスの動作確認をするクラス
 */
public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Carインスタンスを作成
        Car car1 = new Car("フェラーリ", "赤" , 50);
        Car car2 = new Car("プリウス", "白", 30);

        System.out.println("【車1の情報】");
        car1.printData();
        System.out.println("-----------------");

        System.out.println("【車2の情報】");
        car2.printData();
        System.out.println("-----------------");

        // 車1が進む時間
        System.out.println("車1が動く時間を入力してください。(時間）：");
        int time1 = scanner.nextInt();
        car1.go(time1);

		 // 車2が進む時間
        System.out.println("車2が動く時間を入力してください。(時間）：");
        int time2 = scanner.nextInt();
        car2.go(time2);

        System.out.println("【移動後の車1の情報】");
        car1.printData();
        System.out.println("-----------------");

        System.out.println("【移動後の車2の情報】");
        car2.printData();
        System.out.println("-----------------");

        // 車1を後ろに下げる
        car1.back(time1);
        
        // 車2を後ろに下げる
        car2.back(time2);

        System.out.println("【車1と車2の差】");
        car1.printData();
        System.out.println("-----------------");

        // 2つの車の現在地の差を計算
        int difference = Vehicle.diff(car1.getX(), car2.getX());

        System.out.println("車1と車2の現在地の差：" + difference);
    }
}