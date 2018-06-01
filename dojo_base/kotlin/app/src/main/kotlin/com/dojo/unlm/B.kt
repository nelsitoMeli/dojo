package com.dojo.unlm

class B {
    override fun equals(other: Any?): Boolean {
        return javaClass.name.equals(other?.javaClass?.name)
    }
}