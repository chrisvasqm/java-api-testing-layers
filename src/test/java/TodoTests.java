import org.example.Todo;
import org.example.services.TodoService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

public class TodoTests {
    private TodoService service;

    @BeforeMethod
    public void setUp() {
        service = new TodoService();
    }

    @Test
    public void testGetAllTodos() {
        var todos = service.getAll();

        assertThat(todos).isNotEmpty();
    }

    @Test
    public void testPostNewTodo() {
        var todo = new Todo(1, "Title", 1, false);

        var response = service.post(todo);

        assertThat(response.getStatusCode()).isEqualTo(201);
    }
}
