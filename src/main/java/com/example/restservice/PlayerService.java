package com.example.restservice;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlayerService {

    private static final String API_URL = "https://free-nba.p.rapidapi.com/players/";

    public Player getPlayerById(int playerId) {
        String url = API_URL + playerId;
        // Puedes personalizar este código según la forma en que quieras consumir la API
        RestTemplate restTemplate = new RestTemplate();
        Player player = restTemplate.getForObject(url, Player.class);
        return player;
    }
}
