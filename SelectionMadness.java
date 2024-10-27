// Here is an incomplete SelectionMadness class; add this class to your project and implement each method below as described:

public class SelectionMadness {

  // no instance variables //
  
  public SelectionMadness() { }

  /* Returns 1 of 5 randomly generated fortunes as a string;
     you should write your own 5 fortunes! (see output for examples)
   */
   

  public String fortune() {
     /* implement this method */
     int rng = (int)(Math.random()*5) + 1;
     if (rng == 1){
        return "You are blessed with eternal peace";
     }
     else if (rng == 2){
        return "Mr.Newman turns into meow";
     }
     else if (rng == 3){
        return "You will get into an ivy-league university";
     }
     else if (rng == 4){
        return "You will become Albert Einstein";
     }
     else{
        return "You will gain a new laptop";
     }
  }

  /* Returns the largest of three provided integers: num1, num2, or num3
   */
  public int largest(int num1, int num2, int num3) {
     /* implement this method */
     int freedom;
     if (num1 > num2 && num1 > num3){
        freedom = num1;
  }
  else{
    freedom = num2;
  }

if(num3 > num1 && num3 > num2){
    freedom = num3;
}

return freedom;
  
}

 /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
   */
  public boolean rightTriangle(int side1, int side2, int side3) {
   /* implement this method */
   int c = largest(side1, side2, side3);
   int Theorem = 2 * (c * c);
   int subTheorem = (side1 * side1) + (side2 * side2) + (side3 * side3);
   if (Theorem == subTheorem){
      return true;
   }
   return false;

}
}
