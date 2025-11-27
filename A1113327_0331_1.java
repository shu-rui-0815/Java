import java.util.*;
class animal{
      String name;
      double height;
      int weight, fast;

      animal(String name, double height, int weight, int fast){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.fast = fast;
      }

      void show(){
        System.out.println("name:"+name+" height:"+height+" weight:"+weight+" fast:"+fast);
      }

      double distance(int time, double a){
        return time*a*fast;
      }

      double distance(int time){
        return time*fast;
      }

      public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
      }
}


class human extends animal{
    String sex;

    human(String name, double height, int weight, int fast, String sex){
        super(name,height,weight,fast);
        this.sex = sex;
    }

    void show(){
        System.out.println("name:"+name+" height:"+height+" weight:"+weight+" fast:"+fast+" sex:"+sex);
    }
}

class snow extends human{
    String skill;

    snow(String name, double height, int weight, int fast, String sex, String skill){
        super(name,height,weight,fast,sex);
        this.skill = skill;
    }

    void show(){
        System.out.println("name:"+name+" height:"+height+" weight:"+weight+" fast:"+fast+" sex:"+sex+" skill:"+skill);
    }

    double distance(int time, double a){
        return time*a*fast*2;
    }

    double distance(int time){
        return time*fast*2;
    }
}

public class A1113327_0331_1 {
    public static void main (String[] argv){
        Scanner sc = new Scanner(System.in);
        animal.showinfo();
        int num1;
        double num2;

        animal frozen1 = new animal("雪寶", 1.1, 52, 100);
        animal frozen2 = new animal("驢子", 1.5, 52, 200);
        animal [] animals = {frozen1,frozen2};
        human frozen3 = new human("阿克", 1.9, 80, 150, "男");
        human frozen4 = new human("漢斯", 1.8, 78, 130, "男");
        human frozen5 = new human("安那", 1.7, 48, 120, "女");
        human [] humanbeing = {frozen3,frozen4,frozen5};
        snow frozen6 = new snow("愛沙", 1.7, 50, 120, "女", "Yes");
        snow [] queen = {frozen6};

        frozen1.show();
        frozen2.show();
        frozen3.show();
        frozen4.show();
        frozen5.show();
        frozen6.show();

        for(int i=0; i<animals.length; i++){
          System.out.print("請輸入兩個數字(x及y),如果沒有y值請打0:");
          num1 = sc.nextInt();
          num2 = sc.nextDouble();
          if(num2<=0){
            System.out.println(animals[i].name+": "+animals[i].distance(num1));
          }
          else{
            System.out.println(animals[i].name+": "+animals[i].distance(num1,num2));
          }
        }  

        for(int i=0; i<humanbeing.length; i++){
          System.out.print("請輸入兩個數字(x及y),如果沒有y值請打0:");
          num1 = sc.nextInt();
          num2 = sc.nextDouble();
          if(num2<=0){
            System.out.println(humanbeing[i].name+": "+humanbeing[i].distance(num1));
          }
          else{
            System.out.println(humanbeing[i].name+": "+humanbeing[i].distance(num1,num2));
          }
        }
        for(int i=0; i<queen.length; i++){
          System.out.print("請輸入兩個數字(x及y),如果沒有y值請打0:");
          num1 = sc.nextInt();
          num2 = sc.nextDouble();
          if(num2<=0){
            System.out.println(queen[i].name+": "+queen[i].distance(num1));
          }
          else{
            System.out.println(queen[i].name+": "+queen[i].distance(num1,num2));
          }

        }
    }
}        

