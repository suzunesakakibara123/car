# car
carクラスの追加実装

<img width="720" height="510" alt="image" src="https://github.com/user-attachments/assets/9169a94e-20c7-43db-bfbd-5224d469b9ff" />


-要件-
・vehicleクラスに、現在地を管理する変数xを追加すること(初期値は0)
・vehicleクラスに、速度を管理する変数velocityを追加すること(初期値は0)
・runメソッドの削除と新しいメソッドの追加すること
   1.goメソッド
      ┗引数timeを入力とし、速度を表すvelocityとtimeを使用して、xを増減させる
   2.backメソッド
      ┗引数timeを入力とし、速度を表すvelocityとtimeを使用して、xを減少させる
   3.現在地の差を計算する機能を実装
       ┗二つのvehicleのxの差を出力するdiff(x1,x2)を作成する
・JUnitを用いて、クラスのテストを行う。


ー自分メモー
・.jar は、Java ARchiveの略。Javaのプログラムや部品を1つにまとめたファイルのこと。
