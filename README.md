# Java_fundamentals

A personal Java learning archive covering **core Java, OOP, Data Structures & Algorithms, and Design & Analysis of Algorithms (DAA)** — built up while preparing for my Sessionals exams and my dsa practive. Meant as a reference  who want a structured path through Java DSA + OOP with working code examples for every topic.

> If you're new here: start with `Object_Oriented_Programming/`, then `Dsa_Java/`, then `Desing_algorithm_analysis/`. Suggested order is in the [Study Roadmap](#study-roadmap) below.

---

## 📁 Repository Structure

```
Java_fundamentals/
├── Object_Oriented_Programming/   # Core Java OOP concepts
├── Dsa_Java/                      # Data Structures & Algorithms
├── Desing_algorithm_analysis/     # DAA lab work — DP, Greedy, Divide & Conquer
└── src/                           # Scratch/entry file
```

---

## 🧱 Object_Oriented_Programming

Core OOP concepts in Java, organized by pillar. Good starting point if you're rusty on Java basics.

| Topic | Files |
|---|---|
| **Constructors** | `oop/Constructor.java` |
| **Inheritance** | `oop/Inheritance/Box.java`, `BoxWeight.java`, `Boxprice.java`, `Main.java` |
| **Polymorphism** | `oop/Polymorhism/Shapes.java`, `Circle.java`, `Square.java`, `Triangle.java`, `Main.java` |
| **Abstraction** | `oop/Abstration/parent.java`, `son.java`, `daughter.java` |
| **Interfaces** | `oop/Abstration/interfaces/` — `Car.java`, `Engine.java`, `ElectricEngine.java`, `PowerEngine.java`, `Media.java`, `CDPlayer.java`, `Break.java` (+ `nested/` for nested interfaces) |
| **Generics** | `oop/Generics/CustomArrLis.java` — custom generic ArrayList implementation |
| **Static keyword / Inner classes** | `oop/staticExample/Human.java`, `staticBlock.java`, `InnerClasses.java` |
| **Case Studies** | `oop/Case_Study/Employee_Management_System.java`, `Library_Management_System.java` — applied OOP mini-projects |

---

## 🧮 Dsa_Java

The bulk of the repo — DSA practice organized by data structure/technique, roughly in increasing difficulty within each folder.

### Arrays
- Basics: `Reverse.java`, `Union_sorted_array.java`, `find_freq_1.java`, `max_secondmax.java`, `missing_num_iton.java`, `remove_dup_sort_Arr.java`, `subarray_sum_equalto_k.java`
- Medium: `arr_pos_neg.java`, `leader.java`, `majority_ele_nby2.java`, `next_lexi_permutation.java`, `sort_Arr_0_1_2.java` (Dutch National Flag), `sub_arr_max_len.java`, `xor_of_k.java`
- Hard: `inversion_pair.java`, `spiral_printing.java`

### Binary Search
- `Binary_Search_1D.java`, `Binary_Search_2D.java`, `Binary_2D_2.java`, `two_d_binary_search.java`
- `one_d_binary_search/`: `floor_ceil.java`, `no_times_rotated.java`, `ocuurences_bs.java`, `search_insert.java`, `search_rotated_aray.java`
- `bs_2d_Array/`: `bs_2d_array.java`, `median_2d_array.java`
- `on_ans/` (Binary Search on Answer): `agressive_cows.java`, `book_allocation.java`, `nth_root.java`, `smallest_divisor.java`, `square_root.java`

### Hashing
- `Exhashmap.java`, `chararray.java`, `intarray.java`

### Linked List
- `Insertion_Singly.java`, `Reverse_SLL.java`, `Rotate_SLL.java`, `Reorder_sll.java`, `Reverse_K_Nodes.java`, `sort_LL.java`, `insert_rec_pos.java`, `DoublyLL.java`, `CircularLL.java`

### Recursion
- Core: `intro_recur.java`, `intro_2.java`, `rev.java`, `Divide_con_findMinMax.java`, `Rotated_binary_search.java`
- Arrays: `Selection_sort.java`, `Sorted.java`, `al_search.java`, `bubble_sort.java`
- Strings: `Permutation.java`, `dice.java`, `maze.java`, `path.java`, `phone_pad_lt_17.java`, `str_with_out_char.java`, `sub_set.java`, `sub_str_with_arr.java`
- Patterns: `Triangle.java`

### Sorting
- `Sorting.java`, `Selection.java`, `Insertion_Sort.java`, `Insterting.java`, `Merge_Sort.java`, `Cyclic.java` (Cyclic Sort), `TwopointerSort.java`
- `Quick_sort/`: `Quick_sort_front.java`, `Quick_sort_mid.java`, `Quick_sort_end.java` (pivot variants)

### Stacks & Queues
- `intro_stack.java`, `custom_queue.java`, `circular_queue.java`, `sort_stack.java`, `Balancing_Paren.java`, `Balancing_para_addMin.java`, `LT_1541.java`

### Strings
- Basic: `revser_the_string.java`, `isomorphic.java`, `longest_common_prefix.java`, `longest_odd_num.java`, `remove_1st_last_braket.java`
- Medium: `longest_palindrome.java`

### Trees
- `Binary_Tree/binary_tree.java`, `binary_search_tree.java`, `Depth_first_search.java`

### Patterns
- `pattern0.java`, `pattern1.java`, `pattern2.java` — number/star pattern printing

### Maths
- `intro.java`

### `striver/` — Extra practice (Striver's SDE sheet style)
- Basic: `factors.java`, `prime_factors.java`
- Recursion: `powerset.java`, `sum_equal_to_k.java`, `sum_sub_set.java`
- Sliding Window / Two Pointer: `Max_subString_wo_repetition.java`, `fruits_in_baskets.java`
- Stack: `infix_to_postfix.java`, `infix_to_prefix.java`, `postfix_to_infix.java`, `postfix_to_prefix.java`, `prefix_to_infix.java`, `prefix_to_postfix.java`
- Monotonic Stack: `next_greater.java`

---

## 📐 Desing_algorithm_analysis

DAA lab exercises — algorithm design paradigms with complexity analysis in mind.

| Lab / Category | Files |
|---|---|
| **Lab 1 — Basics** | `first_program.java`, `binary_search.java`, `gcd.java`, `factors.java`, `Towers_Hanoi.java` |
| **Lab 2 — Strings & Sorting** | `String_sub_String.java`, `bubble_sort.java`, `string_rev_data_structure.java` |
| **Lab 3 — Divide & Conquer** | `findMinMax.java`, `matrixmul.java` |
| **Lab 4 — Graphs & D&C** | `dijkstra.java`, `strassen_Alrathim.java` (Strassen's Matrix Multiplication) |
| **Dynamic Programming** | `depth_first_search.java`, `nqueens.java` (N-Queens), `sum_of_sets_target.java` (Subset Sum) |
| **Greedy** | `Dijkstra_algo.java`, `Prim.java` (Prim's MST), `coin_change.java`, `knap_sack.java` (Fractional Knapsack) |

---

## 🗺️ Study Roadmap

For a junior working through this repo top to bottom:

1. **OOP fundamentals** → `Object_Oriented_Programming/` (Constructor → Inheritance → Polymorphism → Abstraction → Interfaces → Generics → Case Studies)
2. **DSA basics** → `Dsa_Java/src/` in this order: Patterns → Maths → Arrays (basic → medium → hard) → Recursion → Sorting → Binary Search → Hashing → Linked List → Stacks & Queues → Strings → Trees
3. **Extra practice** → `Dsa_Java/src/striver/` once comfortable with the above
4. **Algorithm design & complexity** → `Desing_algorithm_analysis/` (Lab 1 → Lab 2 → Lab 3 → Lab 4 → Greedy → DP)

## ▶️ Running the Code

Each `.java` file is self-contained and can be compiled/run individually:

```bash
javac ClassName.java
java ClassName
```

If you're using IntelliJ IDEA (the repo includes `.idea`/`.iml` files), just open the relevant module folder (`Dsa_Java`, `Object_Oriented_Programming`, or `Desing_algorithm_analysis`) as a project — each has its own `.iml`.

## 📌 Notes

- No external dependencies — pure Java (JDK 8+ should work fine).
- Naming isn't always perfectly consistent (this grew organically while learning) — use folder/topic names as the primary guide rather than exact file names.
- Contributions/PRs from juniors adding their own solved variants are welcome — keep new problems in the matching topic folder.

## 👤 Author

**Tanuj Manikanta** 
