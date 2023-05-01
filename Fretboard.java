public class Fretboard {
    public static final String ANSI_RESET = "\u001b[0m";

    public static final String C_Red = "\u001B[31m";
    public static final String D_Green = "\u001B[32m";
    public static final String E_Yellow = "\u001B[33m";
    public static final String F_Blue = "\u001B[34m";
    public static final String G_Pink = "\u001B[35m";
    public static final String A_Cyan = "\u001B[36m";
    public static final String B_Black = "\u001B[40m";

    public static String noteProg[] = { A_Cyan + "A" + ANSI_RESET, A_Cyan + "A#" + ANSI_RESET, B_Black + "B" + ANSI_RESET, C_Red + "C" + ANSI_RESET, C_Red + "C#" + ANSI_RESET, D_Green + "D" + ANSI_RESET, D_Green + "D#" + ANSI_RESET, E_Yellow + "E" + ANSI_RESET, F_Blue + "F" + ANSI_RESET, F_Blue + "F#" + ANSI_RESET, G_Pink + "G" + ANSI_RESET, G_Pink + "G#" + ANSI_RESET};

    

    public void PrintString(int note, int numFrets) {
        int i = 0; 
        while (i < numFrets) {
            System.out.print(noteProg[note]);
            if(note == 11) {
                note = -1;
            }
            if(i == (numFrets - 1)){
                System.out.println();
            }
            else {
                if(note == 0 || note == 2 || note == 3 || note == 5 || note == 7 || note == 8 || note == 10) {
                    System.out.print("---");
                }
                else {
                    System.out.print("--");
                }
            }
            note++;
            i++;
        }
    }

    public void PrintFretNum(int numFrets) {
        int i = 0; 
        while (i < numFrets) {
            System.out.print("====");
            if(i == (numFrets - 1)) {
                System.out.println();
            }
            i++;
        }

        i = 0;
        while (i < numFrets) {
            System.out.print(i); 
            if(i == (numFrets - 1)) {
                System.out.println();
            }
            else if(i > 9) {
                System.out.print("--");
            }
            else {
                System.out.print("---");
            }
            i++;
        }
    }
}
