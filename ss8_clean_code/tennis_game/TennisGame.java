package ss8_clean_code.tennis_game;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            return getEvenScore(player1Score);
        }
        if (player1Score >= 4 || player2Score >= 4) {
            return getAdvantageOrWin(player1Score, player2Score);
        }
        return getStandardScore(player1Score, player2Score);
    }

    private static String getEvenScore(int score) {
        switch (score) {
            case LOVE: return "Love-All";
            case FIFTEEN: return "Fifteen-All";
            case THIRTY: return "Thirty-All";
            case FORTY: return "Forty-All";
            default: return "Deuce";
        }
    }

    private static String getAdvantageOrWin(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) return "Advantage player1";
        if (scoreDifference == -1) return "Advantage player2";
        return (scoreDifference >= 2) ? "Win for player1" : "Win for player2";
    }

    private static String getStandardScore(int player1Score, int player2Score) {
        return getScoreName(player1Score) + "-" + getScoreName(player2Score);
    }

    private static String getScoreName(int score) {
        switch (score) {
            case LOVE: return "Love";
            case FIFTEEN: return "Fifteen";
            case THIRTY: return "Thirty";
            case FORTY: return "Forty";
            default: return "";
        }
    }
}
