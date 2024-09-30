# Word Count VI - Agility Kata (HTTP Version)

### Task:
Count the number of words, unique words, and calculate the average word length using HTTP calls and `jte` templating.

### Expectations:

1. **Request:**
    - **Method**: `GET`
    - **Path**: `/wordcount`
    - **Query parameters**:
        - `text` (the input text)
        - `filename` (optional, the name of a file to read the text from)
    - Example URL (using text input):
      `/wordcount?text=Humpty-Dumpty%20sat%20on%20a%20wall.%20Humpty-Dumpty%20had%20a%20great%20fall.`

2. **Response (HTML)**:
    - The page should display:
        - The original text.
        - The number of words.
        - The number of unique words.
        - The average word length (in characters).

3. **Word Counting Rules**:
    - A word is any stretch of letters (`a-z`, `A-Z`), with hyphenated words treated as one word.
    - Non-letter characters (except hyphens) do not count as part of words.
    - Words are separated by spaces or other non-letter characters.
    - Unique words are case-insensitive.
    - The average word length is calculated by dividing the total number of characters in all counted words by the number of words.

### Example Interaction:

**Request URL**:
```
GET /wordcount?text=Humpty-Dumpty%20sat%20on%20a%20wall.%20Humpty-Dumpty%20had%20a%20great%20fall.
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
    <p>Text: <strong>Humpty-Dumpty sat on a wall. Humpty-Dumpty had a great fall.</strong></p>
    <p>Number of words: <strong>7</strong></p>
    <p>Number of unique words: <strong>6</strong></p>
    <p>Average word length: <strong>5.57</strong> characters</p>
</body>
</html>
```
