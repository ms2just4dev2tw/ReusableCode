/**
 * <h2>网络</h2>
 * 
 * <h3>Low Level API</h3>
 * 
 * Addresses, which are networking identifiers, like IP addresses.
 * <ul>
 * 	<li>{@link java.net.InetAddress IP 地址的抽象类} </li>
 * 	<li>{@link java.net.Inet4Address IPv4 地址类}</li>
 * 	<li>{@link java.net.Inet6Address IPv6 地址类}</li>
 * </ul>
 * 
 * Sockets, which are basic bidirectional data communication mechanisms.
 * <ul>
 * 	<li>{@link java.net.Socket TCP 客户端 API}</li>
 * 	<li>{@link java.net.ServerSocket TCP 服务端 API}</li>
 * 	<li>{@link java.net.DatagramSocket UDP 终端 API}, 用于发送和接收{@link java.net.DatagramPacket 数据报}</li>
 * 	<li>{@link java.net.MulticastSocket 用于处理组播的 DatagramSocket 子类}</li>
 * </ul>
 * 
 * Interfaces, which describe network interfaces.
 * <ul>
 * 	<li>{@link java.net.NetworkInterface 网络接口类} </li>
 * </ul>
 * 
 * 
 * <h3>High Level API</h3>
 * 
 * URIs, which represent Universal Resource Identifiers.
 * <ul>
 * 	<li>{@link java.net.URI }</li>
 * 	<li></li>
 * 	<li></li>
 * </ul>
 * 
 * URLs, which represent Universal Resource Locators.
 * <ul>
 * 	<li>{@link java.net.URL }</li>
 * 	<li></li>
 * 	<li></li>
 * </ul>
 * 
 * Connections, which represents connections to the resource pointed to by URLs.
 * <ul>
 * 	<li>{@link java.net.URLConnection }</li>
 * 	<li>{@link java.net.HttpURLConnection }</li>
 * </ul>
 * 
 * <h3><a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/doc-files/net-properties.html">Networking Properties</a></h3>
 * 
 * IPv4 / IPv6
 * <ul>
 * 	<li>java.net.preferIPv4Stack (default: false)</li>
 * 	<li>java.net.preferIPv6Addresses (default: false)</li>
 * </ul>
 * 
 * Proxies
 * <ul>
 * 	<li>HTTP
 * 		<ul>
 * 			<li>http.proxyHost (default: <none>)</li>
 * 			<li>http.proxyPort (default: 80)</li>
 * 			<li>http.nonProxyHosts (default: localhost|127.*|[::1])</li>
 * 		</ul>
 * 	</li>
 * 	<li>HTTPS
 * 		<ul>
 * 			<li>https.proxyHost(default: <none>)</li>
 * 			<li>https.proxyPort (default: 443)</li>
 * 		</ul>
 * 	</li>
 * 	<li>FTP
 * 		<ul>
 * 			<li>ftp.proxyHost(default: <none>)</li>
 * 			<li>ftp.proxyPort (default: 80)</li>
 * 			<li>ftp.nonProxyHosts (default: localhost|127.*|[::1])</li>
 * 		</ul>
 * 	</li>
 * 	<li>SOCKS
 * 		<ul>
 * 			<li>socksProxyHost (default: <none>)</li>
 * 			<li>socksProxyPort (default: 1080)</li>
 * 			<li>socksProxyVersion (default: 5)</li>
 * 			<li>java.net.socks.username (default: <none>)</li>
 * 			<li>java.net.socks.password (default: <none>)</li>
 * 		</ul>
 * 	</li>
 * 	<li>java.net.useSystemProxies (default: false)</li>
 * </ul>
 * 
 * Misc HTTP URL stream protocol handler properties
 * <ul>
 * 	<li>http.agent (default: “Java/<version>”)</li>
 * 	<li>http.keepalive (default: true)</li>
 * 	<li>http.maxConnections (default: 5)</li>
 * 	<li>http.maxRedirects (default: 20)</li>
 * 	<li>http.auth.digest.validateServer (default: false)</li>
 * 	<li>http.auth.digest.validateProxy (default: false)</li>
 * 	<li>http.auth.digest.cnonceRepeat (default: 5)</li>
 * 	<li>http.auth.ntlm.domain (default: <none>)</li>
 * </ul>
 * 
 * Address Cache
 * <ul>
 * 	<li>networkaddress.cache.ttl (default: see below)</li>
 * 	<li>networkaddress.cache.negative.ttl (default: 10)</li>
 * </ul>
 */
package org.self.net;
