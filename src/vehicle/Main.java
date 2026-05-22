package vehicle;

import java.util.Scanner;

/**
 * VehicleクラスとCarクラスの動作確認をするクラス
 */
public class Main {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Carインスタンスを作成
        Car car1 = new Car("フェラーリ", "赤");
        Car car2 = new Car("プリウス", "白");

        System.out.println("【車1の情報】");
        car1.printData();
        System.out.println("-----------------");

        System.out.println("【車2の情報】");
        car2.printData();
        System.out.println("-----------------");
        
        //車1の速度
        System.out.println("車1の速度を入力してください。(km/h）：");
        int velocity1 = scanner.nextInt();
        car1.setVelocity(velocity1);
        
        // 車2の速度
        System.out.println("車2の速度を入力してください。(km/h）：");
        int velocity2 = scanner.nextInt();
        car2.setVelocity(velocity2);

        // 車1が進む時間
        System.out.println("車1が動く時間を入力してください。(時間）：");
        int time1 = scanner.nextInt();
        car1.go(time1);

		 // 車2が進む時間
        System.out.println("車2が動く時間を入力してください。(時間）：");
        int time2 = scanner.nextInt();
        car2.go(time2);
        
        //車1が戻る時間
        System.out.println("車1が戻る時間を入力してください。(時間）：");
        int backTime1 = scanner.nextInt();
        car1.back(backTime1);
        
   	    // 車2が戻る時間
        System.out.println("車2が戻る時間を入力してください。(時間）：");
        int backTime2 = scanner.nextInt();
        car2.back(backTime2);

        System.out.println("【移動後の車1の情報】");
        car1.printData();
        System.out.println("-----------------");

        System.out.println("【移動後の車2の情報】");
        car2.printData();
        System.out.println("-----------------");
        

        System.out.println("【車1と車2の差】");
        System.out.println("-----------------");

        // 2つの車の現在地の差を計算
        int difference = Vehicle.diff(car1.getX(), car2.getX());

        System.out.println("車1と車2の現在地の差：" + difference);
        
        scanner.close();
    }
}