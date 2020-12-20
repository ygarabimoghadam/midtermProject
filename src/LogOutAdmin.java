import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LogOutAdmin {


    public LogOutAdmin(){}

    public  void writeFiles(HashMap<String,String> hashMap,String fileName){
        try {
            File fileTwo=new File(fileName);
            FileOutputStream fos=new FileOutputStream(fileTwo);
            PrintWriter pw=new PrintWriter(fos);

            for(Map.Entry<String,String> m :hashMap.entrySet()){
                pw.println(m.getKey());
                pw.println(m.getValue());
            }
            pw.flush();
            pw.close();
            fos.close();
        } catch(Exception e) {}
    }

    public HashMap<String , String > readFiles(String name){
        HashMap<String , String > map = new HashMap<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> users = new ArrayList<>();
        ArrayList<String> pass = new ArrayList<>();
        File  file = new File(name);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                names.add(scanner.nextLine());
            }
            for(int i =  0 ; i<names.size() ; i=i+2){
                users.add(names.get(i));
            }
            for(int j = 1 ; j<names.size(); j = j+2){
                pass.add(names.get(j));
            }
            for (int z =0 ; z<users.size() ; z++){
                    map.put(users.get(z),pass.get(z));

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return map ;
    }

    public void writeSerialize(String name,Object ob){
        String fileName = name;
        File file = new File(fileName);
        try(FileOutputStream fs = new FileOutputStream(file)){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(ob.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int readCounter(String name){
        int num = 0 ;
        File file = new File(name);
        try (Scanner scanner = new Scanner(file)) {
            num = scanner.nextInt();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return num ;
    }

    public void writeCounter(String name ,int num){
        try {
            Writer writer = new FileWriter(name);
            writer.write(String.valueOf(num));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String  fileReaderInput(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte data[] = new byte[fis.available()];
        fis.read(data);
        fis.close();
        String str = new String(data);
        return str;
    }
}
