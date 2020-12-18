import java.io.*;
import java.util.HashMap;
import java.util.Map;

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

    public void writeFileForMeals(HashMap<Integer,String> hashMap,String fileName){
        try {
            File fileTwo=new File(fileName);
            FileOutputStream fos=new FileOutputStream(fileTwo);
            PrintWriter pw=new PrintWriter(fos);

            for(Map.Entry<Integer,String> m :hashMap.entrySet()){
                pw.println(m.getKey());
                pw.println(m.getValue());
            }
            pw.flush();
            pw.close();
            fos.close();
        } catch(Exception e) {}
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

}
