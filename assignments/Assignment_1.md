# Word Count I - Agility Kata (HTTP Version)

### Task:
Count the number of words in a text using HTTP calls and `jte` templating.

### Expectations:

1. **Request:**
    - **Method**: `GET`
    - **Path**: `/wordcount`
    - **Query parameter**: `text` (the input text)
    - **Example URL**: `/wordcount?text=Mary%20had%20a%20little%20lamb`

2. **Response (HTML)**:
    - The page should display:
        - The original text provided by the user.
        - The number of words in the text.

3. **Word Counting Rules**:
    - A word is any stretch of letters (`a-z`, `A-Z`).
    - Non-letter characters (e.g., numbers, punctuation) do not count as part of words.
    - Words are separated by spaces or other non-letter characters.

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
    <p>Number of words: <strong>5</strong></p>
</body>
</html>
```
