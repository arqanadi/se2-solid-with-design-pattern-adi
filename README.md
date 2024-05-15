**Problem Statement**
The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Make sure you have a TestProgram that will validate the proposed refactored codes.

**UML Diagram**

![SOLIDWithDesignPatternUML](https://github.com/arqanadi/se2-solid-with-design-pattern-adi/assets/113510424/36a5729e-2316-484c-9ab9-48faf8cb572f)

