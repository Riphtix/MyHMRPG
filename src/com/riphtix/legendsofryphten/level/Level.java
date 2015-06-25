package com.riphtix.legendsofryphten.level;

import com.riphtix.legendsofryphten.gfx.Colors;
import com.riphtix.legendsofryphten.gfx.Screen;

public class Level {

    private byte[] tiles;
    public int width;
    public int height;

    public Level(int width, int height) {
        tiles = new byte[width * height];
        this.width = width;
        this.height = height;
        this.generateLevel();
    }

    public void generateLevel() {
        for (int y = 0; y < 32; y++) {
            for (int x = 0; x < 32; x++) {
                tiles[x + y * width] = Tile.GRASS.getId();
            }
        }
    }

    public void renderTiles(Screen screen, int xOffset, int yOffset){
        if(xOffset < 0){
            xOffset = 0;
        }
        if(xOffset < ((width << 3) - screen.width)){
            xOffset = ((width << 3) - screen.width);
        }
        if(yOffset < 0){
            yOffset = 0;
        }
        if(yOffset < ((height << 3) - screen.width)){
            yOffset = ((height << 3) - screen.width);
        }

        screen.setOffset(xOffset, yOffset);

        for(int y = 0)
    }
}
