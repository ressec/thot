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
package org.heliosphere.thot.akka.chat.server.lobby;

import java.util.List;
import java.util.Locale;

import com.heliosphere.athena.base.message.internal.IMessageProtocol;

public class LobbyMessageProtocol
{
	/**
	 * Message used to get the available list of lobbies.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyList implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * User.
		 */
		private final String user;

		/**
		 * Lobbies.
		 */
		private final List<Locale> lobbies;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param user User.
		 * @param lobbies Lobbies.
		 */
		public LobbyList(String user, List<Locale> lobbies)
		{
			this.user = user;
			this.lobbies = lobbies;
		}

		/**
		 * Returns the user.
		 * <hr>
		 * @return User.
		 */
		public final String getUser()
		{
			return user;
		}

		/**
		 * Returns the lobbies.
		 * <hr>
		 * @return Lobbies.
		 */
		public final List<Locale> getLobbies()
		{
			return lobbies;
		}
	}

	/**
	 * Message used to create a new lobby.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyCreate implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * User.
		 */
		private final String user;

		/**
		 * Lobby's locale.
		 */
		private final Locale lobby;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param user User.
		 * @param lobby Lobby's locale.
		 */
		public LobbyCreate(String user, Locale lobby)
		{
			this.user = user;
			this.lobby = lobby;
		}

		/**
		 * Returns the user.
		 * <hr>
		 * @return User.
		 */
		public final String getUser()
		{
			return user;
		}

		/**
		 * Returns the lobby's locale.
		 * <hr>
		 * @return Locale.
		 */
		public final Locale getLobby()
		{
			return lobby;
		}
	}

	/**
	 * Message used to confirm a lobby has been created.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyCreated implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * Lobby's locale.
		 */
		private final Locale lobby;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param lobby Lobby's locale.
		 */
		public LobbyCreated(Locale lobby)
		{
			this.lobby = lobby;
		}

		/**
		 * Returns the lobby's locale.
		 * <hr>
		 * @return Locale.
		 */
		public final Locale getLobby()
		{
			return lobby;
		}
	}

	/**
	 * Message used to delete a lobby.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyDelete implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * User.
		 */
		private final String user;

		/**
		 * Lobby's locale.
		 */
		private final Locale lobby;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param user User.
		 * @param lobby Lobby's locale.
		 */
		public LobbyDelete(String user, Locale lobby)
		{
			this.user = user;
			this.lobby = lobby;
		}

		/**
		 * Returns the user.
		 * <hr>
		 * @return User.
		 */
		public final String getUser()
		{
			return user;
		}

		/**
		 * Returns the lobby's locale.
		 * <hr>
		 * @return Locale.
		 */
		public final Locale getLobby()
		{
			return lobby;
		}
	}

	/**
	 * Message used to confirm a lobby has been deleted.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyDeleted implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * Lobby's locale.
		 */
		private final Locale lobby;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param lobby Lobby's locale.
		 */
		public LobbyDeleted(Locale lobby)
		{
			this.lobby = lobby;
		}

		/**
		 * Returns the lobby's locale.
		 * <hr>
		 * @return Locale.
		 */
		public final Locale getLobby()
		{
			return lobby;
		}
	}

	/**
	 * Message used to join a lobby.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyJoin implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * User.
		 */
		private final String user;

		/**
		 * Lobby's locale.
		 */
		private final Locale lobby;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param user User.
		 * @param lobby Lobby's locale.
		 */
		public LobbyJoin(String user, Locale lobby)
		{
			this.user = user;
			this.lobby = lobby;
		}

		/**
		 * Returns the user.
		 * <hr>
		 * @return User.
		 */
		public final String getUser()
		{
			return user;
		}

		/**
		 * Returns the lobby's locale.
		 * <hr>
		 * @return Locale.
		 */
		public final Locale getLobby()
		{
			return lobby;
		}
	}

	/**
	 * Message used to confirm a user has joined a lobby.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyJoined implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * User.
		 */
		private final String user;

		/**
		 * Lobby's locale.
		 */
		private final Locale lobby;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param user User.
		 * @param lobby Lobby's locale.
		 */
		public LobbyJoined(String user, Locale lobby)
		{
			this.user = user;
			this.lobby = lobby;
		}

		/**
		 * Returns the user.
		 * <hr>
		 * @return User.
		 */
		public final String getUser()
		{
			return user;
		}

		/**
		 * Returns the lobby's locale.
		 * <hr>
		 * @return Locale.
		 */
		public final Locale getLobby()
		{
			return lobby;
		}
	}

	/**
	 * Message used to to request a user to leave a lobby.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyLeave implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * User.
		 */
		private final String user;

		/**
		 * Lobby's locale.
		 */
		private final Locale lobby;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param user User.
		 * @param lobby Lobby's locale.
		 */
		public LobbyLeave(String user, Locale lobby)
		{
			this.user = user;
			this.lobby = lobby;
		}

		/**
		 * Returns the user.
		 * <hr>
		 * @return User.
		 */
		public final String getUser()
		{
			return user;
		}

		/**
		 * Returns the lobby's locale.
		 * <hr>
		 * @return Locale.
		 */
		public final Locale getLobby()
		{
			return lobby;
		}
	}

	/**
	 * Message used to confirm a user has left a lobby.
	 * <hr>
	 * @author <a href="mailto:christophe.resse@gmail.com">Christophe Resse - Heliosphere</a>
	 * @version 1.0.0
	 */
	public final static class LobbyLeft implements IMessageProtocol
	{
		/**
		 * Default serialization identifier.
		 */
		private static final long serialVersionUID = 1L;

		/**
		 * User.
		 */
		private final String user;

		/**
		 * Lobby's locale.
		 */
		private final Locale lobby;

		/**
		 * Creates a new message.
		 * <hr>
		 * @param user User.
		 * @param lobby Lobby's locale.
		 */
		public LobbyLeft(String user, Locale lobby)
		{
			this.user = user;
			this.lobby = lobby;
		}

		/**
		 * Returns the user.
		 * <hr>
		 * @return User.
		 */
		public final String getUser()
		{
			return user;
		}

		/**
		 * Returns the lobby's locale.
		 * <hr>
		 * @return Locale.
		 */
		public final Locale getLobby()
		{
			return lobby;
		}
	}
}
