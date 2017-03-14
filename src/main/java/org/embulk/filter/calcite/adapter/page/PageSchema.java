package org.embulk.filter.calcite.adapter.page;

import com.google.common.collect.ImmutableMap;
import org.apache.calcite.schema.Table;
import org.apache.calcite.schema.impl.AbstractSchema;
import org.embulk.filter.calcite.PageConverter;
import org.embulk.spi.Schema;

import java.util.Map;

public class PageSchema
        extends AbstractSchema
{
    public static Schema schema;

    public PageSchema()
    {
        super();
    }

    @Override
    protected Map<String, Table> getTableMap()
    {
        return ImmutableMap.<String, Table>of("$PAGES", new PageTable(schema, null));
    }
}
