class Node:

    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


def insert(root, value):

    # Base case: empty position found
    if root is None:
        return Node(value)

    # Smaller value goes LEFT
    if value < root.value:
        root.left = insert(root.left, value)

    # Larger value goes RIGHT
    elif value > root.value:
        root.right = insert(root.right, value)

    # Duplicate value: do nothing
    return root


def search(root, target):

    # Value not found
    if root is None:
        return False

    # Value found
    if root.value == target:
        return True

    # Search LEFT if target is smaller
    if target < root.value:
        return search(root.left, target)

    # Search RIGHT if target is larger
    return search(root.right, target)


root = None

gamma_readings = [50, 30, 70, 20, 40, 60, 80]

for reading in gamma_readings:
    root = insert(root, reading)

print(search(root, 60))
print(search(root, 25))