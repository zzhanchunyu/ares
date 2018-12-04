package com.god.ares.command;

public interface Command<T> {

    String getName();

    APIResponse execute(T arg);

}