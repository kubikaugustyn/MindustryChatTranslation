# Mindustry chat translation
- Mindustry mod
- Programmed in Java

## Functionality
This mod has settings, where you can choose language you speak and enable command.

Every chat message has prefix, in one of these formats:
- ```(<HEX MESSAGE ID>)``` e.g. ```(7e2b0f)```
- ```(<HEX MESSAGE ID>:<FROM LANG>-><TO LANG>)``` e.g. ```(7e2b0f:RUS->EN)```

### To use it 
- In game chat type enable command if mod isn't enabled
- Now any chat message you receive is sent to Google Translate API to analyze and translate, that result, if it isn't in language you set as language you speak is sent to game chat under the original message e.g. ```(a7b20d)[Player 1]: Привет```, after that another message will come: ```(a7b20d:RUS->EN)[Player 1]: Hello```
- If you want to send message for example in Russian, type your message in language you speak with RUS prefix, e.g. ```RUS Hello world```, that message will be sent in Russian, and you'll be informed in game chat about the original and translated message.
