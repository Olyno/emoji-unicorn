# emoji-unicorn

A simple Java librairy based on [emoji4j](https://github.com/kcthota/emoji4j) and using [emojis-list](https://github.com/Olyno/emojis-list)'s tool to be every time up to date.

 * ⚡ Fast: emoji-unicorn will load only 1 times all emojis, that's all
 * 💪 Flexbile: Get an emoji from its name, emoji, or unicode
 * 🧠 Human logic: All syntaxes are easy to understand and to use

## Getting started

First, you need to add the JitPack repository at the END of all your repositories. Emoji-unicorn is not available in Maven Central.

```groovy
repositories {
    jcenter()
    ...
    maven {
        url 'https://jitpack.io'
    }
}
```

or if you use Maven

```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Then you will also need to add Gami as a dependency.

```groovy
dependencies {
    implementation 'com.github.Olyno:emoji-unicorn:[versionTag]'
}
```

or if you use Maven

```
<dependency>
    <groupId>com.github.Olyno</groupId>
    <artifactId>emoji-unicorn</artifactId>
    <version>[versionTag]</version>
</dependency>
```

## Usage

```java
public class App {

    public static main(String[] args) {
        EmojiUnicorn unicorn = new EmojiUnicorn();
        Emoji emoji = unicorn.getEmoji('unicorn');
        System.out.println('Look my awesome unicorn: ' + emoji.getEmoji()); // Look my awesome unicorn: 🦄
        System.out.println('Her name is: ' + emoji.getName()); // Her name is: unicorn
        System.out.println('I can reproduce her using the unicode: ' + emoji.getUnicode()); // I can reproduce her using the unicode: U+1F984
        System.out.println('And here names that my friends gave to her: ' + Arrays.asList(emoji.getShortNames()).toString()); // And here names that my friends gave to her: [:unicorn:, :unicorn_face:]
    }

}
```

## Documentation

All documentation is available [here](https://olyno.github.io/emoji-unicorn).

## Buy me a ko-fi

Whether you use this project, have learned something from it, or just like it, please consider supporting it by buying me a coffee, so I can dedicate more time on open-source projects like this 😉 (personally I prefer hot chocolate but whatever)

[![ko-fi](https://www.ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/olyno)

## License

Code released under GNU GPLv3 license.

Copyright ©, [Olyno](https://github.com/Olyno).