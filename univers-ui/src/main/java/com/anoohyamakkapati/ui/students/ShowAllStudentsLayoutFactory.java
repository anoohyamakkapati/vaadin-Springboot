package com.anoohyamakkapati.ui.students;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.anoohyamaakapati.model.entity.Student;
import com.anoohyamakkapati.service.showstudents.ShowStudentsService;
import com.anoohyamakkapati.ui.views.UIComponentBuilder;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;

@org.springframework.stereotype.Component
public class ShowAllStudentsLayoutFactory implements UIComponentBuilder {

	private List<Student> students;
	private BeanItemContainer<Student> container;
	
	private class ShowAllStudentsLayout extends VerticalLayout {

		private Grid studentsTable;

		public ShowAllStudentsLayout init() {

			setMargin(true);
			
			container = new BeanItemContainer<Student>(Student.class, students);

			studentsTable = new Grid(container);
			studentsTable.setColumnOrder("firstName", "lastName", "age", "gender");
			studentsTable.removeColumn("id");
			studentsTable.removeColumn("university");
			studentsTable.setImmediate(true);
			
			return this;
		}

		public ShowAllStudentsLayout layout() {
			addComponent(studentsTable);
			return this;
		}

		public ShowAllStudentsLayout load() {
			students = showStudentsService.getAllStudents();
			return this;
		}
	}

	public void refreshTables() {
		students = showStudentsService.getAllStudents();
		container.removeAllItems();
		container.addAll(students);
	}

	@Autowired
	private ShowStudentsService showStudentsService;

	public Component createComponent() {
		return new ShowAllStudentsLayout().load().init().layout();
	}
}