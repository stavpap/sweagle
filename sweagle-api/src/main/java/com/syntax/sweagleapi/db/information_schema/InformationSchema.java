/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema;


import com.syntax.sweagleapi.db.DefaultCatalog;
import com.syntax.sweagleapi.db.information_schema.tables.CharacterSets;
import com.syntax.sweagleapi.db.information_schema.tables.CheckConstraints;
import com.syntax.sweagleapi.db.information_schema.tables.CollationCharacterSetApplicability;
import com.syntax.sweagleapi.db.information_schema.tables.Collations;
import com.syntax.sweagleapi.db.information_schema.tables.ColumnPrivileges;
import com.syntax.sweagleapi.db.information_schema.tables.ColumnStatistics;
import com.syntax.sweagleapi.db.information_schema.tables.Columns;
import com.syntax.sweagleapi.db.information_schema.tables.Engines;
import com.syntax.sweagleapi.db.information_schema.tables.Events;
import com.syntax.sweagleapi.db.information_schema.tables.Files;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbBufferPage;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbBufferPageLru;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbBufferPoolStats;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbCachedIndexes;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbCmp;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpPerIndex;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpPerIndexReset;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpReset;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpmem;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpmemReset;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbColumns;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbDatafiles;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbFields;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbForeign;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbForeignCols;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbFtBeingDeleted;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbFtConfig;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbFtDefaultStopword;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbFtDeleted;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbFtIndexCache;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbFtIndexTable;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbIndexes;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbMetrics;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbSessionTempTablespaces;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbTables;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbTablespaces;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbTablespacesBrief;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbTablestats;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbTempTableInfo;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbTrx;
import com.syntax.sweagleapi.db.information_schema.tables.InnodbVirtual;
import com.syntax.sweagleapi.db.information_schema.tables.KeyColumnUsage;
import com.syntax.sweagleapi.db.information_schema.tables.Keywords;
import com.syntax.sweagleapi.db.information_schema.tables.OptimizerTrace;
import com.syntax.sweagleapi.db.information_schema.tables.Parameters;
import com.syntax.sweagleapi.db.information_schema.tables.Partitions;
import com.syntax.sweagleapi.db.information_schema.tables.Plugins;
import com.syntax.sweagleapi.db.information_schema.tables.Processlist;
import com.syntax.sweagleapi.db.information_schema.tables.Profiling;
import com.syntax.sweagleapi.db.information_schema.tables.ReferentialConstraints;
import com.syntax.sweagleapi.db.information_schema.tables.ResourceGroups;
import com.syntax.sweagleapi.db.information_schema.tables.Routines;
import com.syntax.sweagleapi.db.information_schema.tables.SchemaPrivileges;
import com.syntax.sweagleapi.db.information_schema.tables.Schemata;
import com.syntax.sweagleapi.db.information_schema.tables.StGeometryColumns;
import com.syntax.sweagleapi.db.information_schema.tables.StSpatialReferenceSystems;
import com.syntax.sweagleapi.db.information_schema.tables.StUnitsOfMeasure;
import com.syntax.sweagleapi.db.information_schema.tables.Statistics;
import com.syntax.sweagleapi.db.information_schema.tables.TableConstraints;
import com.syntax.sweagleapi.db.information_schema.tables.TablePrivileges;
import com.syntax.sweagleapi.db.information_schema.tables.Tables;
import com.syntax.sweagleapi.db.information_schema.tables.Tablespaces;
import com.syntax.sweagleapi.db.information_schema.tables.Triggers;
import com.syntax.sweagleapi.db.information_schema.tables.UserPrivileges;
import com.syntax.sweagleapi.db.information_schema.tables.ViewRoutineUsage;
import com.syntax.sweagleapi.db.information_schema.tables.ViewTableUsage;
import com.syntax.sweagleapi.db.information_schema.tables.Views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = -446066358;

    /**
     * The reference instance of <code>information_schema</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table <code>information_schema.CHARACTER_SETS</code>.
     */
    public final CharacterSets CHARACTER_SETS = com.syntax.sweagleapi.db.information_schema.tables.CharacterSets.CHARACTER_SETS;

    /**
     * The table <code>information_schema.CHECK_CONSTRAINTS</code>.
     */
    public final CheckConstraints CHECK_CONSTRAINTS = com.syntax.sweagleapi.db.information_schema.tables.CheckConstraints.CHECK_CONSTRAINTS;

    /**
     * The table <code>information_schema.COLLATION_CHARACTER_SET_APPLICABILITY</code>.
     */
    public final CollationCharacterSetApplicability COLLATION_CHARACTER_SET_APPLICABILITY = com.syntax.sweagleapi.db.information_schema.tables.CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY;

    /**
     * The table <code>information_schema.COLLATIONS</code>.
     */
    public final Collations COLLATIONS = com.syntax.sweagleapi.db.information_schema.tables.Collations.COLLATIONS;

    /**
     * The table <code>information_schema.COLUMN_PRIVILEGES</code>.
     */
    public final ColumnPrivileges COLUMN_PRIVILEGES = com.syntax.sweagleapi.db.information_schema.tables.ColumnPrivileges.COLUMN_PRIVILEGES;

    /**
     * The table <code>information_schema.COLUMN_STATISTICS</code>.
     */
    public final ColumnStatistics COLUMN_STATISTICS = com.syntax.sweagleapi.db.information_schema.tables.ColumnStatistics.COLUMN_STATISTICS;

    /**
     * The table <code>information_schema.COLUMNS</code>.
     */
    public final Columns COLUMNS = com.syntax.sweagleapi.db.information_schema.tables.Columns.COLUMNS;

    /**
     * The table <code>information_schema.ENGINES</code>.
     */
    public final Engines ENGINES = com.syntax.sweagleapi.db.information_schema.tables.Engines.ENGINES;

    /**
     * The table <code>information_schema.EVENTS</code>.
     */
    public final Events EVENTS = com.syntax.sweagleapi.db.information_schema.tables.Events.EVENTS;

    /**
     * The table <code>information_schema.FILES</code>.
     */
    public final Files FILES = com.syntax.sweagleapi.db.information_schema.tables.Files.FILES;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE</code>.
     */
    public final InnodbBufferPage INNODB_BUFFER_PAGE = com.syntax.sweagleapi.db.information_schema.tables.InnodbBufferPage.INNODB_BUFFER_PAGE;

    /**
     * The table <code>information_schema.INNODB_BUFFER_PAGE_LRU</code>.
     */
    public final InnodbBufferPageLru INNODB_BUFFER_PAGE_LRU = com.syntax.sweagleapi.db.information_schema.tables.InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU;

    /**
     * The table <code>information_schema.INNODB_BUFFER_POOL_STATS</code>.
     */
    public final InnodbBufferPoolStats INNODB_BUFFER_POOL_STATS = com.syntax.sweagleapi.db.information_schema.tables.InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS;

    /**
     * The table <code>information_schema.INNODB_CACHED_INDEXES</code>.
     */
    public final InnodbCachedIndexes INNODB_CACHED_INDEXES = com.syntax.sweagleapi.db.information_schema.tables.InnodbCachedIndexes.INNODB_CACHED_INDEXES;

    /**
     * The table <code>information_schema.INNODB_CMP</code>.
     */
    public final InnodbCmp INNODB_CMP = com.syntax.sweagleapi.db.information_schema.tables.InnodbCmp.INNODB_CMP;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX</code>.
     */
    public final InnodbCmpPerIndex INNODB_CMP_PER_INDEX = com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpPerIndex.INNODB_CMP_PER_INDEX;

    /**
     * The table <code>information_schema.INNODB_CMP_PER_INDEX_RESET</code>.
     */
    public final InnodbCmpPerIndexReset INNODB_CMP_PER_INDEX_RESET = com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET;

    /**
     * The table <code>information_schema.INNODB_CMP_RESET</code>.
     */
    public final InnodbCmpReset INNODB_CMP_RESET = com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpReset.INNODB_CMP_RESET;

    /**
     * The table <code>information_schema.INNODB_CMPMEM</code>.
     */
    public final InnodbCmpmem INNODB_CMPMEM = com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpmem.INNODB_CMPMEM;

    /**
     * The table <code>information_schema.INNODB_CMPMEM_RESET</code>.
     */
    public final InnodbCmpmemReset INNODB_CMPMEM_RESET = com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpmemReset.INNODB_CMPMEM_RESET;

    /**
     * The table <code>information_schema.INNODB_COLUMNS</code>.
     */
    public final InnodbColumns INNODB_COLUMNS = com.syntax.sweagleapi.db.information_schema.tables.InnodbColumns.INNODB_COLUMNS;

    /**
     * The table <code>information_schema.INNODB_DATAFILES</code>.
     */
    public final InnodbDatafiles INNODB_DATAFILES = com.syntax.sweagleapi.db.information_schema.tables.InnodbDatafiles.INNODB_DATAFILES;

    /**
     * The table <code>information_schema.INNODB_FIELDS</code>.
     */
    public final InnodbFields INNODB_FIELDS = com.syntax.sweagleapi.db.information_schema.tables.InnodbFields.INNODB_FIELDS;

    /**
     * The table <code>information_schema.INNODB_FOREIGN</code>.
     */
    public final InnodbForeign INNODB_FOREIGN = com.syntax.sweagleapi.db.information_schema.tables.InnodbForeign.INNODB_FOREIGN;

    /**
     * The table <code>information_schema.INNODB_FOREIGN_COLS</code>.
     */
    public final InnodbForeignCols INNODB_FOREIGN_COLS = com.syntax.sweagleapi.db.information_schema.tables.InnodbForeignCols.INNODB_FOREIGN_COLS;

    /**
     * The table <code>information_schema.INNODB_FT_BEING_DELETED</code>.
     */
    public final InnodbFtBeingDeleted INNODB_FT_BEING_DELETED = com.syntax.sweagleapi.db.information_schema.tables.InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_CONFIG</code>.
     */
    public final InnodbFtConfig INNODB_FT_CONFIG = com.syntax.sweagleapi.db.information_schema.tables.InnodbFtConfig.INNODB_FT_CONFIG;

    /**
     * The table <code>information_schema.INNODB_FT_DEFAULT_STOPWORD</code>.
     */
    public final InnodbFtDefaultStopword INNODB_FT_DEFAULT_STOPWORD = com.syntax.sweagleapi.db.information_schema.tables.InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD;

    /**
     * The table <code>information_schema.INNODB_FT_DELETED</code>.
     */
    public final InnodbFtDeleted INNODB_FT_DELETED = com.syntax.sweagleapi.db.information_schema.tables.InnodbFtDeleted.INNODB_FT_DELETED;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_CACHE</code>.
     */
    public final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = com.syntax.sweagleapi.db.information_schema.tables.InnodbFtIndexCache.INNODB_FT_INDEX_CACHE;

    /**
     * The table <code>information_schema.INNODB_FT_INDEX_TABLE</code>.
     */
    public final InnodbFtIndexTable INNODB_FT_INDEX_TABLE = com.syntax.sweagleapi.db.information_schema.tables.InnodbFtIndexTable.INNODB_FT_INDEX_TABLE;

    /**
     * The table <code>information_schema.INNODB_INDEXES</code>.
     */
    public final InnodbIndexes INNODB_INDEXES = com.syntax.sweagleapi.db.information_schema.tables.InnodbIndexes.INNODB_INDEXES;

    /**
     * The table <code>information_schema.INNODB_METRICS</code>.
     */
    public final InnodbMetrics INNODB_METRICS = com.syntax.sweagleapi.db.information_schema.tables.InnodbMetrics.INNODB_METRICS;

    /**
     * The table <code>information_schema.INNODB_SESSION_TEMP_TABLESPACES</code>.
     */
    public final InnodbSessionTempTablespaces INNODB_SESSION_TEMP_TABLESPACES = com.syntax.sweagleapi.db.information_schema.tables.InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES;

    /**
     * The table <code>information_schema.INNODB_TABLES</code>.
     */
    public final InnodbTables INNODB_TABLES = com.syntax.sweagleapi.db.information_schema.tables.InnodbTables.INNODB_TABLES;

    /**
     * The table <code>information_schema.INNODB_TABLESPACES</code>.
     */
    public final InnodbTablespaces INNODB_TABLESPACES = com.syntax.sweagleapi.db.information_schema.tables.InnodbTablespaces.INNODB_TABLESPACES;

    /**
     * The table <code>information_schema.INNODB_TABLESPACES_BRIEF</code>.
     */
    public final InnodbTablespacesBrief INNODB_TABLESPACES_BRIEF = com.syntax.sweagleapi.db.information_schema.tables.InnodbTablespacesBrief.INNODB_TABLESPACES_BRIEF;

    /**
     * The table <code>information_schema.INNODB_TABLESTATS</code>.
     */
    public final InnodbTablestats INNODB_TABLESTATS = com.syntax.sweagleapi.db.information_schema.tables.InnodbTablestats.INNODB_TABLESTATS;

    /**
     * The table <code>information_schema.INNODB_TEMP_TABLE_INFO</code>.
     */
    public final InnodbTempTableInfo INNODB_TEMP_TABLE_INFO = com.syntax.sweagleapi.db.information_schema.tables.InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO;

    /**
     * The table <code>information_schema.INNODB_TRX</code>.
     */
    public final InnodbTrx INNODB_TRX = com.syntax.sweagleapi.db.information_schema.tables.InnodbTrx.INNODB_TRX;

    /**
     * The table <code>information_schema.INNODB_VIRTUAL</code>.
     */
    public final InnodbVirtual INNODB_VIRTUAL = com.syntax.sweagleapi.db.information_schema.tables.InnodbVirtual.INNODB_VIRTUAL;

    /**
     * The table <code>information_schema.KEY_COLUMN_USAGE</code>.
     */
    public final KeyColumnUsage KEY_COLUMN_USAGE = com.syntax.sweagleapi.db.information_schema.tables.KeyColumnUsage.KEY_COLUMN_USAGE;

    /**
     * The table <code>information_schema.KEYWORDS</code>.
     */
    public final Keywords KEYWORDS = com.syntax.sweagleapi.db.information_schema.tables.Keywords.KEYWORDS;

    /**
     * The table <code>information_schema.OPTIMIZER_TRACE</code>.
     */
    public final OptimizerTrace OPTIMIZER_TRACE = com.syntax.sweagleapi.db.information_schema.tables.OptimizerTrace.OPTIMIZER_TRACE;

    /**
     * The table <code>information_schema.PARAMETERS</code>.
     */
    public final Parameters PARAMETERS = com.syntax.sweagleapi.db.information_schema.tables.Parameters.PARAMETERS;

    /**
     * The table <code>information_schema.PARTITIONS</code>.
     */
    public final Partitions PARTITIONS = com.syntax.sweagleapi.db.information_schema.tables.Partitions.PARTITIONS;

    /**
     * The table <code>information_schema.PLUGINS</code>.
     */
    public final Plugins PLUGINS = com.syntax.sweagleapi.db.information_schema.tables.Plugins.PLUGINS;

    /**
     * The table <code>information_schema.PROCESSLIST</code>.
     */
    public final Processlist PROCESSLIST = com.syntax.sweagleapi.db.information_schema.tables.Processlist.PROCESSLIST;

    /**
     * The table <code>information_schema.PROFILING</code>.
     */
    public final Profiling PROFILING = com.syntax.sweagleapi.db.information_schema.tables.Profiling.PROFILING;

    /**
     * The table <code>information_schema.REFERENTIAL_CONSTRAINTS</code>.
     */
    public final ReferentialConstraints REFERENTIAL_CONSTRAINTS = com.syntax.sweagleapi.db.information_schema.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS;

    /**
     * The table <code>information_schema.RESOURCE_GROUPS</code>.
     */
    public final ResourceGroups RESOURCE_GROUPS = com.syntax.sweagleapi.db.information_schema.tables.ResourceGroups.RESOURCE_GROUPS;

    /**
     * The table <code>information_schema.ROUTINES</code>.
     */
    public final Routines ROUTINES = com.syntax.sweagleapi.db.information_schema.tables.Routines.ROUTINES;

    /**
     * The table <code>information_schema.SCHEMA_PRIVILEGES</code>.
     */
    public final SchemaPrivileges SCHEMA_PRIVILEGES = com.syntax.sweagleapi.db.information_schema.tables.SchemaPrivileges.SCHEMA_PRIVILEGES;

    /**
     * The table <code>information_schema.SCHEMATA</code>.
     */
    public final Schemata SCHEMATA = com.syntax.sweagleapi.db.information_schema.tables.Schemata.SCHEMATA;

    /**
     * The table <code>information_schema.ST_GEOMETRY_COLUMNS</code>.
     */
    public final StGeometryColumns ST_GEOMETRY_COLUMNS = com.syntax.sweagleapi.db.information_schema.tables.StGeometryColumns.ST_GEOMETRY_COLUMNS;

    /**
     * The table <code>information_schema.ST_SPATIAL_REFERENCE_SYSTEMS</code>.
     */
    public final StSpatialReferenceSystems ST_SPATIAL_REFERENCE_SYSTEMS = com.syntax.sweagleapi.db.information_schema.tables.StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS;

    /**
     * The table <code>information_schema.ST_UNITS_OF_MEASURE</code>.
     */
    public final StUnitsOfMeasure ST_UNITS_OF_MEASURE = com.syntax.sweagleapi.db.information_schema.tables.StUnitsOfMeasure.ST_UNITS_OF_MEASURE;

    /**
     * The table <code>information_schema.STATISTICS</code>.
     */
    public final Statistics STATISTICS = com.syntax.sweagleapi.db.information_schema.tables.Statistics.STATISTICS;

    /**
     * The table <code>information_schema.TABLE_CONSTRAINTS</code>.
     */
    public final TableConstraints TABLE_CONSTRAINTS = com.syntax.sweagleapi.db.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

    /**
     * The table <code>information_schema.TABLE_PRIVILEGES</code>.
     */
    public final TablePrivileges TABLE_PRIVILEGES = com.syntax.sweagleapi.db.information_schema.tables.TablePrivileges.TABLE_PRIVILEGES;

    /**
     * The table <code>information_schema.TABLES</code>.
     */
    public final Tables TABLES = com.syntax.sweagleapi.db.information_schema.tables.Tables.TABLES;

    /**
     * The table <code>information_schema.TABLESPACES</code>.
     */
    public final Tablespaces TABLESPACES = com.syntax.sweagleapi.db.information_schema.tables.Tablespaces.TABLESPACES;

    /**
     * The table <code>information_schema.TRIGGERS</code>.
     */
    public final Triggers TRIGGERS = com.syntax.sweagleapi.db.information_schema.tables.Triggers.TRIGGERS;

    /**
     * The table <code>information_schema.USER_PRIVILEGES</code>.
     */
    public final UserPrivileges USER_PRIVILEGES = com.syntax.sweagleapi.db.information_schema.tables.UserPrivileges.USER_PRIVILEGES;

    /**
     * The table <code>information_schema.VIEW_ROUTINE_USAGE</code>.
     */
    public final ViewRoutineUsage VIEW_ROUTINE_USAGE = com.syntax.sweagleapi.db.information_schema.tables.ViewRoutineUsage.VIEW_ROUTINE_USAGE;

    /**
     * The table <code>information_schema.VIEW_TABLE_USAGE</code>.
     */
    public final ViewTableUsage VIEW_TABLE_USAGE = com.syntax.sweagleapi.db.information_schema.tables.ViewTableUsage.VIEW_TABLE_USAGE;

    /**
     * The table <code>information_schema.VIEWS</code>.
     */
    public final Views VIEWS = com.syntax.sweagleapi.db.information_schema.tables.Views.VIEWS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("information_schema", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            CharacterSets.CHARACTER_SETS,
            CheckConstraints.CHECK_CONSTRAINTS,
            CollationCharacterSetApplicability.COLLATION_CHARACTER_SET_APPLICABILITY,
            Collations.COLLATIONS,
            ColumnPrivileges.COLUMN_PRIVILEGES,
            ColumnStatistics.COLUMN_STATISTICS,
            Columns.COLUMNS,
            Engines.ENGINES,
            Events.EVENTS,
            Files.FILES,
            InnodbBufferPage.INNODB_BUFFER_PAGE,
            InnodbBufferPageLru.INNODB_BUFFER_PAGE_LRU,
            InnodbBufferPoolStats.INNODB_BUFFER_POOL_STATS,
            InnodbCachedIndexes.INNODB_CACHED_INDEXES,
            InnodbCmp.INNODB_CMP,
            InnodbCmpPerIndex.INNODB_CMP_PER_INDEX,
            InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET,
            InnodbCmpReset.INNODB_CMP_RESET,
            InnodbCmpmem.INNODB_CMPMEM,
            InnodbCmpmemReset.INNODB_CMPMEM_RESET,
            InnodbColumns.INNODB_COLUMNS,
            InnodbDatafiles.INNODB_DATAFILES,
            InnodbFields.INNODB_FIELDS,
            InnodbForeign.INNODB_FOREIGN,
            InnodbForeignCols.INNODB_FOREIGN_COLS,
            InnodbFtBeingDeleted.INNODB_FT_BEING_DELETED,
            InnodbFtConfig.INNODB_FT_CONFIG,
            InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD,
            InnodbFtDeleted.INNODB_FT_DELETED,
            InnodbFtIndexCache.INNODB_FT_INDEX_CACHE,
            InnodbFtIndexTable.INNODB_FT_INDEX_TABLE,
            InnodbIndexes.INNODB_INDEXES,
            InnodbMetrics.INNODB_METRICS,
            InnodbSessionTempTablespaces.INNODB_SESSION_TEMP_TABLESPACES,
            InnodbTables.INNODB_TABLES,
            InnodbTablespaces.INNODB_TABLESPACES,
            InnodbTablespacesBrief.INNODB_TABLESPACES_BRIEF,
            InnodbTablestats.INNODB_TABLESTATS,
            InnodbTempTableInfo.INNODB_TEMP_TABLE_INFO,
            InnodbTrx.INNODB_TRX,
            InnodbVirtual.INNODB_VIRTUAL,
            KeyColumnUsage.KEY_COLUMN_USAGE,
            Keywords.KEYWORDS,
            OptimizerTrace.OPTIMIZER_TRACE,
            Parameters.PARAMETERS,
            Partitions.PARTITIONS,
            Plugins.PLUGINS,
            Processlist.PROCESSLIST,
            Profiling.PROFILING,
            ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
            ResourceGroups.RESOURCE_GROUPS,
            Routines.ROUTINES,
            SchemaPrivileges.SCHEMA_PRIVILEGES,
            Schemata.SCHEMATA,
            StGeometryColumns.ST_GEOMETRY_COLUMNS,
            StSpatialReferenceSystems.ST_SPATIAL_REFERENCE_SYSTEMS,
            StUnitsOfMeasure.ST_UNITS_OF_MEASURE,
            Statistics.STATISTICS,
            TableConstraints.TABLE_CONSTRAINTS,
            TablePrivileges.TABLE_PRIVILEGES,
            Tables.TABLES,
            Tablespaces.TABLESPACES,
            Triggers.TRIGGERS,
            UserPrivileges.USER_PRIVILEGES,
            ViewRoutineUsage.VIEW_ROUTINE_USAGE,
            ViewTableUsage.VIEW_TABLE_USAGE,
            Views.VIEWS);
    }
}
