import java.util.Scanner;
import java.io.*;
class RiswanaTR_66
      {
        public static void main(String args[ ])
              {
                int i,k,j,n,c,l=1,limit,temp,temp1,temp2=1,temp3,choice,start,space,low,s;
                Scanner in=new Scanner(System.in);
                System.out.print("Enter an odd number greater than 2:");
                n = in.nextInt();
                if(((n/2)==0)||(n<3))
                   {
                       System.out.print("invalid number");
                       System.exit(0);
                   }
                else
                  {
                    j=n/2;
                    System.out.print("Enter the number of outer lines from the list\n");
                    for(i=1;i<=j;i++)
                       {
                         System.out.println(i);
                       }
                    choice = in.nextInt();
                    start=choice+1;
                    limit=(n/2)+1;
                    for(i=1;i<=limit;i++)
                       {
                         space=0;
                         temp3=temp2;
                         k=j;
                         if(j!=0)
                           j--;
                         if(i!=1)
                           {
                             c=i+l;
                             l++;
                           }
                         else
                           c=i;
                         while(k!=0)
                              {
                                System.out.print(" ");
                                k--;
                              }
                         while(c!=0)
                              {
                                System.out.print("1");
                                if(c!=0)
                                 {
                                  c--;
                                  space++;
                                 }
                                if((i==start)&&(space==choice))
                                 {
                                   while (temp3!=0)
                                       {
                                         System.out.print(" ");
                                         temp3--;
                                         if (c!=0)
                                         c--;
                                       }
                                   temp2=temp2+2;
                                   start=start+1;
                                }
                              }
                         System.out.print("\n");
                      }
                   temp1=n-1;
                   for(i=1;i<limit;i++)
                      {
                        s=choice;
                        temp=i;
                        while(temp!=0)
                            {
                              System.out.print(" ");
                              temp--;
                            }
                        temp=temp1-1;
                        low=temp-(2*s);
                        space=0;
                        while(temp!=0)
                           {
                             System.out.print("1");
                             if(temp!=0)
                             temp--;
                             space++;
                             if(space==choice)
                              {
                                while(low>0)
                                    {
                                      System.out.print(" ");
                                      low--;
                                      if(temp!=0)
                                        temp--;
                                    }
                              }
                           }
                       if(temp1!=0)
                       temp1=temp1-2;
                       System.out.println();
                     }
                }
         }
}