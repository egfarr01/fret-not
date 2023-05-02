public class Colors {
 

    public static void main(String[]args) {
    
        
        Fretboard myBoard = new Fretboard();
        myBoard.PrintString(7, 23);
        myBoard.PrintString(2, 23);
        myBoard.PrintString(10, 23);
        myBoard.PrintString(5, 23);
        myBoard.PrintString(0, 23);
        myBoard.PrintString(7, 23);
        myBoard.PrintFretNum(23);

        HomeScreen h = new HomeScreen();
        h.PrintString(1, 7, 23);
        h.PrintString(2, 2, 23);
        h.PrintString(3, 10, 23);
        h.PrintString(4, 5, 23);
        h.PrintString(5, 0, 23);
        h.PrintString(6, 7, 23);
        h.Render();

        
        
        
        
        

}
}