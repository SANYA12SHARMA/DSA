package UCAPrograms;

public class findGender {
    public static String findGenderOfChild(int generation,int childNo){
        if(generation == 1){
            return "male";
        }
        if(childNo == 1){
            return "male";
        }
        if(findGenderOfChild(generation-1,(childNo+1)/2) == "male"){
            if(childNo%2 != 0){
                return "male";
            }
            return "female";
        }else {
            if (childNo % 2 != 0) {
                return "female";
            }
            return "male";
        }
    }
    public static void main(String[] args){
        assert findGenderOfChild(5, 8).equals("female");
        assert findGenderOfChild(3, 4).equals("male");
        System.out.println("Running Successfully");
    }
}
