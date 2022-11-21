package chattranslation;

import arc.Events;
import arc.util.Log;
import mindustry.game.EventType;
import mindustry.mod.Mod;

import static mindustry.Vars.ui;

public class ChatTranslation extends Mod {
    public ChatTranslation() {

    }

    public void sendTranslatedMessage(String message) {
        ui.chatfrag.addMessage("[[[cyan]Chat translation[white]]: " + message);
        ui.chatfrag.updateChat();
    }

    public void onChatMessage(EventType.PlayerChatEvent event) {
        Log.info("[cyan]Chat translation: [white]Got chat message from: ");
        this.sendTranslatedMessage(event.message);
        if (event.player.name != null) {
            Log.info(event.player.name);
        }
        Log.info(event.message);
    }

    public void onChatMessage(EventType.ClientChatEvent event) {
        Log.info("[cyan]Chat translation: [white]Got chat message from you:");
        Log.info(event.message);
        this.sendTranslatedMessage(event.message);
    }

    @Override
    public void init() {
        // Init translation 11111
        Log.info("[cyan]Chat translation: [white]Initialising Chat Translation");

        Events.on(EventType.PlayerChatEvent.class, this::onChatMessage);
        Events.on(EventType.ClientChatEvent.class, this::onChatMessage);
    }
}