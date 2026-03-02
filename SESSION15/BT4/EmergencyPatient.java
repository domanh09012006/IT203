package SESSION15.BT4;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority;
    private int order;

    public EmergencyPatient(String id, String name, int priority, int order) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getOrder() {
        return order;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        String type = (priority == 1) ? "Cap cuu" : "Thuong";
        return "ID: " + id + " | Ten: " + name + " | Muc do: " + type;
    }
}