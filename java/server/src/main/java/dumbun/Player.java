package dumbun;

public class Player {
    String id;
    String accountId;
    String puuid;
    String name;
    int profileIconId;
    String revisionDate;
    int summonerLevel;

    @Override
    public String toString() {
        return "dumbun.Player{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", puuid='" + puuid + '\'' +
                ", name='" + name + '\'' +
                ", profileIconId=" + profileIconId +
                ", revisionDate='" + revisionDate + '\'' +
                ", summonerLevel=" + summonerLevel +
                '}';
    }
}
