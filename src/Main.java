import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BaseballPlayer baseballplayer1 = new BaseballPlayer("yamada", 30, "ヤクルト");
        BaseballPlayer baseballplayer2 = new BaseballPlayer("tanaka", 34, "楽天");
        BaseballPlayer baseballplayer3 = new BaseballPlayer("yasuda", 23, "ロッテ");
        BaseballPlayer baseballplayer4 = new BaseballPlayer("suzuki", 33, "楽天");
        BaseballPlayer baseballplayer5 = new BaseballPlayer("ootani", 28, "エンゼルス");

        List<BaseballPlayer> baseballPlayers = new ArrayList<>();
        baseballPlayers.add(baseballplayer1);
        baseballPlayers.add(baseballplayer2);
        baseballPlayers.add(baseballplayer3);
        baseballPlayers.add(baseballplayer4);
        baseballPlayers.add(baseballplayer5);
        
        List<BaseballPlayer> rakuten = baseballPlayers.stream()
                .filter(teams -> "楽天".equals(teams.getTeam()))
                .sorted(Comparator.comparing(BaseballPlayer::getName))
                .toList();
        System.out.println(rakuten);
    }
}
