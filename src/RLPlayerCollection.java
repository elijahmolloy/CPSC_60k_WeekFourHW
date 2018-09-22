public interface RLPlayerCollection {

    void addPlayer(RLPlayer player);
    void deletePlayer(RLPlayer player);
    RLPlayerIterator iterator(RLRank rank);
}

