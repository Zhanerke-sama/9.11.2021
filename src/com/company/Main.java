import java.util.Scanner;

public class Triangle {
    public int a,b,c, d, P;
    public String Tip;

    public Triangle(int a, int b, int c ,int d, String Tip) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.Tip = Tip;
    }
    public void Perimemr() {
        this.P = this.a + this.b + this.c + this.d;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle []tr = new Triangle[10];
        int []minS = new int[4];
        int []maxS = new int[4];
        //     "Квадрат", "Прямоугольник", "Ромб", "Произвольный"
        tr[0]= new Triangle(4, 4, 5,4,"Ромб");
        tr[1]= new Triangle(3, 3, 5,8,"Прямоугольник");
        tr[2]= new Triangle(6, 6, 6,6,"Квадрат");
        tr[3]= new Triangle(6, 1, 9,6, "Произвольный");
        tr[4]= new Triangle(8, 1, 4,1,"Ромб");
        tr[5]= new Triangle(11, 11, 11, 11,"Квадрат");
        tr[6]= new Triangle(3, 3, 1, 5, "Прямоугольник");
        tr[7]= new Triangle(6, 6, 2, 3,"Произвольный");
        tr[8]= new Triangle(8, 8, 1, 9, "Прямоугольник");
        tr[9]= new Triangle(7, 7, 7, 7,"Квадрат");
        for(int i = 0; i < 4; i++){
            minS[i] = 999;
            maxS[i] = -999;
        }

        for(int i = 0; i < 10; i++){
            tr[i].Perimemr();
        }
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Квадрат") ){
                if(tr[i].P < minS[0])
                    minS[0] = tr[i].P;
                if(tr[i].P > maxS[0])
                    maxS[0] = tr[i].P;
            }
            if(tr[i].Tip.equals("Прямоугольник")){
                if(tr[i].P < minS[1])
                    minS[1] = tr[i].P;
                if(tr[i].P > maxS[1])
                    maxS[1] = tr[i].P;
            }
            if(tr[i].Tip.equals("Ромб")){
                if(tr[i].P < minS[2])
                    minS[2] = tr[i].P;
                if(tr[i].P > maxS[2])
                    maxS[2] = tr[i].P;
            }
            if(tr[i].Tip.equals("Произвольный")){
                if(tr[i].P < minS[3])
                    minS[3] = tr[i].P;
                if(tr[i].P > maxS[3])
                    maxS[3] = tr[i].P;
            }
        }
        System.out.println("Квадратные четыреугольники: ");
        System.out.println("a" + "\t" + "b" + "\t" + "c" + "\t" + "P");
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Квадрат") )
                System.out.println(tr[i].a + "\t" + tr[i].b + "\t" + tr[i].c + "\t" + tr[i].P);
        }
        System.out.println("Max: "+maxS[0]);
        System.out.println("Min:" + minS[0]);
        System.out.println("Прямоугольные четыреугольники: ");
        System.out.println("a" + "\t" + "b" + "\t" + "c" + "\t" + "P");
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Прямоугольник") )
                System.out.println(tr[i].a + "\t" + tr[i].b + "\t" + tr[i].c + "\t" + tr[i].P);
        }System.out.println("Max: "+maxS[1]);
        System.out.println("Min:" + minS[1]);
        System.out.println("Ромбы: ");
        System.out.println("a" + "\t" + "b" + "\t" + "c" + "\t" + "P");
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Ромб") )
                System.out.println(tr[i].a + "\t" + tr[i].b + "\t" + tr[i].c + "\t" + tr[i].P);
        }System.out.println("Max: "+maxS[2]);
        System.out.println("Min:" + minS[2]);
        System.out.println("Произвольные четыреугольники: ");
        System.out.println("a" + "\t" + "b" + "\t" + "c" + "\t" + "P");
        for(int i = 0; i < 10; i++){
            if(tr[i].Tip.equals("Произвольный") )
                System.out.println(tr[i].a + "\t" + tr[i].b + "\t" + tr[i].c + "\t" + tr[i].P);
        }
        System.out.println("Max: "+maxS[3]);
        System.out.println("Min:" + minS[3]);
    }
}
