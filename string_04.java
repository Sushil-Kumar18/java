public class string_04 {

    // This is the code to find the substring of  a string
    public static String substring(String str, int si, int ei){
        String strin  = "";
        for(int i = si; i < ei; i++){
            strin += str.charAt(i);
        }
        return strin;
    }
    public static void main(String[] args) {
        String name = "Sushil Kumar";
        System.out.println(name.substring(0, 10));  // -------> This is the shortcut to find the substring of a string

        
        System.out.println(substring(name, 0, 10));
    }
    
}
