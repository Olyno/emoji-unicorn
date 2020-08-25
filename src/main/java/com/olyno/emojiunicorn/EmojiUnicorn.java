package com.olyno.emojiunicorn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class EmojiUnicorn {

    private ArrayList<Emoji> emojis = new ArrayList<>();

    public EmojiUnicorn() {
        String emojisContent = getContentFromUrl("https://raw.githubusercontent.com/Olyno/emojis-list/master/emojis.json");
        Gson gson = new GsonBuilder().create();
        Type emojisListType = new TypeToken<ArrayList<Emoji>>() {}.getType();
        this.emojis = gson.fromJson(emojisContent, emojisListType);
    }

    /**
     * Get an emoji from any existing value.
     * 
     * @param value The value to find the emoji
     * @return The emoji found
     */
    public Emoji getEmoji(String value) {
        return emojis
            .stream()
            .filter(emoji -> emoji.getEmoji() == value 
                || emoji.getUnicode() == value 
                || emoji.getName() == value 
                || emoji.getNameUrl() == value 
                || Arrays.asList(emoji.getShortNames()).contains(":" + value.replaceAll("(^\\:|\\:$)", "") + ":")
            )
            .collect(Collectors.toList())
            .get(0);
    }

    /**
     * Get all emojis.
     * 
     * @return All emojis
     */
    public ArrayList<Emoji> getEmojis() {
        return emojis;
    }

    private String getContentFromUrl(String contentUrl) {
        try {
            URL url = new URL(contentUrl);
            BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder result = new StringBuilder();
            String i;
            while ((i = read.readLine()) != null)
                result.append(i);
            read.close();
            return result.toString();
        } catch (IOException ignore) { }
        return null;
    }
    
}
