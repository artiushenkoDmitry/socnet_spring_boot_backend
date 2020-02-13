package com.artiushenko.socnet.exceptions;

import java.util.UUID;

public class NotFoundResponseError extends Error{
    public  NotFoundResponseError(String className, UUID id) {
        super(String.format("Can't find %s with id %s", className, id.toString()));
    }
}
