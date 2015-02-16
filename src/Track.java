package pmm;


public class Track {
    String ID = "A00";
    String filePath = "C:\\users\\music\\brawl\\song.extension";
    String name = "NO NAME FOUND";
    
    public Track(){
        
    }
    
    public Track(String i, String n, String fp){
        ID = i;
        filePath = fp;
        name = n;
    }
}
