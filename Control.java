public class Control {
    public static void main(String[] args)
    {
        int i=10;

        //---control statements---
        //if
        if(i==10)
            System.out.println("i = "+i);


        //if-else
        if(i>15)
            System.out.println("i greater than 15");
        else
            System.out.println("i not greater than 15");


        //nested-if
        if(i>5)
        {
            if(i>9)
                System.out.println("i greater than 5 and 9");
        }


        //if-else-if
        if(i<5)
            System.out.println("i not greater than 5");
        else if(i<15)
            System.out.println("i greater than 5 and less than 15");
        
        //switch
        switch(i)
        {
            case 0:
                System.out.println("i = 0");
                break;
            case 1:
                System.out.println("i = 1");
                break;
            default:
                System.out.println("i = 10");
        }

        //---Jump statements---
        //break,continue,return

        for(int k=0;k<6;k++)
        {
            if(k==1)
                continue;
            System.out.println(k);

            if(k==4)
            break;
        }

        return;

        //System.out.println("This won't execute as it is after return statement.");

    }
}
