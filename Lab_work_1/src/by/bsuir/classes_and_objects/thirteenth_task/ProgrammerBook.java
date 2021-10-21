package by.bsuir.classes_and_objects.thirteenth_task;

public class ProgrammerBook {
    private int level;
    private String language;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProgrammerBook)
            return super.equals(obj) && language == ((ProgrammerBook) obj).language && level == ((ProgrammerBook) obj).level;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + language.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%s, Language: %s, Level: %d", super.toString(), language, level);
    }
}
