//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
  //initiate an int variable called totalSum
  int totalSum = 0;
  //loop through each number in the arrayList using a for each loop
  for (Integer a : ray)
  {
    //get the value of the number and add it to totalSum
    totalSum += a;
  //end loop
  }
//return totalSum
return totalSum;
 }
}