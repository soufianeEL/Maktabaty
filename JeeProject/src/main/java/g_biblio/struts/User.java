package g_biblio.struts;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {
	
	private String todo ;

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	/**
	 * @return
	 */
	public String execute() {
		System.out.println("==> User Action !!");
		if(todo.equals("update")){
			System.out.println("todo = "+ todo);
			return SUCCESS;
		}
		
		else 
			return ERROR;
	}
}