import java.util.List;

public abstract class Actor {
    abstract public void Act(List<Actor> newActors);
    abstract public boolean isActive();
}
