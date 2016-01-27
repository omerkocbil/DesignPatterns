/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2eepatterns.mvc;

/**
 *
 * @author jan
 */
public class Test {

    public static void main(String[] args) {

        //fetch student record based on his roll no from the database
        Student model = MVCPatternDemo.retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("John");

        controller.updateView();
    }
}
