package task_29;

public class LevelLoader {
    public void load(Level level) throws LevelTooBigException {

        if (level.getHeight() * level.getWidth() > 100000)
        {
            throw new LevelTooBigException();
        }
        else {
            System.out.println("Level loaded");
        }
    }
}
