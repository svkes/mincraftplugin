# Minecraft Custom Command Plugin
* A Minecraft plugin written in Java using the Spigot API that provides custom commands for server hosts to implement in their servers.

# Features
* Adds custom commands to the Minecraft server.
* Easy-to-use interface for configuring and adding new commands.
* Option to set command permissions.
* Supports various command types, including player commands, console commands, and server commands.
# Prerequisites
* A Minecraft server running Spigot.
* Java SE Development Kit 8 or later.
# Installation
* Clone the repository to your local machine.
* Build the plugin using the following command: ./gradlew build.
* Copy the compiled plugin JAR file to the plugins directory of your Minecraft server.
* Restart the server to enable the plugin.
# Usage
* Configure the plugin by editing the config.yml file in the plugins/CustomCommand directory.
* Add new custom commands by adding entries to the commands section of the config.yml file.
* Restart the server to apply the changes.
* The custom commands will be available for players to use in-game.
# Configuration File Format
* The config.yml file contains the configuration for the plugin. The file has the following format:

```yml
commands:
  command1:
    type: player
    permission: custom.command1
    execution: say hello world
  command2:
    type: console
    execution: say hello world
  command3:
    type: server
    execution: say hello world
```
The commands section contains a list of custom commands.
The type field specifies the type of the command (player, console, or server).
The permission field specifies the permission required to execute the command (optional).
The execution field specifies the command execution string.
