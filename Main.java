import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("pls write your First name");
        Scanner user_input = new Scanner(System.in, "Cp1251");
        String First;
        First = user_input.nextLine();
        System.out.println("pls write your Last name");
        String Last;
        Last = user_input.nextLine();
        System.out.println("pls write your Middle name");
        String Middle;
        Middle = user_input.nextLine();
        System.out.println("pls write your Birthday in format xx/xx/xxxx");
        String Birthday;
        Birthday = user_input.nextLine();
        if (Birthday.length() != 10){
            System.out.println("pls write correct Format");
            return ;}
        System.out.println("pls write your Numberphone in format 81234567890");
        String Numberphone;
        Numberphone = user_input.nextLine();
        if (Numberphone.length() != 11){
            System.out.println("pls write correct Format");
            return ;}
        System.out.println("pls write your Gender in format M/F");
        String Gender;
        Gender = user_input.nextLine();
        if (Gender.length() != 1){
            System.out.println("pls write correct Format");
            return ;}
        System.out.println("you are ");
        System.out.println(First);
        System.out.println(Last);
        System.out.println(Middle);
        System.out.println(Birthday);
        System.out.println(Numberphone);
        System.out.println(Gender);
        System.out.println("True or False?");
        Boolean True;
        True = user_input.nextBoolean();
        if (True){
        System.out.println("you are authorised");
        try{
            // Create new file
            String path=Last + ".txt";
            String content = First + " " + Last + " " + Middle + " " + Birthday + " " + Numberphone + " " + Gender + "\n";
            File file = new File(path);
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(content);

            // Close connection
            bw.close();
            
            // If file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
        else{
            System.out.println(("write your data"));
        }
    }
}

        