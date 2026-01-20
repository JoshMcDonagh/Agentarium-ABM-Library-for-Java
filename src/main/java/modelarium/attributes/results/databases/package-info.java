/**
 * Database-backed storage for attribute-based simulation results.
 *
 * <p>This package contains implementations that persist attribute result data
 * using database-backed storage mechanisms. These components are intended for
 * scenarios where result volumes are large, long-running simulations are used,
 * or in-memory storage would be impractical.</p>
 *
 * <p>The database layer abstracts over the underlying persistence technology,
 * allowing result recording and querying to be expressed in terms of attributes
 * rather than database-specific concerns.</p>
 *
 * <p>Users typically interact with these components through higher-level
 * results abstractions, and should not need to manage database connections
 * or schemas directly.</p>
 */
package modelarium.attributes.results.databases;
