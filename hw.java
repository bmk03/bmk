//学号：202102751
//姓名：柏明康

class Solution 
{
    public boolean isPalindrome(int x)
    {
     if(x<0){
     return false;
     } 
    int x2=x;
    int y=0;
    int a;
     do
     {
      a=x%10;
      y=y*10+a;
      x=x/10;
     }while(x!=0);
     if(y==x2)
      return true;
     else return false;
    }
}