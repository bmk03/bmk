class Solution 
{
    public boolean wordPattern(String pattern, String s) 
    {
     Map<String,Character>map=new HashMap<>();
     String[] a=s.split(" ");
     if(pattern.length()!=a.length)
     return false;
     for(int i=0;i<a.length;i++)
     {
         if(!map.containsKey(a[i]))
         {
             if(map.containsValue(pattern.charAt(i)))
             return false;
             else map.put(a[i],pattern.charAt(i));
         }
         else if(pattern.charAt(i)!=map.get(a[i]))
         return false;
     }
     return true;
    }
}