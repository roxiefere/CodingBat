public class Runner {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        System.out.println(icyHot(70, 45));
        System.out.println(seeColor("Blue paper birds"));
        System.out.println(bobThere("I saw Bobby "));
        System.out.println(alarmClock(4, false));
        System.out.println(loneSum(24, 90, 5));
        System.out.println(arrayCount9(arr));
        System.out.println(no23(arr));
        System.out.println(lucky13(arr));
    }

        //Warm Up 1
    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)) {
            return true;
        } else {
            return false;
        }
    }
    //String 1
    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
    //String 2
    public static boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++){
            if((str.substring(i, i+1).equals("b")) && (str.substring(i+2, i+3).equals("b"))){
                return true;
            }
        }
        return false;
    }
    //String 3

    //Logic 1
    public static String alarmClock(int day, boolean vacation) {
        if ((day == 0 || day == 6) && (vacation == true)) {
            return "off";
        }
        if ((day == 0 || day == 6) && (vacation == false)) {
            return "10:00";
        }
        if (day == 1 && vacation == true) {
            return "10:00";
        }
        if (day == 2 && vacation == true) {
            return "10:00";
        }
        if (day == 3 && vacation == true) {
            return "10:00";
        }
        if (day == 4 && vacation == true) {
            return "10:00";
        }
        if (day == 5 && vacation == true) {
            return "10:00";
        } else {
            return "7:00";
        }
    }
    //Logic 2
    public static int loneSum(int a, int b, int c) {
        if((a != b) && (b != c) && (a != c)){
            int sum = (a + b + c);
            return sum;
        }
        if(a == b && b == c){
            return 0;
        }
        if(a == b){
            return c;
        }
        if(b == c){
            return a;
        }
        if(a == c){
            return b;
        }
        return 0;
    }
    //Warm Up 2
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for(int i=0; i <= nums.length - 1; i++){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }
    //Array 1
    public static boolean no23(int[] nums) {
        for(int i=0; i <= nums.length - 1; i++){
            if(nums[i]== 2 || nums[i]==3){
                return false;
            }
        }
        return true;
    }
    //Array 2
    public static boolean lucky13(int[] nums) {
        for(int i=0; i <= nums.length - 1; i++){
            if(nums[i]== 1 || nums[i]== 3){
                return false;
            }
        }
        return true;
    }
    //Array 3

}