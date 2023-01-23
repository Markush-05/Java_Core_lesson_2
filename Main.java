import java.sql.Wrapper;

public class Main {
    public static void main(String[] args) {
        byte myByte;
        short myShort;
        int myInt;
        long myLong;
        float myFloat;
        double myDouble;
        char myChar;
        boolean myBoolean;

        System.out.println("Byte максимальне = "+Byte.MAX_VALUE+"\nByte Мінімальне = "+Byte.MAX_VALUE);
        System.out.println("Short максимальне = "+Short.MAX_VALUE+"\nShort Мінімальне = "+Short.MAX_VALUE);
        System.out.println("Integer максимальне = "+Integer.MAX_VALUE+"\nInteger Мінімальне = "+Integer.MAX_VALUE);
        System.out.println("Long максимальне = "+Long.MAX_VALUE+"\nLong Мінімальне = "+Long.MAX_VALUE);
        System.out.println("Float максимальне = "+Float.MAX_VALUE+"\nFloat Мінімальне = "+Float.MAX_VALUE);
        System.out.println("Double максимальне = "+Double.MAX_VALUE+"\nDouble Мінімальне = "+Double.MAX_VALUE);
        System.out.println("Character максимальне = "+(Character.MAX_VALUE+0)+"\nCharacter Мінімальне = "+(Character.MIN_VALUE+0));
        System.out.println("boolean максимальне = "+true+"\nboolean Мінімальне = "+false);

        int [] list = {55,5,42,0,3,4,23,4,6,7};
        int minNamber=list[0],maxNamber =list[0] ;
        for(int i = 0; i<list.length; i++){
            if(minNamber> list[i]){
                minNamber = list[i];
            }
            if(maxNamber< list[i]){
                maxNamber = list[i];
            }
        }
        System.out.println("мінімальне значення = "+minNamber+"\nМаксимальне значення = "+maxNamber);
    }
}