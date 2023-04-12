package net.minecraft.server.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.network.chat.ChatType;
import net.minecraft.server.players.PlayerList;

public class EmoteCommands {
   public static void register(CommandDispatcher<CommandSourceStack> p_136986_) {
      p_136986_.register(Commands.literal("me").then(Commands.argument("action", MessageArgument.message()).executes((p_214433_) -> {
         MessageArgument.ChatMessage messageargument$chatmessage = MessageArgument.getChatMessage(p_214433_, "action");
         CommandSourceStack commandsourcestack = p_214433_.getSource();
         PlayerList playerlist = commandsourcestack.getServer().getPlayerList();
         messageargument$chatmessage.resolve(commandsourcestack).thenAcceptAsync((p_214431_) -> {
            playerlist.broadcastChatMessage(p_214431_, commandsourcestack, ChatType.EMOTE_COMMAND);
         }, commandsourcestack.getServer());
         return 1;
      })));
   }
}