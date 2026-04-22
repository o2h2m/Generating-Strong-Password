# Introduction: A simple program guaranteed to produce a strong password
This program generates a strong password using `java.security.SecureRandom` to produce a non-deterministic, unpredictable number that determines the password's variable length. It includes features such as:
- Implementation of an OOP principle: encapsulation
- Instant generation of a new, strong password with a random length
- No user input required

## Running the program in the terminal (Arch Linux)
To run this program directly from your terminal, follow these instructions:
```bash
$ cd /your/file/path
# Compile the source files
$ javac PasswordProject.java PasswordMethods.java
```
After compilation, create a new executable script in `~/.local/bin/`:
```bash
# Create the bin directory if it doesn't already exist
$ mkdir -p ~/.local/bin
# Create and open a new script file
$ nano ~/.local/bin/your_script_name
```
Add the following lines to the file:
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
## Enhances and improvements
There is a room for enhances and improvements. If you have any suggestions in mind for improving the code, please contact me on my twitter account: [https://x.com/O2H2_e]
