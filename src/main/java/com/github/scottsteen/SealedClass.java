package com.github.scottsteen;

public sealed interface SealedClass permits SealedClass.PermittedClass {

    final class PermittedClass implements SealedClass {}
}
