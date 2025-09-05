-------- READ ME for OOZ PROJECT ------------

LEVEL 1:

- Used individual folders/ packages to make files easier to manage
- Animal sets up move, makeSound, and identify functions as asbtracts
- Flyable interface creates fly function abstract and is used in Bird class
- Bird, Fish, and Mammal are all concrete classes overriding respective abstract methods
- Bird has flyable interface
- Main goes through examples of each object and their methods

LEVEL 2:

- Added the swimmable interface and applied it to Fish and Mammals
- Added new animals: Waterfowl and Bat
- Waterfowl has swimmable interface but extends Bird
- Bat has Flyable interface but extends animal
- Swimmable has swim function
- Allllll functions shown in main.

LEVEL 3:

- All of the work done for LEVEL 2 in the Main.java file was put in a comment. Archived so it can be saved, but otherwise not part of the program. I spent time on that!
- All files were already in packages, but now there is SUBclasses package for Waterfowl and Bat 
- Zoomanager added
- animals array in Zoomanager that is constructed in Main
- Used for loops to run functions for each animal in the array absed on user input
- Technically, the print statements (which would make up the required menu) were put in Main rather than ZooManager while the input taker is in the ZooManager. However, I prefer the print statements in Main so that they are separate from the "uglier********" parts of the code and can be adjusted easily, I like to set up the Main function as the overall flow of the program, and I count the statements the user will ALWAYS see as part of the flow. Therefore, I made an executive decision to count the small part of the scanner input as the menu, cheers.
- Lots of Java Doc, goodness
- Exception handling, functions will re-call themselves to re-promt the user, as well as informing them what they entered incorrectly.

AI RELFECTION:

- I turned it on to fix one thing and it annoyed the mess out of me ever since so I turned it back off. The "DISCOVERY" part where I realized you could cast Animal objects to their main class to perform the interface functions was where I used it. Also, it did do the auto-fill when I was making the MakeSound function for Waterfowl. The AI beat me to the honk joke, and for that it cannot be forgiven. Not really AI reflection but I would use this code in a real-world app, as I do think it sets up itself as a sort of "placeholder."
