package pmm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Songlist {
    ArrayList<Stage> stageList = new ArrayList<>();
    Stage stage;
    Track track;
    String lines[];
    
    public Songlist(){
        
    }
    public String parse(String txtFile){
        String errorString = "";
        File a = new File("testFile");
        try {
            errorString = a.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(Songlist.class.getName()).log(Level.SEVERE, null, ex);
        }
        String rawText = "";
        String[] data;
        try{
        rawText = PMM.readFile(txtFile);
        }catch(IOException e){JOptionPane.showMessageDialog(null, "File not found at location:\n"+txtFile+"\n"+errorString);}
        lines = rawText.split("\\r?\\n");  
        String s;
        for (String line : lines) {
            
            s = line;
            if (!s.contains("-")){
                stageList.add(new Stage(s));
            }
            else{
                data = s.split("-");
                try{
                stageList.get(stageList.size() - 1).trackList.add(new Track(data[0],data[1],data[2]));
                }catch(Exception e){System.out.println("Problem parsing the following line:\n"+line);}
            }
        }
        return rawText;
    }   
   
//Obsolete but I should probably use this method over the current, slower one:
   public void write(String txtFile){
       StringBuilder sb = new StringBuilder();
       for(Stage s : stageList){
           sb.append(s.name);
           sb.append("\n");
           for(Track t : s.trackList){
               sb.append(t.ID);
               sb.append(" - ");
               sb.append(t.name);
               sb.append(" - ");
               sb.append(t.filePath);
               sb.append("\n");
           }
       }
       new Nerd().write(txtFile, sb.toString());
   }
    
}
