## Tests for countUnique

| Test case              |  Expected Result    |
|------------------------|---------------------|
| empty list             |  return 0           |
| one item               |  return 1           |
| huge list              |  return 10,000      |
| null list              | NullPointerException|  
| one item many times    |  return 1           |

## Tests for binarySearch

| Test case              |  Expected Result    |
|------------------------|---------------------|
| empty array            |  return -1          |
| one element            |  return 0           |
| array with duplicate   |  return 4           |
| huge array             |  return 8888        |  
| element not in array   |  return -1          |
| array with null element|IllegalArgumentException|
