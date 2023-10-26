package polymorphism;

public class StudentMarks {
	public int calculateMarks(int physics, int chemistry, int maths) {
		int marks=physics+chemistry+maths;
		return marks;
    }

    /* adding 3 integer values.*/
    public int calculateMarks(int physics, int chemistry, int maths, int bio) {
    	int marks2=physics+chemistry+maths;
    	return marks2; 
    }

    /* adding 4 double values.*/
    public double calculateMarks(double physics, double chemistry, double maths, double bio) {
    	double marks3=physics+chemistry+maths+bio;
        return marks3;
    }

    /* static method adding 5 float values.*/
    public static float calculateMarks(float maths, float bio, float physics, float chemistry, float lang) {
    	float marks4=maths+bio+physics+chemistry+lang;
        return marks4;

    } 


    /* adding 4 float values with order changed.*/
    public float calculateMarks(float maths, float bio, float physics, float chemistry) {
    	float marks5=maths+bio+physics+chemistry;
        return marks5;

    }


}
