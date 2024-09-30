# Word Count III - Agility Kata (HTTP Version)

### Task:
Count the number of words in a text using HTTP calls and `jte` templating. The text can either be provided directly via a query parameter, read from a filename, or uploaded via an HTTP file upload. If no filename or file is provided, the application will count words from the text input.
The file can be saved anywhere on the computer, but must be readable for the application. It does not need to but can be persisted across restarts. 
### Expectations:

1. **Request:**
    - **Method 1**: `GET`
        - **Path**: `/wordcount`
        - **Query parameters**:
            - `text` (the input text, if no file is provided)
            - `filename` (optional, the name of a file to read the text from)
        - If `filename` is provided, the text is read from the file.
        - If `filename` is not provided, the application uses the `text` parameter.
    - **Method 2**: `POST`
        - **Path**: `/wordcount/upload`
        - **Form Data**:
            - `file` (the uploaded text file)
        - The application reads the uploaded file and counts the words in the text.

   **Example URL (using text input)**:  
   `/wordcount?text=Mary%20had%20a%20little%20lamb`

   **Example URL (using filename)**:  
   `/wordcount?filename=mytext.txt`

   **Example HTTP POST (with file upload)**:
    ```
    POST /wordcount/upload
    Content-Type: multipart/form-data
    Form Data:
    - file: [selected_file]
    ```

2. **Response (HTML)**:
    - The page should display:
        - The text (either from the query, file, or uploaded file).
        - The number of words in the text.

3. **Word Counting Rules**:
    - A word is any stretch of letters (`a-z`, `A-Z`).
    - Non-letter characters (e.g., numbers, punctuation) do not count as part of words.
    - Words are separated by spaces or other non-letter characters.

### Example Interaction (with text input):

**Request URL**:
```
GET /wordcount?text=Mary%20had%20a%20little%20lamb
```

**Response (HTML page)**:
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Word Count Result</title>
</head>
<body>
    <h1>Word Count</h1>
    <p>Text: <strong>Mary had a little lamb</strong></p>
    <p>Number of words: <strong>5</strong></p>
</body>
</html>
```

### Example Interaction (with file input):

Assume `mytext.txt` contains:
```
Mary had
a little
lamb
```

**Request URL**:
```
GET /wordcount?filename=mytext.txt
```

**Response (HTML page)**:
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Word Count Result</title>
</head>
<body>
    <h1>Word Count</h1>
    <p>Text: <strong>Mary had a little lamb</strong></p>
    <p>Number of words: <strong>4</strong></p>
</body>
</html>
```

### Example Interaction (with file upload):

Assume the uploaded file contains:
```
Mary had
a little
lamb
```

**POST request:**
```
POST /wordcount/upload
Content-Type: multipart/form-data
Form Data:
- file: mytext.txt
```

**Response (HTML page)**:
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Word Count Result</title>
</head>
<body>
<h1>Word Count</h1>
<p>Text: <strong>Mary had a little lamb</strong></p>
<p>Number of words: <strong>4</strong></p>
</body>
</html>
```
