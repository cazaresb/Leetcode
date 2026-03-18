class DynamicArray {
public:
  DynamicArray(int _capacity) : length(0), capacity(_capacity) {
    // Init array
    array = new int[_capacity];
  }

  int get(int i) { return array[i]; }

  void set(int i, int n) { array[i] = n; }

  void pushback(int n) {
    if (length == capacity) {
      this->resize();
    }
    array[length] = n;
    this->length++;
  }

  int popback() {
    if (length > 0) {
      length--;
    }

    return this->array[length];
  }

  void resize() {
    int new_capacity = this->capacity * 2;
    int *new_array = new int[new_capacity];

    for (int i = 0; i < this->length; i++) {
      // Fill array
      new_array[i] = this->array[i];
    }

    // cleanup, no leaks
    delete[] this->array;

    this->array = new_array;
    this->capacity = new_capacity;
  }

  int getSize() { return length; }

  int getCapacity() { return capacity; }

private:
  int *array;
  int length;
  int capacity;
};
