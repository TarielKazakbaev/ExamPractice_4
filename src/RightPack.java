import java.util.Arrays;

public class RightPack extends Me{
    RightPack[] rightPacks = new RightPack[1];

    @Override
    public String toString() {
        return
                "Правый карман :" + Arrays.toString(rightPacks);
    }
}
