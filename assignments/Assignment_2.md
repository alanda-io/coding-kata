# Word Count II - Agility Kata (HTTP Version)

### Task:
Count the number of words in a text using HTTP calls and `jte` templating, excluding words found in a provided list of stop words.

### Expectations:

1. **Request:**
    - **Method**: `GET`
    - **Path**: `/wordcount`
    - **Query parameters**:
        - `text` (the input text)
        - **Example**: `/wordcount?text=Mary%20had%20a%20little%20lamb`
    - Stop words are provided from a file `stopwords.txt`, which contains one stop word per line.

2. **Response (HTML)**:
    - The page should display:
        - The original text provided by the user.
        - The number of words in the text, excluding any stop words.

3. **Word Counting Rules**:
    - A word is any stretch of letters (`a-z`, `A-Z`).
    - Words listed in `stopwords.txt` are not counted.
    - Non-letter characters (e.g., numbers, punctuation) do not count as part of words.
    - Words are separated by spaces or other non-letter characters.

### Example of stopwords.txt:
```
the
a
on
off
```

### Example Interaction:

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
    <p>Number of words (excluding stop words): <strong>4</strong></p>
</body>
</html>
```
