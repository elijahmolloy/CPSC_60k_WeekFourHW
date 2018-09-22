import java.util.ArrayList;
import java.util.List;

public class RLPlayerCollectionImplementation implements RLPlayerCollection {

    private List<RLPlayer> playersList;

    /**
     *
     */
    public RLPlayerCollectionImplementation() {
        playersList = new ArrayList<>();
    }

    /**
     *
     * @param player
     */
    @Override
    public void addPlayer(RLPlayer player) {
        this.playersList.add(player);
    }

    /**
     *
     * @param player
     */
    @Override
    public void deletePlayer(RLPlayer player) {
        if (playersList.contains(player)) {
            this.playersList.remove(player);
        }
    }

    /**
     *
     * @param rank
     * @return
     */
    public RLPlayerIterator iterator(RLRank rank) {
        return new RLPlayerIteratorImplementation(rank, this.playersList);
    }


    /**
     *
     */
    private class RLPlayerIteratorImplementation implements RLPlayerIterator {

        private RLRank rank;
        private List<RLPlayer> playersList;
        private int position;

        /**
         *
         * @param rank
         * @param playersList
         */
        public RLPlayerIteratorImplementation(RLRank rank, List<RLPlayer> playersList) {
            this.rank = rank;
            this.playersList = playersList;
            position = 0;
        }

        /**
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            while (position < playersList.size()) {
                RLPlayer player = playersList.get(position);

                if (player.getRank().equals(rank)) {
                    return true;
                }

                else {
                    position ++;
                }
            }

            return false;
        }

        /**
         *
         * @return
         */
        @Override
        public RLPlayer next() {
            RLPlayer player = playersList.get(position);
            position ++;

            return player;
        }
    }
}
