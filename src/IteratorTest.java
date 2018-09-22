public class IteratorTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        RLPlayerCollection playersCollection = GeneratePlayersCollection();
        RLPlayerIterator baseIterator;

        RLRank[] ranks = new RLRank[] { RLRank.BRONZE, RLRank.SILVER,
                RLRank.GOLD, RLRank.PLATINUM, RLRank.DIAMOND, RLRank.CHAMPION };

        for (int i = 0; i < ranks.length; i++) {
            RLRank rank = ranks[i];
            baseIterator = playersCollection.iterator(rank);

            System.out.println("========== BEGIN " + rank.toString() + " RL RANK ITERATOR ==========");

            while (baseIterator.hasNext()) {
                RLPlayer player = baseIterator.next();

                System.out.println(player.toString());
            }

            System.out.println("\n");
        }
    }

    /**
     *
     * @return
     */
    private static RLPlayerCollection GeneratePlayersCollection() {
        RLPlayerCollection collection = new RLPlayerCollectionImplementation();

        collection.addPlayer(new RLPlayer("Matt", 1, RLRank.BRONZE));
        collection.addPlayer(new RLPlayer("Sarah", 2, RLRank.SILVER));
        collection.addPlayer(new RLPlayer("Elijah", 3, RLRank.GOLD));
        collection.addPlayer(new RLPlayer("Ethan", 4, RLRank.PLATINUM));
        collection.addPlayer(new RLPlayer("Claire", 5, RLRank.DIAMOND));
        collection.addPlayer(new RLPlayer("Justin", 6, RLRank.CHAMPION));
        collection.addPlayer(new RLPlayer("Zohair", 7, RLRank.BRONZE));
        collection.addPlayer(new RLPlayer("Bhargav", 8, RLRank.BRONZE));
        collection.addPlayer(new RLPlayer("Naveen", 9, RLRank.SILVER));
        collection.addPlayer(new RLPlayer("Manuj", 10, RLRank.GOLD));
        collection.addPlayer(new RLPlayer("Allison", 11, RLRank.PLATINUM));
        collection.addPlayer(new RLPlayer("Dan", 12, RLRank.DIAMOND));
        collection.addPlayer(new RLPlayer("Laurel", 1, RLRank.BRONZE));
        collection.addPlayer(new RLPlayer("Dennis", 1, RLRank.DIAMOND));
        collection.addPlayer(new RLPlayer("Karen", 1, RLRank.BRONZE));
        collection.addPlayer(new RLPlayer("Jaime", 1, RLRank.GOLD));
        collection.addPlayer(new RLPlayer("Ellen", 1, RLRank.SILVER));
        collection.addPlayer(new RLPlayer("Richard", 1, RLRank.PLATINUM));
        collection.addPlayer(new RLPlayer("Jesse", 1, RLRank.BRONZE));

        return collection;
    }
}
