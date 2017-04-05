# UserAgentProvider
Random User Agent string provider for Java.

## Maven dependency:

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```
```xml
<dependency>
    <groupId>com.github.mdebenito</groupId>
    <artifactId>CrawlerUtils</artifactId>
    <version>master-SNAPSHOT</version>
</dependency>
```

## Javadoc

<h3>Constructor Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Constructor Summary table, listing constructors, and an explanation">
<tr>
<th class="colOne" scope="col">Constructor and Description</th>
</tr>
<tr class="altColor">
<td class="colOne"><code><span class="memberNameLink"><a href="../wrapper/CrawlerUtils.html#CrawlerUtils--">CrawlerUtils</a></span>()</code>
<div class="block">Default constructor.</div>
</td>
</tr>
</table>


<h3>Method Summary</h3>
<table class="memberSummary" border="0" cellpadding="3" cellspacing="0" summary="Method Summary table, listing methods, and an explanation">
<tr>
<th class="colFirst" scope="col">Modifier and Type</th>
<th class="colLast" scope="col">Method and Description</th>
</tr>
<tr id="i0" class="altColor">
<td class="colFirst"><code>java.lang.String</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../wrapper/CrawlerUtils.html#getRandomUserString--">getRandomUserString</a></span>()</code>
<div class="block">Randomly selects one of the configured User Agent strings and returns it.</div>
</td>
</tr>
<tr id="i1" class="rowColor">
<td class="colFirst"><code>int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../wrapper/CrawlerUtils.html#randomPause--">randomPause</a></span>()</code>
<div class="block">Pauses the thread for a random amount of milliseconds between MIN_MILLIS and MAX_MILLIS</div>
</td>
</tr>
<tr id="i2" class="altColor">
<td class="colFirst"><code>int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../wrapper/CrawlerUtils.html#randomPause-int-">randomPause</a></span>(int&nbsp;refMillis)</code>
<div class="block">Pauses the thread for a random amount of milliseconds between 0 and refmillis*2</div>
</td>
</tr>
<tr id="i3" class="rowColor">
<td class="colFirst"><code>int</code></td>
<td class="colLast"><code><span class="memberNameLink"><a href="../wrapper/CrawlerUtils.html#randomPause-int-int-">randomPause</a></span>(int&nbsp;min,
           int&nbsp;max)</code>
<div class="block">Pauses the thread for a random amount of milliseconds between min and max values</div>
</td>
</tr>
</table>

<h3>Constructor Detail</h3>
<a name="CrawlerUtils--">
<!--   -->
</a>
<ul class="blockListLast">
<li class="blockList">
<h4>CrawlerUtils</h4>
<pre>public&nbsp;CrawlerUtils()
             throws java.io.FileNotFoundException</pre>
<div class="block">Default constructor. Initializes the different crawling utilities</div>
<dl>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.io.FileNotFoundException</code></dd>
</dl>
</li>
</ul>
</li>
</ul>

<h3>Method Detail</h3>
<a name="randomPause--">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>randomPause</h4>
<pre>public&nbsp;int&nbsp;randomPause()
                throws java.lang.InterruptedException</pre>
<div class="block">Pauses the thread for a random amount of milliseconds between MIN_MILLIS and MAX_MILLIS</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>milliseconds paused</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.lang.InterruptedException</code></dd>
</dl>
</li>
</ul>
<a name="randomPause-int-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>randomPause</h4>
<pre>public&nbsp;int&nbsp;randomPause(int&nbsp;min,
                       int&nbsp;max)
                throws java.lang.InterruptedException</pre>
<div class="block">Pauses the thread for a random amount of milliseconds between min and max values</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>max</code> - Maximum amount of milliseconds to pause</dd>
<dd><code>min</code> - Minimum amount of milliseconds paused</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>milliseconds paused</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.lang.InterruptedException</code></dd>
</dl>
</li>
</ul>
<a name="randomPause-int-">
<!--   -->
</a>
<ul class="blockList">
<li class="blockList">
<h4>randomPause</h4>
<pre>public&nbsp;int&nbsp;randomPause(int&nbsp;refMillis)
                throws java.lang.InterruptedException</pre>
<div class="block">Pauses the thread for a random amount of milliseconds between 0 and refmillis*2</div>
<dl>
<dt><span class="paramLabel">Parameters:</span></dt>
<dd><code>refMillis</code> - reference milliseconds</dd>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>milliseconds paused</dd>
<dt><span class="throwsLabel">Throws:</span></dt>
<dd><code>java.lang.InterruptedException</code></dd>
</dl>
</li>
</ul>
<a name="getRandomUserString--">
<!--   -->
</a>
<ul class="blockListLast">
<li class="blockList">
<h4>getRandomUserString</h4>
<pre>public&nbsp;java.lang.String&nbsp;getRandomUserString()</pre>
<div class="block">Randomly selects one of the configured User Agent strings and returns it.</div>
<dl>
<dt><span class="returnLabel">Returns:</span></dt>
<dd>A random User Agent string.</dd>
</dl>
</li>
</ul>
</li>
</ul>
</li>
</ul>
</div>