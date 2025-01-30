package main.models;

public class Task {
    public String title;
    public String description;
    public Boolean completed;

    public Task(){}

    public Task(String title, String description, Boolean completed){
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public String completedString(){
        return completed ? "x" : " ";
    }
    public void print(){
        String ln1 = String.format("|%s| %-48s |", completedString(), title);
        System.out.println(String.valueOf('-').repeat(ln1.length()));
        System.out.println(ln1);
        System.out.println(String.valueOf('-').repeat(ln1.length()));
        String text = description;
        int w = ln1.length() - 4;
        while(text.length() > w){
            System.out.println("| " + text.substring(0, w) + " |");
            text = text.substring(w);
        }
        if (!text.isEmpty()) {
            System.out.println("| " + String.format("%-48s", text) + " |");
        }
        System.out.println(String.valueOf('-').repeat(ln1.length()));
    }
}
