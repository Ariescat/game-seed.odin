package com.mmorpg.framework.net;

import io.netty.channel.*;

import java.net.SocketAddress;

/**
 * @author Ariescat
 * @version 2020/2/19 14:51
 */
public class NullChannel extends AbstractChannel {

	public NullChannel() {
		super(null);
	}

	@Override
	protected AbstractUnsafe newUnsafe() {
		return null;
	}

	@Override
	protected boolean isCompatible(EventLoop loop) {
		return false;
	}

	@Override
	protected SocketAddress localAddress0() {
		return null;
	}

	@Override
	protected SocketAddress remoteAddress0() {
		return null;
	}

	@Override
	protected void doBind(SocketAddress localAddress) throws Exception {

	}

	@Override
	protected void doDisconnect() throws Exception {

	}

	@Override
	protected void doClose() throws Exception {

	}

	@Override
	protected void doBeginRead() throws Exception {

	}

	@Override
	protected void doWrite(ChannelOutboundBuffer in) throws Exception {

	}

	@Override
	public ChannelConfig config() {
		return null;
	}

	@Override
	public boolean isOpen() {
		return false;
	}

	@Override
	public boolean isActive() {
		return false;
	}

	@Override
	public ChannelMetadata metadata() {
		return null;
	}
}
