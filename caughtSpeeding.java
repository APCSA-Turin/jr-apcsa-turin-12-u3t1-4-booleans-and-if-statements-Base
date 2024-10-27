public class caughtSpeeding {
    public int caughtSpeeding1(int speed, boolean isBirthday) {
        int result = speed;
        if (speed <= 60){
          result = 0;
        }
       if (speed >= 61 && speed <= 80){
          result = 1;
        }
        if (speed >= 81){
          if (isBirthday){
            result = 0;
          }
          else if (!isBirthday) {
            result = 2;
        }
        }
        
        return result;
      }
      
}
