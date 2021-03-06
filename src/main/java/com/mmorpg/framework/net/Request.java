package com.mmorpg.framework.net;

import io.netty.buffer.ByteBuf;

/**
 * @author Ariescat
 * @version 2020/2/19 14:51
 */
public interface Request {

	short getPacketId();

	/**
	 * 获取 请求包参数字节大小 不包括packetId
	 */
	int getByteSize();

	ByteBuf getByteBuf();

	byte readByte();

	short readShort();

	int readInt();

	long readLong();

	float readFloat();

	String readString();

	void readBytes(byte[] dst);
}
