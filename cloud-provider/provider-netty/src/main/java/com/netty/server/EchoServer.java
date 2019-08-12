package com.netty.server;

import java.net.InetSocketAddress;

import com.netty.handler.EchoServerHandler;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class EchoServer {
	private final int port;

	public EchoServer(int port) {
		this.port = port;
	}

	public static void main(String[] args) throws InterruptedException {
		int port = 8088;
		new EchoServer(port).start();
		System.out.println("server...");
	}

	public void start() throws InterruptedException {
		EventLoopGroup group = new NioEventLoopGroup();
		ServerBootstrap serverBootstrap = new ServerBootstrap();
		serverBootstrap.group(group).channel(NioServerSocketChannel.class).localAddress(new InetSocketAddress(port))
				.childHandler(new ChannelInitializer<NioSocketChannel>() {
					@Override
					protected void initChannel(NioSocketChannel ch) throws Exception {
//						ch.pipeline().addLast(new StringEncoder());
						ch.pipeline().addLast(new EchoServerHandler());
					}
				}).bind(port);
		ChannelFuture f = serverBootstrap.bind().sync();
		f.channel().closeFuture().sync();

	}
}
