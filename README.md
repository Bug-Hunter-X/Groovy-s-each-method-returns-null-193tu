# Groovy's `each` Method Returns Null

This example demonstrates a common issue in Groovy where the `each` method on collections returns `null`. This can lead to unexpected behavior and `NullPointerExceptions` if not handled carefully.

**Problem:** The `each` method iterates over the collection and applies the closure to each element, but it doesn't return the modified collection.  It returns `null`.

**Solution:** Use methods like `collect` or `collect { ... }` which will return a new list containing the transformed elements.  Alternatively, create a new list and add to it within the `each` loop if you need side effects within the loop and want to manage the return value differently.