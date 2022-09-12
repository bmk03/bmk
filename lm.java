class Solution 
{
    public int romanToInt(String s) 
    {
     char[] c=s.toCharArray();
     int a1=0,a2=0;
     int b=0;
     for(int i=c.length-1;i>=0;i--)
     {
         switch(c[i])
         {
             case'I':a1=1;
             break;
             case'V':a1=5;
             break;
             case'X':a1=10;
             break;
             case'L':a1=50;
             break;
             case'C':a1=100;
             break;
             case'D':a1=500;
             break;
             case'M':a1=1000;
             break;
         }
         if(a2<=a1)
         {
             b=b+a1;
         }
         else
         {
             b=b-a1;
         }
         a2=a1;
     }
     return b;
    }    
}