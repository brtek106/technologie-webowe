<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JavaCzat</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <fieldset id="firstFieldset">
        <h1>Witaj na JavaCzacie!</h1>
        <p>Poniżej widzisz historię konwersacji, możesz do niej dołączyć</p>
    </fieldset>
   <fieldset id="secondFieldset">
       <form>
           <p>Nie przesłano jeszcze żadnej wiadomości. Rozpocznij konwersację.</p>
           <div>
               <textarea rows="5" placeholder="Twoja wiadomość"></textarea><br>
           </div>
           <div>
               <label for="nickname"></label>
               <input id="nickname" placeholder="Twoja nazwa">
           </div>
           <input type="submit" value="Wyślij">
       </form>
   </fieldset>

</body>
</html>