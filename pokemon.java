import java.util.*;
public class pokemon {
    public static void main(String[] args) {
        int pickachu=0,squirtle=0,charmander=0;
        double value=0.0;
        Scanner s1=new Scanner(System.in);
        System.out.println("enter number of pickhachu to be purchased");
        pickachu=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        System.out.println("enter number of squirtles to be purchased");
        squirtle=s2.nextInt();
        Scanner s3=new Scanner(System.in);
        System.out.println("enter number of charmander to be purchased");
        charmander=s3.nextInt();
        if((pickachu==squirtle)||(pickachu==charmander))
        {
            int n=6+5;
            double m=(n*90)/100.0;
            value=m*pickachu;    
        }
        if(squirtle==charmander)
        {
            int n=5+5;
            double m=n*90/100.0;
            value=m*squirtle;
        }
        if((pickachu!=0) & (squirtle==0) &(charmander==0))
        {
            value=pickachu*6;
        }
        if((pickachu==0) & (squirtle!=0) &(charmander==0))
        {
            value=squirtle*5;
        }
        if((pickachu==0) & (squirtle==0) &(charmander!=0))
        {
            value=charmander*5;
        }
        if((pickachu>0)&(squirtle>0)&(pickachu!=squirtle))
        {
            if(pickachu>squirtle)
            {
                int x=pickachu-squirtle;
                int n=6+5;
                double m=n*90/100.0;
                value=(m*squirtle)+(x*6);
            }
            if(pickachu<squirtle)
            {
                int x=squirtle-pickachu;
                int n=6+5;
                double m=n*90/100.0;
                value=(m*pickachu)+(x*5);
            }
        }
        
        if((pickachu>0)&(charmander>0)&(pickachu!=charmander))
        {
            if(pickachu>charmander)
            {
                int x=pickachu-charmander;
                int n=6+5;
                double m=n*90/100.0;
                value=(m*charmander)+(x*6);
            }
            if(pickachu<charmander)
            {
                int x=charmander-pickachu;
                int n=6+5;
                double m=n*90/100.0;
                value=(m*pickachu)+(x*5);
            }
        }
        
        if((charmander>0)&(squirtle>0)&(charmander!=squirtle))
        {
            if(charmander>squirtle)
            {
                int x=charmander-squirtle;
                int n=5+5;
                double m=n*90/100.0;
                value=(m*squirtle)+(x*5);
            }
            if(charmander<squirtle)
            {
                int x=squirtle-charmander;
                int n=5+5;
                double m=n*90/100.0;
                value=(m*charmander)+(x*5);
            }
        }
        if((pickachu==squirtle)&(squirtle==charmander))
        {
            int n=6+5+5;
            double m=n*80/100.0;
            value=m*pickachu;
        }
        if((pickachu>0)&(squirtle>0)&(charmander>0))
        {
            if((pickachu>squirtle) & (squirtle==charmander))
            {
                int x=pickachu-squirtle;
                int n=6+5+5;
                double m=n*80/100.0;
                value=(m*squirtle)+(x*6);
            }
            if((pickachu<squirtle) & (squirtle==charmander))
            {
                int x=squirtle-pickachu;
                int n=6+5+5;
                double m=n*80/100.0;
                value=(m*pickachu)+(2*x*5);
            }
            if((squirtle>pickachu) & (pickachu==charmander))
            {
                int x=squirtle-pickachu;
                int n=6+5+5;
                double m=n*80/100.0;
                value=(m*pickachu)+(x*5);
            }
            if((pickachu>squirtle) & (pickachu==charmander))
            {
                int x=pickachu-squirtle;
                int n=6+5+5;
                double m=n*80/100.0;
                value=(m*squirtle)+(x*6)+(x*5);
            }
             if((pickachu<charmander) & (squirtle==pickachu))
            {
                int x=charmander-pickachu;
                int n=6+5+5;
                double m=n*80/100.0;
                value=(m*squirtle)+(x*5);
            }
            if((pickachu>charmander) & (squirtle==pickachu))
            {
                int x=pickachu-charmander;
                int n=6+5+5;
                double m=n*80/100.0;
                value=(m*charmander)+(x*6)+(x*5);
            }
            if((pickachu!=squirtle) & (squirtle!=charmander))
            {
                if((pickachu>squirtle)& (squirtle>charmander))
                {
                    int x=pickachu-squirtle;
                    int y=squirtle-charmander;
                    int n=6+5+5;
                    int f=6+5;
                    double l=f*90/100.0;
                    double m=n*80/100.0;
                    value=(charmander*m)+(y*l)+(x*6);
                }
                if((squirtle>charmander)& (charmander>pickachu))
                {
                    int x=squirtle-pickachu;
                    int y=charmander-pickachu;
                    int z=squirtle-charmander;
                    int n=6+5+5;
                    int f=5+5;
                    double l=f*90/100.0;
                    double m=n*80/100.0;
                    value=(pickachu*m)+(y*l)+(z*5);
                }
                if((pickachu<squirtle)& (squirtle<charmander))
                {
                    int x=squirtle-pickachu;
                    int y=charmander-pickachu;
                    int z=charmander-squirtle;
                    int n=6+5+5;
                    int f=5+5;
                    double l=f*90/100.0;
                    double m=n*80/100.0;
                    value=(pickachu*m)+(x*l)+(z*5);
                }
                if((pickachu>charmander)& (squirtle<charmander))
                {
                    int x=pickachu-squirtle;
                    int y=charmander-squirtle;
                    int z=pickachu-charmander;
                    int n=6+5+5;
                    int f=6+5;
                    double l=f*90/100.0;
                    double m=n*80/100.0;
                    value=(squirtle*m)+(y*l)+(z*6);
                }
                if((pickachu>charmander)& (squirtle>pickachu))
                {
                    int x=squirtle-pickachu;
                    int y=squirtle-charmander;
                    int z=pickachu-charmander;
                    int n=6+5+5;
                    int f=6+5;
                    double l=f*90/100.0;
                    double m=n*80/100.0;
                    value=(charmander*m)+(z*l)+(x*5);
                }
                if((charmander>pickachu)& (squirtle<pickachu))
                {
                    int x=pickachu-squirtle;
                    int y=charmander-squirtle;
                    int z=charmander-pickachu;
                    int n=6+5+5;
                    int f=6+5;
                    double l=f*90/100.0;
                    double m=n*80/100.0;
                    value=(squirtle*m)+(x*l)+(z*5);
                }
            }
        }
        System.out.println(value);
    }
    
}
