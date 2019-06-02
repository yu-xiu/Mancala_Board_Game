/**
 * Interface class works as layout management strategy
 * It provides shared functions for concrete strategy classes
 *
 * @author Khadeja Khalid, Yu Xiu
 * @version 1.0 5/4/2019
 */
public interface BoardLayout {
    // Methods shared by both layout1 and layout2

    /**
     * set data
     * @param data
     */
    public void setData(int[] data);

    /**
     * draw a Mancala game board
     */
    public void drawBoard();

    /**
     * repaint stones in pits
     */
    public void repaintStones();

    /**
     * determines turns of players
     * @param player
     */
    public void whosTurn(int player);
}
