public abstract class Person implements Identifiable {
    private static int nextID = 1000;

    protected String id;
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.id = this.getClass().getSimpleName().substring(0, 1) + nextID++;
        this.name = name;
        this.email = email;
    }

    @Override
    public String getID() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void assignCourse(String courseName);
}