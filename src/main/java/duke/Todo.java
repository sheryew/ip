package duke;

public class Todo extends Task {
    /**
     * Returns an Todo Task Object
     *
     * @param description Task Description (String)
     */
    public Todo(String description) {
        super(description, "T");
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
