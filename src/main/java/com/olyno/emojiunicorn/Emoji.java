package com.olyno.emojiunicorn;

public class Emoji {

    private String name;
    private String nameUrl;
    private String emoji;
    private String unicode;
    private String[] shortNames;

    /**
     * Get the name of the emoji
     * 
     * @return The name of the emoji
     */
    public String getName() {
        return name;
    }

    /**
     * Get short names of an emoji.
     * Example: unicorn -> :unicorn:
     * 
     * @return All short names of the emoji
     */
    public String[] getShortNames() {
        return shortNames;
    }

    /**
     * Get the unicode of an emoji.
     * Example: unicorn -> U+1F984
     * 
     * @return The unicode of the emoji
     */
    public String getUnicode() {
        return unicode;
    }


    /**
     * Get the emoji of an emoji.
     * Example: unicorn -> 🦄
     * 
     * @return The emoji of the emoji
     */
    public String getEmoji() {
        return emoji;
    }


    /**
     *  Get the name url of an emoji.
     * Example: unicorn -> unicorn
     * 
     * @return The name url of emojipedia of the emoji
     */
    public String getNameUrl() {
        return nameUrl;
    }

}