<%-- 
    Document   : viewnote
    Created on : Sep 20, 2018, 12:45:35 PM
    Author     : 672762
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Keeper: View Mode</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        
        <h2>View Note</h2>
        
            <form method="get" action="note">
            
                <span><h3>Title:</h3> <p>${note.title}</p></span>
                
                <h3>Content:</h3> <p>${note.content}</p>
            
            </form>
                
                <a href="note?edit">Edit</a>
        
    </body>
</html>
