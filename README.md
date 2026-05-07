# Introduction: A simple program guaranteed to produce a strong password
This program generates a strong password using `java.security.SecureRandom` to produce a non-deterministic, unpredictable number that determines the password's variable length. It includes features such as:
- Implementation of an OOP principle: encapsulation
- Instant generation of a new, strong password with a random length
- No user input required

## Running the program in the terminal (Arch Linux)
To run this program directly from your terminal, follow these instructions:
```bash
$ # check if you have java in your computer
$ java --version
penjdk version "x.x.x" 2026-04-21
OpenJDK Runtime Environment (build x.x.x)
OpenJDK 64-Bit Server VM (build x.x.x, mixed mode, sharing)
```
if it did not appear, then you must download java from: [https://www.oracle.com/java/technologies/downloads/]
however, if it showed, then proceed with the instructions
```bash
# navigate to your java files:

$ cd /your/files/path
# then, compile them:

$ javac passwordMethods.java PasswordProject.java
```
After compilation, create an executable script located in `~/.local/bin`:
```bash
# Create the bin directory if it doesn't already exist
$ mkdir -p ~/.local/bin

# Create and open a new script file
$ nano ~/.local/bin/your_cript_name
```
Add the following lines inside `~/local/bin/script_name`:
```bash
#!/usr/bin/env bash
cd /your/file/path/Name_of_file
java PasswordProject
```
Now, Make that file executable by typing the following command:
```bash
$ chmod +x /your/file/path
```
Finally, add the following line to your `~/.bashrc` file to ensure the directory is in your system PATH and prevent "command not found" errors, then reload your shell configuration:
```bash
export PATH="$HOME/.local/bin:$PATH"
```
Then run: `source ~/.bashrc` \
Now, whenever you type your script name (e.g., pass), it will instantly generate a strong, random password.
Enjoy using the program!

## Example usage: 
```bash
$ pass

The password is: 6I3gD&ZiO5(_Z_fPP4xM

```
## Running the program in the CMD (Windows)
Check if java exists on your device, if does not exist, then head towards [https://www.oracle.com/java/technologies/downloads/]
Head towards java files in the desired location:
```cmd
C:\> cd C:\your\file\path
```
Compile them using javac fileName.java ...
After that, create a batch file with any name you'd like (e.g. generator.bat). Open that file in notepad (or any editor) and type the following lines:
```notepad
@echo off
java "C:>\your\file\path"
```
Finally, move the batch file to `C:\Windows\System32`, reset the cmd and type the batch name.
## Enhances and improvements
There is a room for enhances and improvements. If you have any suggestions in mind for improving the code, please contact me on my twitter account: [https://x.com/O2H2_e]
