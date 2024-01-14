public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        /* Captura os megaBytes */
        int megaBytes = kiloBytes / 1024;
        /* Captura os kiloBytes restantes */
        int kiloBytesRestantes = kiloBytes % 1024;
        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRestantes + " KB");
        }
        
        
    }
}
