public class shortestPath{

    public static void displacement(String str){
        int x=0;
        int y=0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'E'){
               x++; 
            }else if(str.charAt(i) == 'W'){
                x--;
            }
        }
        int shortest_path = (int)Math.sqrt(Math.pow((x-0),2) + Math.pow((y-0),2));
        System.out.println(shortest_path);
    }
    
    public static void main(String args[]){
        String str="WNEENESENNN";
        displacement(str);
    }
}