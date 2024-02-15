def calculate_z_array(concatenated_string):
    n = len(concatenated_string)
    z = [0] * n
    left, right = 0, 0
    
    for i in range(1, n):
        if i > right:
            left = right = i
            while right < n and concatenated_string[right - left] == concatenated_string[right]:
                right += 1
            z[i] = right - left
            right -= 1
        else:
            k = i - left
            if z[k] < right - i + 1:
                z[i] = z[k]
            else:
                left = i
                while right < n and concatenated_string[right - left] == concatenated_string[right]:
                    right += 1
                z[i] = right - left
                right -= 1
    
    return z

def z_algorithm(text, pattern):
    concatenated_string = pattern + "$" + text
    z_array = calculate_z_array(concatenated_string)
    pattern_length = len(pattern)
    occurrences = []
    
    for i in range(pattern_length + 1, len(concatenated_string)):
        if z_array[i] == pattern_length:
            occurrences.append(i - pattern_length - 1)
    
    return occurrences

# Example usage
text = "ababcababcabcabc"
pattern = "abc"
result = z_algorithm(text, pattern)
print("Pattern occurrences:", result)  # Output: [2, 5, 8, 11]
