package lib.color;

/**
 * Methods for printing standard messages.
 * @author Jesimar Arantes
 */
public class StandardPrints {
    
    public static void printMsgEmph(String msg){
        System.out.println(TextColor.ANSI_BLUE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgEmph2(String msg){
        System.out.println(TextColor.ANSI_BLUE_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgEmph3(String msg){
        System.out.println(TextColor.ANSI_GREEN + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgEmph4(String msg){
        System.out.println(TextColor.ANSI_GREEN_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgBlue(String msg){
        System.out.println(TextColor.ANSI_BLUE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgBlue2(String msg){
        System.out.println(TextColor.ANSI_BLUE_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgGreen(String msg){
        System.out.println(TextColor.ANSI_GREEN + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgGreen2(String msg){
        System.out.println(TextColor.ANSI_GREEN_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgRed(String msg){
        System.out.println(TextColor.ANSI_RED + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgRed2(String msg){
        System.out.println(TextColor.ANSI_RED_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgCyan(String msg){
        System.out.println(TextColor.ANSI_CYAN + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgCyan2(String msg){
        System.out.println(TextColor.ANSI_CYAN_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgMagenta(String msg){
        System.out.println(TextColor.ANSI_MAGENTA + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgMagenta2(String msg){
        System.out.println(TextColor.ANSI_MAGENTA_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgYellow(String msg){
        System.out.println(TextColor.ANSI_YELLOW + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgYellow2(String msg){
        System.out.println(TextColor.ANSI_YELLOW_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgBlackWhite(String msg){
        System.out.println(TextColor.ANSI_BLACK_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgBlackWhite2(String msg){
        System.out.println(TextColor.ANSI_WHITE_BACKGROUND + TextColor.ANSI_BLACK + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgReverseVideo(String msg){
        System.out.println(TextColor.ANSI_REVERSE_VIDEO + msg + TextColor.ANSI_RESET);
    }
        
    public static void printMsgUnderline(String msg){
        System.out.println(TextColor.ANSI_UNDERLINE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgItalic(String msg){
        System.out.println(TextColor.ANSI_ITALIC + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgHighIntensity(String msg){
        System.out.println(TextColor.ANSI_HIGH_INTENSITY + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgLowIntensity(String msg){
        System.out.println(TextColor.ANSI_LOW_INTENSITY + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgInvisibleText(String msg){
        System.out.println(TextColor.ANSI_INVISIBLE_TEXT + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgSame(String msg){
        System.out.println(TextColor.ANSI_SANE + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgBlink(String msg){
        System.out.println(TextColor.ANSI_BLINK + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgRapidBlink(String msg){
        System.out.println(TextColor.ANSI_RAPID_BLINK + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgWarning(String msg){
        System.out.println(TextColor.ANSI_YELLOW + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgWarning2(String msg){
        System.out.println(TextColor.ANSI_YELLOW_BACKGROUND + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgError(String msg){
        System.out.println(TextColor.ANSI_RED + msg + TextColor.ANSI_RESET);
    }
    
    public static void printMsgError2(String msg){
        System.out.println(TextColor.ANSI_RED_BACKGROUND + TextColor.ANSI_WHITE + msg + TextColor.ANSI_RESET);
    }
    
}
