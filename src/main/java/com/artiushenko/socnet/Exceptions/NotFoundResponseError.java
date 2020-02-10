package com.artiushenko.socnet.Exceptions;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotFoundResponseError extends Error{
    public  NotFoundResponseError(String className, UUID id) {
        super(String.format("Can't find %s with id %s", className, id.toString()));
    }
}
