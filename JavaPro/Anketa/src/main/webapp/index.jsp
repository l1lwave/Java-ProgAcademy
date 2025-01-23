<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <title>Prog.kiev.ua</title>
    </head>
    <body>
        <form action="/anketa" method="POST">
            <br/><input type="text" name="input_name"/> input name
            <br/><input type="text" name="input_surname"/> input surname
            <br/><input type="text" name="input_age"/> input age

            <br/>Do you like Cats?
            <br/><img src="img/img.png" alt="" style="width: 100px;">
            <br/><input type="radio" name="question1" value="yes" /> Yes
            <br/> <input type="radio" name="question1" value="no" /> No
            <br/>Do you like Dogs?
            <br/><img src="img/img_1.png" alt="" style="width: 100px;">
            <br/><input type="radio" name="question2" value="yes" /> Yes
            <br/> <input type="radio" name="question2" value="no" /> No
            <br/><input type="submit" />
        </form>
    </body>
</html>
