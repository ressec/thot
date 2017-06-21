/*
 * Copyright(c) 2017 - Heliosphere Corp.
 * ---------------------------------------------------------------------------
 * This file is part of the Heliosphere's project which is licensed under the 
 * Apache license version 2 and use is subject to license terms.
 * You should have received a copy of the license with the project's artifact
 * binaries and/or sources.
 * 
 * License can be consulted at http://www.apache.org/licenses/LICENSE-2.0
 * ---------------------------------------------------------------------------
 */
package org.heliosphere.thot.akka.chat.protocol;

import org.heliosphere.thot.akka.chat.client.ChatClient;

import com.heliosphere.athena.base.message.internal.IMessageContent;
import com.heliosphere.athena.base.message.internal.IMessageType;
import com.heliosphere.athena.base.message.internal.type.MessageUsageType;

/**
 * Enumeration defining the message protocol for a {@link Room}.
 * <hr>
 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse</a>
 * @version 1.0.0
 */
public enum RoomMessageProtocolType implements IMessageType
{
	/**
	 * Message sent to a {@link Room} by a {@link ChatClient} to request a {@link User} to join the room.
	 */
	ROOM_JOIN(MessageUsageType.NONE, ChatData.class), // Locale, Subject

	/**
	 * Message sent to a {@link Room} by a {@link ChatClient} to request a {@link User} to leave the room.
	 */
	ROOM_LEAVE(MessageUsageType.NONE, ChatData.class), // Locale, Subject

	/**
	 * Message sent by a {@link ChatClient} to a {@link Room} to get the list of {@link User} in the room.
	 */
	ROOM_USER_LIST(MessageUsageType.NONE, ChatData.class), // Locale, Subject

	/**
	 * Message sent by a {@link User} to a {@link Room} to get a specific {@link User} in the room.
	 */
	ROOM_USER_GET(MessageUsageType.SERVER_ONLY, ChatData.class); // Locale, Subject

	/**
	 * Message usage type.
	 */
	private final MessageUsageType usage;

	/**
	 * Content data type class.
	 */
	private final Class<? extends IMessageContent> contentClass;

	/**
	 * Creates a new enumerated value given a message data content class.
	 * <p>
	 * @param usage Message usage type.
	 * @param contentClass Message type content class.
	 */
	private RoomMessageProtocolType(final MessageUsageType usage, final Class<? extends IMessageContent> contentClass)
	{
		this.usage = usage;
		this.contentClass = contentClass;
	}

	@Override
	public final MessageUsageType getUsageType()
	{
		return usage;
	}

	@Override
	public final Class<? extends IMessageContent> getContentClass()
	{
		return contentClass;
	}
}