public class RLPlayer {

    private String username;
    private int userId;
    private RLRank rank;

    /**
     *
     * @param username user's name
     * @param userId user's Id
     * @param rank user's rank
     */
    public RLPlayer(String username, int userId, RLRank rank) {
        this.username = username;
        this.userId = userId;
        this.rank = rank;
    }

    /**
     * Return User's Name
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set User's Name
     * @param username
     */
    public void setUsername(String username) {
        if (!this.username.equalsIgnoreCase(username)) {
            this.username = username;
        }
    }

    /**
     * Get User's Id
     * @return
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Set User's Id
     * @param userId
     */
    public void setUserId(int userId) {
        if (this.userId != userId) {
            this.userId = userId;
        }
    }

    /**
     * Get User's Rank
     * @return
     */
    public RLRank getRank() {
        return rank;
    }

    /**
     * Set User's Rank
     * @param rank
     */
    public void setRank(RLRank rank) {
        if (this.rank != rank) {
            this.rank = rank;
        }
    }

    /**
     * Return all useful information contained in this object
     * @return
     */
    @Override
    public String toString() {
        return "Player : " + this.username + "\t\t ID : " + this.userId + "\t\t Rank : " + this.rank;
    }
}
