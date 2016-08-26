package ru.misha.web;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ru.misha.model.StackSite;
import ru.misha.service.StackService;
import ru.misha.web.StackController;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@Ignore
@RunWith(MockitoJUnitRunner.class)
public class StackControllerTest {

    @Mock
    private StackService stackService;
    @InjectMocks
    StackController sut;

    //Unit test
    @Test
    public void testGetListSite() throws Exception {
//        //prepare
//        when(stackService.findAll()).thenReturn(ImmutableList.of());
//        //Ctr + Alt + V	Выделение переменной
//        List<StackSite> listSite = sut.getListSite();
//        //validate
//        verify(stackService).findAll();
    }
}