package com.netty.client;

import java.net.InetSocketAddress;
import java.util.Date;

import com.netty.handler.EchoClientHandler;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class EchoClient {
	private final String host;
	private final int port;

	public EchoClient(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public static void main(String[] args) throws InterruptedException {
		String host = "127.0.0.1";
		int port = 8088;
		new EchoClient(host, port).start();
	}

	public void start() throws InterruptedException {
		EventLoopGroup group = new NioEventLoopGroup();
//		try {
			Bootstrap bootstrap = new Bootstrap();
			bootstrap.group(group).channel(NioSocketChannel.class).remoteAddress(new InetSocketAddress(host, port))
					.handler(new ChannelInitializer<NioSocketChannel>() {
						@Override
						protected void initChannel(NioSocketChannel ch) throws Exception {
//							ch.pipeline().addLast(new StringEncoder());
							ch.pipeline().addLast(new EchoClientHandler());
						}
					});
			Channel channel = bootstrap.connect(host,port).channel();

//			ChannelFuture future = bootstrap.connect().sync();
//			future.channel().closeFuture().sync();
			
			while (true) {
				channel.writeAndFlush(new Date() + ": hello world!");
				Thread.sleep(2000);
			}
			
//		} finally {
//			group.shutdownGracefully().sync();
//		}

	}
}
