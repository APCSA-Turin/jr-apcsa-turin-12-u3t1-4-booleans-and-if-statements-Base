public class LetterGrade {

public LetterGrade() { }
 
 
public String gradeV1(int score) {
        String grade = "";
        if (score < 60) {
            grade = "F";
        }
        if (score >= 60) {
            grade = "D";
        }
        if (score >= 70) {
            grade = "C";
        }

        if (score >= 80) {
            grade = "B";
        }
   
        if (score >= 90) {
            grade = "A";
        }

        return grade;
    }
 
 
    public String gradeV2(int score) {
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        }
        return grade;
    }

    public String gradeV3(int score) {
        String grade = "";
        if (score < 60) {
            grade = "F";
        }
        if (score >= 60) {
            grade = "D";
        }
        if (score >= 70) {
            grade = "C";
        }

        if (score >= 80) {
            grade = "B";
        }
   
        if (score >= 90) {
            grade = "A";
        }
        return grade;
     }

     public String gradeV4(int score) {
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        }
        return grade;
     }    
 }
 