/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 672762
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        //read content
        String title = br.readLine();
        String content = br.readLine();
        
        //Construct a note object
        Note note = new Note(title,content);
        
        //check if edit has been made
        if(request.getParameter("edit") != null) {
            request.setAttribute("note", note);
            br.close();
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        
        //display note
        request.setAttribute("note", note);
        br.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        //create a path to the note.txt and write to the file
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 

        //Write new contents to the file
        pw.write(title + "\n" + content);
        
        
        //Create new note object
        Note note = new Note(title, content);
        request.setAttribute("note", note);
        pw.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);  
    }
}
