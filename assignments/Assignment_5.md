# Word Count V - Agility Kata (HTTP Version)

### Task:
Count the number of words, unique words, and treat hyphenated words as a single word (e.g., "Humpty-Dumpty" is considered one word).

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

3. **Word Counting Rules**:
    - A word is any stretch of letters (`a-z`, `A-Z`), with hyphenated words treated as a single word.
    - Non-letter characters (except hyphens) do not count as part of words.
    - Words are separated by spaces or other non-letter characters, except hyphens within words.
    - Unique words are case-insensitive.

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
</body>
</html>
```
