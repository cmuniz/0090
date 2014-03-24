import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    public HashMap<String, String> listin;

    public AgendaTelefonica(){
        listin = new HashMap<>();
    }

    public void enterNumber(String name, String number){
        listin.put(name, number);
    }

    public void lookupNumber(String name){
        System.out.println(listin.get(name));
    }

    /**
     * Print all keys
     */
    public void printAllNames(){
        
    }
}
