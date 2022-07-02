import java.util.Arrays;

public class LeftPack extends Me{
    LeftPack [] leftPacks = new LeftPack[1];

    public LeftPack[] getLeftPacks() {
        return leftPacks;
    }

    public void setLeftPacks(LeftPack[] leftPacks) {
        this.leftPacks = leftPacks;
    }

    @Override
    public String toString() {
        return
                "Левый карман :" + Arrays.toString(leftPacks);
    }
}
