import java.util.*;
public class strings {
    public static void main(String[] args)
    {
    StringBuilder sb=new StringBuilder("Neha");
    System.out.println(sb);
    //append a character at the end
    sb.append(" pal");
    System.out.println(sb);
    //insert a character in the string
    sb.insert(1,'p');
    System.out.println(sb);
    //delete characters from the string
    sb.delete(0,2);
    System.out.println(sb);
    sb.insert(0,'n');
    System.out.println(sb);
    //get a character from index
    sb.setCharAt(4,'_');
    System.out.println(sb);
    }
}
