package Lesson5.HomeWorke.Task2FileSystem;

public abstract class NamedFSItem implements FSItem {

    private String name;

    public NamedFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
