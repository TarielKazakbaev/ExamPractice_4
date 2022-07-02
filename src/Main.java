import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Me me = new Me();
        Samsung samsung = new Samsung();
        LeftPack leftPack = new LeftPack();
        leftPack.leftPacks[0]=samsung;
        Som som = new Som();
        RightPack rightPack = new RightPack();
        rightPack.rightPacks[0]=som;
        me.mes[0]= leftPack;
        me.mes[1]= rightPack;

        System.out.println("1) Посмотреть левый карман \n2) Посмотреть правый карман \n" +
                "3) Посмотреть оба кармана");
        int look = scan.nextInt();
        switch (look){
            case 1:
                System.out.println(me.mes[0]);
                break;
            case 2:
                System.out.println(me.mes[1]);
                break;
            case 3:
                System.out.println(me);
                break;
            default:
                System.out.println("Имеется только 2 кармана");
        }
    }
}
