public class Continue {
    public static void main (String[] args) throws java.lang.Exception {
      // your code goes here

    int i = 1;
    while(i <= 10)
    {
        if((i % 5) == 0)
        {
            i++;
            continue;
        }
        System.out.println(i);
        i++;
    }
   }
}
