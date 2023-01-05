package xnopre;

import java.util.List;

public interface Filter {
    List<User> doTheJob(List<User> users);
}
