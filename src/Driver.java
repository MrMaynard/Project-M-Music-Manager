package pmm;


public class Driver {

    
    static Songlist origin;
    static Songlist custom;
    static String oText;
    static String cText;
    
    static final String origin_file = "SBBBOrigin.txt";
    static final String custom_file = "SBBBCustom.txt";
    
    public static void buildSongListsFromFile(){
        origin = new Songlist();
        custom = new Songlist();
        oText= origin.parse(origin_file);
        cText = custom.parse(custom_file);
        //consoleDriver();
    }
}
