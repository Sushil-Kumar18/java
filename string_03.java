public class string_03 {

    // This is the code to find the shortest path to reach destination
    public static float getshortpath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i <str.length(); i++){
            char dir = str.charAt(i);
            if (dir == 'S') {
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String name = "WNEENESENNN";
        System.out.println(getshortpath(name));
    }
    
}
