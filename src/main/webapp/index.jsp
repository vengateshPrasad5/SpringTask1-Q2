<html>
    <head>
        <title>Feedback Form</title>
    <style>
            body {
                font-family: Arial, sans-serif;
            }
            .container {
                width: 50%;
                margin: 0 auto;
                text-align: center;
            }
            form {
                text-align: left;
            }
            input[type="text"], textarea {
                width: 100%;
                padding: 8px;
                margin: 5px 0;
                box-sizing: border-box;
            }
            input[type="submit"] {
                width: 100%;
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }
            input[type="submit"] {
             font-size: 16px;
            }
            input[type="submit"]:hover {
                background-color: #45a049;
            }
        </style>
    </head>

    <body>
        <div class="container">
            <h4>Feedback Form</h4>
            <form action="add" method="post">
                Your Name : <input type="text" name="name"/><br><br>
                Book Name : <input type="text" name="bookname"/><br><br>
                <div class="formfield">
                    <label for="feedback">Feedback :</label>
                    <textarea rows="4" cols="20" name="feedback">Your Feedback here...</textarea><br><br>
                </div>
                <input type="submit" value="Submit"/>
            </form>
        </div>
    </body>
</html>
