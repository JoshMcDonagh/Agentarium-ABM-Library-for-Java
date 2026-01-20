/**
 * Result recording and retrieval for Modelarium simulations.
 *
 * <p>This package defines the abstractions used to collect, store, and access
 * data produced during a simulation run. Results provide a structured way to
 * record model state over time, capture events, and compute summaries without
 * entangling analysis concerns with core simulation logic.</p>
 *
 * <p>Result collection is typically configured at model setup time and updated
 * during simulation execution. Implementations may support different storage
 * strategies, such as in-memory recording for smaller runs or persistent
 * backends for larger experiments.</p>
 *
 * <p>Users generally interact with results through high-level result objects
 * and query interfaces, rather than writing directly to storage formats.</p>
 */
package modelarium.results;
