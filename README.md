## When to Use IntArrayList vs IntVector

- **IntArrayList** grows by 50% each time. Use it when adding elements gradually to save memory:

```java
IntList list = new IntArrayList();
for (int i = 0; i < 1000; i++) {
    list.add(i);
}
```

- **IntVector** doubles its size each time. Use it for fast or bulk additions to reduce resizing overhead:
```java
IntList list = new IntVector();
for (int i = 0; i < 1000; i++) {
    list.add(i);
}
```
| Scenario         | Recommended  |
| ---------------- | ------------ |
| Gradual growth   | IntArrayList |
| Fast/bulk growth | IntVector    |

