package net.engineeringdigest.journalApp.service;


import net.engineeringdigest.journalApp.entity.User;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class UserArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
         return Stream.of(
                 Arguments.of(User.builder().username("Nisha").password("nisha").build()),
                 Arguments.of(User.builder().username("Ram").password("ram").build()),
                 Arguments.of(User.builder().username("Mayank").password("mayank").build()),
                 Arguments.of(User.builder().username("Shashank").password("shashank").build()),
                 Arguments.of(User.builder().username("vipul").password("vipul").build())
         );
    }
}
