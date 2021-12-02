import static com.raylib.Jaylib.RAYWHITE;
import static com.raylib.Jaylib.VIOLET;
import static com.raylib.Raylib.*;

public class Ecosystem {
    public static void main(String args[]) {
        InitWindow(Config.JUNGLE_WIDTH,Config.JUNGLE_HEIGHT, "Jungle Webstart");
        SetTargetFPS(60);

        while (!WindowShouldClose()) {
            ClearBackground(RAYWHITE);

            DrawFPS(20, 20);
            EndDrawing();
        }
        CloseWindow();
    }
}