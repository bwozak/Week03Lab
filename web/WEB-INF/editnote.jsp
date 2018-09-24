<%-- 
    Document   : editnote
    Created on : Sep 20, 2018, 12:46:20 PM
    Author     : 672762
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper: Edit Mode</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>Edit Note</h2>
        
            <form method="post" action="note">
                
                <span><h3>Title: </h3> <input type="text" value="${note.title}" name="title"></span> <br>
                <h3>Content: </h3> <br> <textarea rows="4" cols="40" name="content">${note.content}</textarea>
                <br>
                <input type="submit" value="Submit">
                
            </form>
                
                
    </body>
</html>
