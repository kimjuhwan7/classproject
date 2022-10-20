package dept;

import java.util.HashMap;
import java.util.Map;

import dept.controller.Controller;
import dept.controller.DeleteController;
import dept.controller.ExitController;
import dept.controller.InsertController;
import dept.controller.SelectByController;
import dept.controller.SelectController;
import dept.controller.UpdateController;

public class Commend {
	public Map<Integer, Controller> commend;

	public Commend() {
		commend = new HashMap<>();

		commend.put(1, new SelectController());
		commend.put(2, new SelectByController());
		commend.put(3, new InsertController());
		commend.put(4, new UpdateController());
		commend.put(5, new DeleteController());
		commend.put(6, new ExitController());
	}
}
