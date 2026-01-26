package com.jsonpractice.json_practice;

public class Censor {

    // mask team name
    public static String maskTeamName(String team) {
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }

    // redact player name
    public static String redactPlayer() {
        return "REDACTED";
    }
}
