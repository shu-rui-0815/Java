import java.util.*;

class animal {
    String name;
    double height;
    int weight,fast;

    void show(){
        System.out.println("姓名:"+name+"  身高:"+height+"  體重:"+weight+"  速度:"+fast);
    }

    double distance(int time, double a){
        double z;
        z=time*a*this.fast;
        return z;
    }

    int distance(int time){
        int z;
        z=time*fast;
        return z;
    } 

}


public class A1113327_0324_1{
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);

        
        
        System.out.println("請輸入兩個值");
        

        animal frozen1 = new animal();
        animal frozen2 = new animal();
        animal frozen3 = new animal();
        animal frozen4 = new animal();
        animal[] frozen = {frozen1,frozen2,frozen3,frozen4};

        frozen1.name = "雪寶";
        frozen1.height = 1.1;
        frozen1.weight = 52;
        frozen1.fast = 100;
        frozen1.show();

        frozen2.name = "驢子";
        frozen2.height = 1.5;
        frozen2.weight = 99;
        frozen2.fast = 200;
        frozen2.show();

        frozen3.name = "安那";
        frozen3.height = 1.7;
        frozen3.weight = 48;
        frozen3.fast = 120;
        frozen3.show();

        frozen4.name = "愛沙";
        frozen4.height = 1.7;
        frozen4.weight = 50;
        frozen4.fast = 120;
        frozen4.show();

        for(int count=0;count<4;count++){
            System.out.print("請輸入x和y: ");
            int num1 = sc.nextInt();
            double num2 = sc.nextDouble();
            if(num2<=0){
                int dis=frozen[count].distance(num1);
                System.out.println(frozen[count].name+":"+dis);
            }
            else{
                double dis = frozen[count].distance(num1 ,num2);
                System.out.println(frozen[count].name+":"+ dis);
            }
        }
        
    }
}

