package lib.samples;

import lib.color.StandardPrints;
import lib.color.TextColor;

/**
 * Simple application with multiple display prints.
 * @author Jesimar Arantes
 */
public class SimplePrints {
    
    public static void main(String[] args) {
        
        //Prints usando os metodos padroes definidos.
        StandardPrints.printMsgEmph("Emph");
        StandardPrints.printMsgEmph2("Emph2");
        StandardPrints.printMsgEmph3("Emph3");
        StandardPrints.printMsgEmph4("Emph4");
        StandardPrints.printMsgWarning("Warning");
        StandardPrints.printMsgWarning2("Warning2");
        StandardPrints.printMsgError("Error");
        StandardPrints.printMsgError2("Error2");
        
        //Prints baseados em cores pre-definidos.
        StandardPrints.printMsgBlue("Blue");
        StandardPrints.printMsgBlue2("Blue2");
        StandardPrints.printMsgGreen("Green");
        StandardPrints.printMsgGreen2("Green2");
        StandardPrints.printMsgRed("Red");
        StandardPrints.printMsgRed2("Red2");       
        StandardPrints.printMsgCyan("Cyan");
        StandardPrints.printMsgCyan2("Cyan2");
        StandardPrints.printMsgMagenta("Magenta");
        StandardPrints.printMsgMagenta2("Magenta2");
        StandardPrints.printMsgYellow("Yellow");
        StandardPrints.printMsgYellow2("Yellow2");        
        StandardPrints.printMsgBlackWhite("BlackWhite");
        StandardPrints.printMsgBlackWhite2("BlackWhite2");
        
        //Prints nao funcionam na IDE, mas funcionam no terminal
        StandardPrints.printMsgReverseVideo("ReverseVideo");
        StandardPrints.printMsgUnderline("Underline");
        StandardPrints.printMsgItalic("Italic");
        StandardPrints.printMsgSame("Same");
        StandardPrints.printMsgHighIntensity("HighIntensity");
        StandardPrints.printMsgLowIntensity("LowIntensity");
        StandardPrints.printMsgInvisibleText("Texto Invisivel");
        
        //Prints que nao consegui ver diferenca nehuma.
        StandardPrints.printMsgBlink("Blink");
        StandardPrints.printMsgRapidBlink("RapidBlink");        
                
        //Cores distindas do texto e fundo default (branco)
        System.out.println(TextColor.ANSI_RED + "Texto Cor Vermelha!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_GREEN + "Texto Cor Verde!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_BLUE + "Texto Cor Azul!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_YELLOW + "Texto Cor Amarelo!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_BLACK + "Texto Cor Preto!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_MAGENTA + "Texto Cor Roxo!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_CYAN + "Texto Cor Ciano!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_WHITE + "Texto Cor Branco!" + TextColor.ANSI_RESET);
        
        //Cores do texto default (preto) com fundos distintos.
        System.out.println(TextColor.ANSI_RED_BACKGROUND + "Texto Fundo Vermelho!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_GREEN_BACKGROUND + "Texto Fundo Verde!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_BLUE_BACKGROUND + "Texto Fundo Azul!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_YELLOW_BACKGROUND + "Texto Fundo Amarelo!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_BLACK_BACKGROUND + "Texto Fundo Preto!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_MAGENTA_BACKGROUND + "Texto Fundo Roxo!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_CYAN_BACKGROUND + "Texto Fundo Ciano!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_WHITE_BACKGROUND + "Texto Fundo Branco!" + TextColor.ANSI_RESET);
        
        //Cores do texto e do fundo distintos.
        System.out.println(TextColor.ANSI_GREEN_BACKGROUND + TextColor.ANSI_RED + "Texto vermelho fundo verde!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_RED_BACKGROUND + TextColor.ANSI_GREEN + "Texto verde fundo vermelho!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_BLACK_BACKGROUND + TextColor.ANSI_GREEN + "Texto verde fundo preto!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_WHITE_BACKGROUND + TextColor.ANSI_RED + "Texto vermelho fundo branco!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_CYAN_BACKGROUND + TextColor.ANSI_MAGENTA + "Texto roxo fundo ciano!" + TextColor.ANSI_RESET);
        System.out.println(TextColor.ANSI_BLUE_BACKGROUND + TextColor.ANSI_WHITE + "Texto branco fundo azul!" + TextColor.ANSI_RESET);       
    }
    
}
