package com.marcel.lavrigne.services;

import java.util.Set;

public interface EnumService {

    @SuppressWarnings("rawtypes")
	Set<Enum> get(String name);

}