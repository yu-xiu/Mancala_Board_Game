/**
 * Creates a MancalaDataModel, Board (view/control), attaches the model to the board,
 * and calls the home page of the board, for the user to select their layout and start the game
 *
 * @author Khadeja Khalid, Yu Xiu
 * @version 1.0 5/4/2019
 */
public class MancalaTest {
    public static void main(String[] args) {
 /*     int[] dummyData = new int[14];

    	for(int i=0; i<14; i++)
    	{
    		dummyData[i] = 3;
    	}

    	dummyData[4] = 7;
    	dummyData[6] = 5;
    	dummyData[10] = 13;
    	dummyData[13] = 20;

*/
    	/*BoardLayout test = new HorizontalLayout();
    	test.setData(dummyData);
    	test.drawBoard();
    	*/

  /*  	// test vertical
        MancalaDataModel model = new MancalaDataModel();
        BoardLayout test2 = new VerticalLayout();
        test2.setData(dummyData);
        test2.drawBoard();*/

        MancalaDataModel model = new MancalaDataModel();
        Board board = new Board(model);
        model.attach(board);
        board.homepage();

        //model.dummy();
        //model.dummyPrintData();


    }
}
