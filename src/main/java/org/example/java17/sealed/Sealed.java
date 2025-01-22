package org.example.java17.sealed;

sealed public interface Sealed permits FlashyLight, GreenLight, RedLight, YellowLight {
}

final class RedLight implements Sealed{}
final class GreenLight implements Sealed{}
final class YellowLight implements Sealed{}